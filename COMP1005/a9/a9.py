from __future__ import division
import random
import pygame
import math
import json

pygame.init()

width = 800
height = 600
size = (width, height)
screen = pygame.display.set_mode(size)
fps = 60
clock = pygame.time.Clock()
text = pygame.font.Font(None, 50)

#so we dont have a huge level definition in the middle of the code
level = json.load(open("level.json"))

#background music, source: http://opengameart.org/content/the-rush
pygame.mixer.music.load("background.ogg")
pygame.mixer.music.play(-1)

def collide(obj1, obj2):
	m1 = pygame.mask.Mask(obj1.size)
	m2 = pygame.mask.Mask(obj2.size)
	m1.fill()
	m2.fill()
	dx = obj2.rect.left - obj1.rect.left
	dy = obj2.rect.top - obj1.rect.top
	return m1.overlap(m2, (dx,dy)) != None

#jump sound?
class Player(object):
	def __init__(self, screen, pos):
		self.screen = screen
		self.rect = pygame.Rect(pos, (40, 40))
		self.pos = pos
		self.speed = 5
		self.jump = 0
		self.jumps = 15
		self.falling = True
		self.collided = None
		self.mup = False
		self.mleft = False
		self.mright = False
		self.height = height
		self.size = (40,40)
		self.health = 100
		self.score = 0
		self.cooldown = 0
		#source: http://opengameart.org/content/8-bit-jump-free-sound-effects-1 (SFX_Jump_08.wav)
		self.sound = pygame.mixer.Sound("jump.wav")
		self.sound.set_volume(0.4)
		self.playing = False

	def hurt(self):
		if self.cooldown == 0:
			self.health -= 1
			self.cooldown = 2*fps

	def collide(self):
		if self.collided:
			if collide(self, self.collided) and self.rect.top <= self.collided.rect.bottom and self.rect.top >= self.collided.rect.top:
				#colliding with the bottom of things is good enough...
				self.rect.top = self.collided.rect.bottom
			if collide(self, self.collided):
				self.falling = False
				self.mup = False
				self.jumps = 15
				self.rect.bottom = self.collided.rect.top+1#+1 so we keep colliding until we jump
				self.playing = False
			else:
				self.falling = True

	def move(self):
		#jumping
		if self.mup:
			if not self.playing:
				self.sound.play(0)
				self.playing = True
			self.rect.bottom += -self.jumps
			self.jumps -= 1

		if not self.mup and self.falling:
			self.rect.bottom += 10

		if self.mleft:
			if self.rect.left > 100:
				self.rect = self.rect.move(-self.speed,0)
		if self.mright:
			if self.rect.right < width-100:
				self.rect = self.rect.move(self.speed,0)
			#move the blocks right to left when we max out right
			#move them left to right when we max out left

	def draw(self):
		if self.cooldown > 0:
			self.cooldown -= 1
		self.move()
		pygame.draw.rect(self.screen, (0,0,255), self.rect)

class Block(object):
	mleft = False
	mright = False
	speed = 5
	def __init__(self, screen, size, pos, floor=False):
		self.screen = screen
		self.size = size
		self.pos = pos
		self.floor = floor
		self.rect = pygame.Rect(pos, size)

	def move(self):
		if not self.floor:
			if Block.mleft:
				self.rect.left -= Block.speed
			elif Block.mright:
				self.rect.left += Block.speed

	def onscreen(self):
		return screen.get_rect().colliderect(self.rect)

	def draw(self):
		self.move()
		pygame.draw.rect(self.screen, (0,255,0), self.rect)

class Enemy(object):
	def __init__(self, screen, pos):
		self.pos = pos
		self.screen = screen
		self.rect = pygame.Rect(pos, (40, 40))
		self.size = (40,40)
		self.distance = 0
		self.mleft = True
		self.mright = False
		self.falling = True
		self.collided = None
		self.dead = False

	def kill(self):
		self.dead = True
		self.falling = True

	#falling/jumping
	def collide(self):
		if self.collided and not self.dead:
			if collide(self, self.collided):
				self.falling = False
				self.jumps = 10
				self.rect.bottom = self.collided.rect.top+1#+1 so we keep colliding
			else:
				self.falling = True
	def move(self):
		if self.falling:
			self.rect.bottom += 10
		if Block.mleft:
			self.rect.left -= Block.speed
		elif Block.mright:
			self.rect.left += Block.speed

		if not self.falling and not self.dead:
			if self.mleft:
				self.rect.left -= 1
			if self.mright:
				self.rect.left += 1

	def onscreen(self):
		return not self.rect.top > screen.get_rect().bottom

	def draw(self):
		self.move()
		#screen.blit(self.image, self.rect)
		pygame.draw.rect(self.screen, (255,0,0), self.rect)

class Bonus(object):
	total = 0
	#source: http://opengameart.org/content/star
	image = pygame.image.load("star.png")
	def __init__(self, screen, pos):
		self.screen = screen
		self.pos = pos
		self.size = (80,80)
		self.image = pygame.image.load("star.png")
		self.image = pygame.transform.scale(self.image, self.size)
		self.rect = self.image.get_rect()
		self.collided = None
		self.falling = True
		self.gotten = False
		#source: http://opengameart.org/content/level-up-power-up-coin-get-13-sounds (Rise01.aif) and converted to ogg
		self.sound = pygame.mixer.Sound("get.ogg")

	def got(self, player):
		self.sound.play(0)
		Bonus.total += 1
		if Bonus.total%4 == 0:
			player.score += 20
		elif Bonus.total%6 == 0 and player.health < 100:
			player.health += 5
		else:
			player.score += 10
		self.gotten = True

	#falling
	def collide(self):
		if self.collided:
			if collide(self, self.collided):
				self.falling = False
				self.rect.bottom = self.collided.rect.top+1#+1 so we keep colliding
			else:
				self.falling = True

	def move(self):
		if self.falling:
			self.rect.bottom += 10
		if Block.mleft:
			self.rect.left -= Block.speed
		elif Block.mright:
			self.rect.left += Block.speed

	def draw(self):
		self.move()
		screen.blit(self.image, self.rect)
		

blocks = [Block(screen, (block["size"]["x"],block["size"]["y"]), (block["pos"]["x"], height-block["pos"]["y"])) for block in level["blocks"]]
enemies = [Enemy(screen, (random.randint(-200,900),150)),Enemy(screen, (random.randint(-200,900),150)),Enemy(screen, (random.randint(-200,900),150)),Enemy(screen, (random.randint(-200,900),150)),Enemy(screen, (random.randint(-200,900),150))]
bonuses = [Bonus(screen, (400,150))]

floor = Block(screen, (width, 5000), (0, height-5), True)
player = Player(screen, (0, height-100))
level = 1
playing = 0
gamestate = 1 #so I can title screen
bonus_cooldown = 0
while gamestate == 1:
	clock.tick(fps)
	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()
		if event.type == pygame.MOUSEBUTTONDOWN:
			gamestate = 2
	screen.fill((0,0,0))
	play = text.render("Click to Start", True, (255,255,255))
	playrect = play.get_rect()
	playrect.center = (width//2, height//2)
	screen.blit(play, playrect)
	info = text.render("W A S D to move", True, (255,255,255))
	inforect = info.get_rect()
	inforect.center = (width//2, height//2+50)
	screen.blit(info, inforect)
	pygame.display.flip()

while gamestate == 2:
	clock.tick(fps) 

	playing += 1
	if playing == 5*fps:
		level += 1
		bonuses.append(Bonus(screen, (random.randint(-1000,1900), 150)))
		playing = 0

	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()
		if event.type == pygame.KEYDOWN:
			if pygame.key.name(event.key) == "a":
				player.mleft = True
				player.mright = False
			if pygame.key.name(event.key) == "d":
				player.mright = True
				player.mleft = False
			if pygame.key.name(event.key) == "w":
				player.mup = True
			if pygame.key.name(event.key) == "space":
				player.mup = True
		if event.type == pygame.KEYUP:
			if pygame.key.name(event.key) == "a":
				player.mleft = False
			if pygame.key.name(event.key) == "d":
				player.mright = False

	screen.fill((0,0,0))

	floor.draw()
	if collide(floor, player):
			player.collided = floor

	for block in blocks:
		block.draw()
		#left right collisions are good enough^tm
		if player.rect.right <= block.rect.left and player.rect.right >= (block.rect.left-2) and player.rect.bottom > block.rect.top+1 and player.rect.top <= block.rect.bottom+1:
			player.mright = False
			Block.mleft = False

		if player.rect.left >= block.rect.right and player.rect.left <= (block.rect.right+2) and player.rect.bottom > block.rect.top+1 and player.rect.top <= block.rect.bottom+1:
			player.mleft = False
			Block.mright = False

		#player block collisions
		if collide(block, player):
			player.collided = block

		for bonus in bonuses:
			if collide(block, bonus):
					bonus.collided = block

		for enemy in enemies:
			#enemy block collisions
			if collide(block, enemy):
				enemy.collided = block

			if enemy.rect.right <= block.rect.left and enemy.rect.right >= (block.rect.left-2) and enemy.rect.bottom > block.rect.top+1 and enemy.rect.top <= block.rect.bottom+1:
				enemy.mright = False
				enemy.mleft = True
			if enemy.rect.left >= block.rect.right and enemy.rect.left <= (block.rect.right+2) and enemy.rect.bottom > block.rect.top+1 and enemy.rect.top <= block.rect.bottom+1:
				enemy.mleft = False
				enemy.mright = True

	for bonus in bonuses:
		bonus.draw()
		bonus.collide()
		if collide(floor, bonus):
			bonus.collided = floor
		if collide(player, bonus):
			bonus.got(player)
			bonus_cooldown = 1*fps
	bonuses = [bonus for bonus in bonuses if not bonus.gotten]
	if bonus_cooldown > 0:
		bonus = text.render("Bonus! +10", True, (100,40,200))
		bonusrect = bonus.get_rect()
		bonusrect.center = (width//2, height//2)
		screen.blit(bonus, bonusrect)
		bonus_cooldown -= 1

	for enemy in enemies:
		enemy.draw()
		enemy.collide()
		if collide(floor, enemy):
			enemy.collided = floor
		if not enemy.dead:
			#stomp detection. player.jumps < 0 makes sure we are in the downward phase of jumping
			if player.jumps < 0 and ((player.rect.left >= enemy.rect.left-15 and player.rect.right <= enemy.rect.right+15) and (player.rect.bottom <= enemy.rect.top+12 and player.rect.bottom >= enemy.rect.top-20)):
				enemy.kill()
				player.score += 1
			else:
				#left/right collision detection
				if collide(player, enemy) and player.rect.top < enemy.rect.top:
					player.hurt()
				if collide(player, enemy) and (player.rect.bottom > enemy.rect.top+10 or player.rect.bottom > enemy.rect.top-10):
					player.hurt()
	enemies = [enemy for enemy in enemies if enemy.onscreen()]
	while len(enemies) < 4+level:
		enemies.append(Enemy(screen, (random.randint(-200,900), 150)))

	if player.rect.right >= width-100 and player.mright:
		Block.mleft = True
	else: 
		Block.mleft = False

	if player.rect.left <= 100 and player.mleft:
		Block.mright = True
	else:
		Block.mright = False

	if player.health <= 0:
		gamestate = 3

	player.draw()
	player.collide()
	info = text.render("level: %d health: %d score: %d" % (level, player.health, player.score), True, (0,255,0))
	inforect = info.get_rect()
	inforect.center = (width//2, 30)
	screen.blit(info, inforect)
	pygame.display.flip()

while gamestate == 3:
	clock.tick(fps)
	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()
		if event.type == pygame.KEYDOWN:
			if pygame.key.name(event.key) == "escape":
				exit()
	over = text.render("Game Over", True, (255,255,255))
	overrect = over.get_rect()
	overrect.center = (width//2, height//2)
	screen.blit(over, overrect)
	pygame.display.flip()



