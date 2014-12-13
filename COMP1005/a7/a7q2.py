from __future__ import division
import pygame

# initialize pygame
pygame.init()

# set up the screen
width = 640
height = 480
size = (width, height)
screen = pygame.display.set_mode(size)

# specify how many frames per second should be drawn
fps = 1 # you may want to change this!

# set up the clock
clock = pygame.time.Clock()
colours = [(0,0,0),(255,0,0),(0,255,0),(0,0,255),(255,255,255)]
def color():
	colours.append(colours.pop(0))
	return colours[0]

while True:
	# draw a specified number of frames per second
	clock.tick(fps) 

	# check to see if the user wants to quit
	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()

	screen.fill(color())

	# draw everything onto the screen
	pygame.display.flip()