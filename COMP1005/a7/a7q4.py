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
		self.a = 0
		
	def rotate(self, angle):
		self.a += angle
		image = pygame.transform.rotate(self.ball, self.a)
		image_rect = image.get_rect()
		image_rect.center = (width//2, height//2)
		screen.blit(image, image_rect)

# specify how many frames per second should be drawn
fps = 60 # you may want to change this!

# set up the clock
clock = pygame.time.Clock()

rotateable = Ball()
while True:
	# draw a specified number of frames per second
	clock.tick(fps) 

	# check to see if the user wants to quit
	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()

	screen.fill((0,0,0))
	rotateable.rotate(6)

	# draw everything onto the screen
	pygame.display.flip()