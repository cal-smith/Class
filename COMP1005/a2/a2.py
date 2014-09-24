################
# Assignment 2 #
################
from __future__ import division

##############
# Question 1 #
##############
def factorial(n): return reduce(lambda x, y: x * y, range(1, n + 1))
#tests
print "factorial: ", factorial(5)
print "factorial: ", factorial(10)
print "factorial: ", factorial(24)

##############
# Question 2 #
##############
def add_list(a): return reduce(lambda x, y: x + y, a)
#tests
print "add_list: ", add_list([1, 1, 1, 1])
print "add_list: ", add_list([1, 2, 3, 4])
print "add_list: ", add_list([5, 10, 1.5, 3])

##############
# Question 3 #
##############
def average(a): return add_list(a) / len(a)
#tests
print "average: ", average([1, 2, 3, 4])
print "average: ", average([100, 80, 90, 50, 70, 20, 100])
print "average: ", average([3, 2, 3, 3, 3, 3, 4])

##############
# Question 4 #
##############
def threshold(a, x): return [y for y in a if y >= x]
#tests
print "threshold: ", threshold([1, 2, 5, 3, 6], 4)
print "threshold: ", threshold(range(1, 20 + 1), 15)
print "threshold: ", threshold(range(1, 15 + 1), 4.4)

##############
# Question 5 #
##############
def bmi_category(bmi):
	if bmi < 18.5:
		return "underweight"
	elif bmi < 25:
		return "normal"
	elif bmi < 30:
		return "overweight"
	else:
		return "obese"
#tests
print "bmi_category: ", bmi_category(18.4)
print "bmi_category: ", bmi_category(24)
print "bmi_category: ", bmi_category(25)
print "bmi_category: ", bmi_category(9001)

##############
# Question 6 #
##############
def log2(n):
	x = 0
	while n > 1:
		n = n // 2
		x += 1
	return x
#tests
print "log2: ", log2(8)
print "log2: ", log2(9001)
print "log2: ", log2(23)