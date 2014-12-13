from __future__ import division
import pygame

# initialize pygame
pygame.init()

# set up the screen
width = 640
height = 480
size = (width, height)
screen = pygame.display.set_mode(size)

class Ball(object):
	def __init__(self, speed=3, angle=2, image="ball.png"):
		self.ball = pygame.image.load(image)
		self.rect = self.ball.get_rect()
		self.position = [self.rect.center[0], height-self.rect.center[0]]
		self.speed = speed
		self.a = 0
		self.angle = -angle

	def linear_rotate(self):
		if self.position[0] < self.rect.center[0] or self.position[0] > width - self.rect.center[0]:
			self.speed = -self.speed
			self.angle = -self.angle
		self.a += self.angle
		ball = pygame.transform.rotate(self.ball, self.a)
		ballrekt = ball.get_rect()
		self.position[0] += self.speed
		ballrekt.center = self.position
		ballrekt = ballrekt.move(3, 3)
		screen.blit(ball, ballrekt)
		
	def draw(self):
		self.linear_rotate()

# specify how many frames per second should be drawn
fps = 60 # you may want to change this!

# set up the clock
clock = pygame.time.Clock()

ball = Ball(speed=7, angle=6)
while True:
	# draw a specified number of frames per second
	clock.tick(fps) 

	# check to see if the user wants to quit
	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()

	screen.fill((0,0,0))
	ball.draw()

	# draw everything onto the screen
	pygame.display.flip()