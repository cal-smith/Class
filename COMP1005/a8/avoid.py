from __future__ import division
import random
import pygame
import math

pygame.init()

width = 800
height = 800
size = (width, height)
screen = pygame.display.set_mode(size)
fps = 60
clock = pygame.time.Clock()

#background image loading and sizing
#source http://opengameart.org/node/21033
b = pygame.transform.scale(pygame.image.load("back.png"), size)
brect = b.get_rect()
brect.center = (height//2, width//2)

#background music streaming. This way we don't have to load the whole soundtrack into memory
#source: http://opengameart.org/content/dance-track-with-recorder-and-metallic-effects-c64-style
pygame.mixer.music.load("audio.ogg")
pygame.mixer.music.play(-1)

class Spaceship(object):
	def __init__(self, pos):
		self.pos = pos
		#source: http://opengameart.org/content/spaceship-9
		self.ship = pygame.image.load("ship.png")
		self.shiprect = self.ship.get_rect()
		self.exploded = False
		#source: http://opengameart.org/content/bombexplosion8bit and cut down a little
		self.explosion = pygame.mixer.Sound("explode.wav")
		self.duration = self.explosion.get_length()
		self.playing = False
		#accessors for collision detection
		self.image = self.ship
		self.rect = self.shiprect

	def move(self):
		if not self.exploded:
			self.pos = pygame.mouse.get_pos()
			self.shiprect.center = self.pos

	def explode(self):
		self.exploded = True
		if not self.playing:
			self.playing = True
			self.explosion.play(0)

	def draw(self):
		self.move()
		screen.blit(self.ship, self.shiprect)

class Asteroid(object):
	def __init__(self, pos, angle, speed):
		self.pos = pos
		self.angle = angle
		#source: class files
		self.image = pygame.transform.rotozoom(pygame.image.load("asteroid.png"), random.randint(0,360), random.uniform(0.5, 2.0))
		self.rect = self.image.get_rect()
		self.speed = speed
		self.exploded = False

	def move(self):
		if not self.exploded:
			dx = self.speed * math.cos(math.radians(self.angle))
			dy = self.speed * math.sin(math.radians(self.angle))
			self.pos = ( self.pos[0] + dx, self.pos[1] - dy )
			self.rect.center = self.pos

	def explode(self):
		self.exploded = True

	def onscreen(self):
		return screen.get_rect().colliderect(self.rect)

	def draw(self):
		self.move()
		#print self.onscreen()
		screen.blit(self.image, self.rect)

def collides(obj1, obj2):
	m1 = pygame.mask.from_surface(obj1.image)
	m2 = pygame.mask.from_surface(obj2.image)
	dx = obj2.rect.left - obj1.rect.left
	dy = obj2.rect.top - obj1.rect.top
	return m1.overlap(m2, (dx,dy)) != None
	
ship = Spaceship((0,0))
asteroids = [Asteroid((random.randint(0,width),random.randint(50,200)), random.randint(180,359), random.randint(2,7)) for i in range(6)]
soundtime = 0

while True:
	clock.tick(fps) 

	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()

	screen.blit(b, brect)
	ship.draw()
	for asteroid in asteroids:
		asteroid.draw()
		if collides(ship, asteroid):
			ship.explode()
			asteroid.explode()
			soundtime += 1
			if soundtime == int(ship.duration * 60):
				exit()
	asteroids = [asteroid for asteroid in asteroids if asteroid.onscreen()]
	while len(asteroids) < 6:
		asteroids.append(Asteroid((random.randint(0,width),random.randint(50,200)), random.randint(180,359), random.randint(2,7)))
	pygame.display.flip()
