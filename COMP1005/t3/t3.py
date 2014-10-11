import random

print "Hello!"

def init():
	 ed = raw_input("Edit dice? y/n: ")
	 if ed == "y":
	 	dice = int(raw_input("Number of dice (default 2): "))
	 	sides = int(raw_input("Number of sides (default 6): "))
	 	play(n=dice, s=sides)
	 else:
	 	play()

def play(pts=10, n=2, s=6):

	if pts == 0:
		print "Ran out of points"
		exit()

	print ""
	middle = ((s * n) / 2) + 1

	print "Points: ", pts
	print "Middle: ", middle

	print ""
	guess = raw_input("Guess: ")

	roll = roll_die(n, s)
	total = reduce(lambda x, y: x + y, roll)

	print "Die: %s, Total: %d"% (str(roll), total)

	if guess == "high" and total > middle:
		pts += 1
		print "Correct! pts: ", pts
	elif guess == "low" and total < middle:
		pts += 1
		print "Correct! pts: ", pts
	elif guess == middle and total == middle:
		pts += 2
		print "Correct! pts: ", pts
	else:
		pts -= 1
		print "Wrong! pts: ", pts

	if pts == 0:
		print "Ran out of points"
		exit()

	print ""
	again = raw_input("Play again? y/n: ")

	if again == "y":
		play(pts, n, s)
	else:
		print "Bye"
		exit()

def roll_die(n, s):
	return [random.randint(1, s) for x in range(n)]
	
init()