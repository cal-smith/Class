from __future__ import division
from random import shuffle, randint
from datetime import datetime

##############
# QUESTION 1 #
##############
def fibonacci(n):
	if n == 0:
		return 0
	elif n == 1:
		return 1
	else:
		return fibonacci(n-1) + fibonacci(n-2)

print "fibonacci:", fibonacci(0)
print "fibonacci:", fibonacci(1)
print "fibonacci:", fibonacci(2)
print "fibonacci:", fibonacci(10)
print "fibonacci:", fibonacci(20)
print "fibonacci:", fibonacci(35)

##############
# QUESTION 2 #
##############
def tribonacci(n):
	if n < 2:
		return 0
	elif n == 2:
		return 1
	else:
		return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3)
print "tribonacci:", tribonacci(0)
print "tribonacci:", tribonacci(1)
print "tribonacci:", tribonacci(2)
print "tribonacci:", tribonacci(10)
print "tribonacci:", tribonacci(25)

##############
# QUESTION 3 #
##############
def multiply(a, b):
	if b == 0:
		return 0
	if b == 1:
		return a
	else:
		return a + multiply(a, b-1)
print "multiply:", multiply(0,0)
print "multiply:", multiply(0,1)
print "multiply:", multiply(1,2)
print "multiply:", multiply(2,4)
print "multiply:", multiply(1337,999)

##############
# QUESTION 4 #
##############
def exponent(a, b):
	if b == 0:
		return 1
	if b == 1:
		return a
	return a * exponent(a, b-1)
	#return multiply(a, exponent(a, b-1)) #this is more meta
print "exponent:", exponent(0,0)
print "exponent:", exponent(1,0)
print "exponent:", exponent(3,4)
print "exponent:", exponent(5,2)
print "exponent:", exponent(4,4)
print "exponent:", exponent(2,10)
print "exponent:", exponent(9001,999)

##############
# QUESTION 5 #
##############
def maximums(a, low, high):
	m = (low+high)//2
	if high - low == 0:
		return a[low]
	elif high - low == 1:
		if a[low] > a[high]:
			return a[low]
		if a[high] > a[low]:
			return a[high]
	else:
		b = [maximums(a, low, m), maximums(a, m+1, high)]
		return b[0] if b[0]>b[1] else b[1]

def maximum(a):
	if len(a) == 0:
		return 0
	elif len(a) == 1:
		return a[0]
	else:
		return maximums(a, 0, len(a)-1)

def shuffle2(x):#because random.shuffle only shuffles in place, and I needed/wanted it to return a shuffled range()
	shuffle(x)
	return x

print "pre-allocating arrays"
#pre-allocate and shuffle a arrays
hundredthousand = shuffle2(range(100001))
mil = shuffle2(range(1000001))
tenmil = shuffle2(range(10000001))
print "done"
print "maximum:", maximum([])
print "maximum:", maximum([1])
print "maximum:", maximum([1,3,2])
print "maximum:", maximum(shuffle2(range(11)))
print "maximum:", maximum(shuffle2(range(101)))
print "maximum:", maximum(shuffle2(range(1001)))
print "maximum:", maximum(hundredthousand)
print "maximum:", maximum(mil)
s = datetime.now()
print "maximum:", maximum(tenmil)#runs in about 8s
e = datetime.now()
print "ten million executed in:", e - s
s = datetime.now()
print "maximum:", maximum(shuffle2(range(randint(1, 10001))))#extra random with a dash of random





