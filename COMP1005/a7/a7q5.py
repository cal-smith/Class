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
	def __init__(self):
		self.ball = pygame.image.load("ball.png")
		self.ballrekt = self.ball.get_rect()
		self.ballrekt = self.ballrekt.move(0, height-self.ballrekt.bottom)
		self.speed = 7
		
	def move(self):
		if self.ballrekt.left < 0 or self.ballrekt.right > width:
			self.speed = -self.speed
		self.ballrekt = self.ballrekt.move(self.speed, 0)
		screen.blit(self.ball, self.ballrekt)

# specify how many frames per second should be drawn
fps = 60 # you may want to change this!

# set up the clock
clock = pygame.time.Clock()

moveable = Ball()
while True:
	# draw a specified number of frames per second
	clock.tick(fps) 

	# check to see if the user wants to quit
	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()

	screen.fill((0,0,0))
	moveable.move()

	# draw everything onto the screen
	pygame.display.flip()