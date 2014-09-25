from __future__ import division

def multiply_list(a): return reduce(lambda x, y: x * y, a)

def join_strings(a): return reduce(lambda x, y: x + y, a)

def square(a): return [x*x for x in a]

def describe_seconds(s):
	if s < 60:
		return str(s) + " seconds"
	elif s < 3600:
		return str((s // 60) % 60) + " minutes and " + str(s % 60) + " seconds"
	elif s < 86400:
		return str(((s //60) // 60) % 24) + " hours, " + str((s // 60) % 60) + " minutes and " + str(s % 60) + " seconds"
	else:
		return "a long time"

print multiply_list(range(1,5))
print multiply_list(range(3,5))
print multiply_list([1,1,1])
print join_strings(["Hello", " ", "World!"])
print join_strings(["Look ", "at ", "my ", "function!"])
print square(range(5))
print square([0,1,2,2,1,0])
print describe_seconds(5)
print describe_seconds(70)
print describe_seconds(3700)
print describe_seconds(90000)