from __future__ import division

def kilometers2miles(d):
	return(d * 0.62137)

def circumference(r):
	return ((2 * 3.1415) * r)

def average(x, y):
	return ((x + y) / 2)

def greet(name):
	print "Hi, %s" %name

def s2dhms(t):
	return ((((t // 60) // 60) // 24), (((t // 60) // 60) % 24), ((t // 60) % 60), (t % 60))

def dhms2s(d, h, m, s):
	return ((((d * 24) * 60) * 60) + ((h * 60) * 60) + (m * 60) + s)

print kilometers2miles(0)
print kilometers2miles(3)
print circumference(0)
print circumference(2)
print average(0, 0)
print average(0, 1)
print average(1, 0)
print average(1, 3)
greet("John")
print s2dhms(0)
print s2dhms(90061)
print dhms2s(0, 0, 0, 0)
print dhms2s(1, 1, 1, 1)
print dhms2s(1, 2, 3, 4)