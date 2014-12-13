from __future__ import division
import pygame

# initialize pygame
pygame.init()

# set up the screen
width = 640
height = 480
size = (width, height)
screen = pygame.display.set_mode(size)
ball = pygame.image.load("ball.png")
ballrekt = ball.get_rect()
ballrekt = ballrekt.move(width/2-ballrekt.center[0], height/2-ballrekt.center[1])

# specify how many frames per second should be drawn
fps = 60 # you may want to change this!

# set up the clock
clock = pygame.time.Clock()

while True:
	# draw a specified number of frames per second
	clock.tick(fps) 

	# check to see if the user wants to quit
	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()

	screen.blit(ball, ballrekt)

	# draw everything onto the screen
	pygame.display.flip()