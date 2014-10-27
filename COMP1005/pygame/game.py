import sys, pygame, random
pygame.init()

size = width, height = 1280, 720
screen = pygame.display.set_mode(size)

class color (object):
	black = 0, 0, 0

ball = pygame.image.load("ball.gif")
ballrekt = ball.get_rect()
ball_r = pygame.transform.flip(ball, True, False)
ball_r_rekt = ball_r.get_rect()
ballspeed = [25,25]
ballrspeed = [10,10]

def move(o, s):
	if o.left < 0 or o.right > width:
		s[0] = -s[0]
		return s
	if o.top < 0 or o.bottom > height:
		#random.randint(10,20)
		s[1] = -s[1]
		return s
	return s

clock = pygame.time.Clock()

while 1:
	clock.tick(60)
	for event in pygame.event.get():
		if event.type == pygame.QUIT: sys.exit()

	ballrekt.move_ip(move(ballrekt, ballspeed))
	ball_r_rekt.move_ip(move(ball_r_rekt, ballrspeed))
	screen.fill(color.black)
	screen.blit(ball, ballrekt)
	screen.blit(ball_r, ball_r_rekt)
	pygame.display.flip()