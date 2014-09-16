################
# Assignment 1 #
################
from __future__ import division


##############
# Question 1 #
##############
def f2c(t):
	return (t - 32) * 5 / 9
#tests
print 'f2c', f2c(80)
print 'f2c', f2c(100)
print 'f2c', f2c(300)

##############
# Question 2 #
##############
def lboz2kg(p,o=0):
	return ((p * 16) + o) / 35.274
#tests
print 'lboz2kg', lboz2kg(2.2047)
print 'lboz2kg', lboz2kg(50, 80)
print 'lboz2kg', lboz2kg(10, 100)

##############
# Question 3 #
##############
def in2ftin(h):
	if h < 12:
		return (0, h)
	else:
		return (h // 12, int(((h / 12) - (h // 12)) * 10))
#tests
print 'in2ftin', in2ftin(12)
print 'in2ftin', in2ftin(120)
print 'in2ftin', in2ftin(150)
print 'in2ftin', in2ftin(235)
print 'in2ftin', in2ftin(5)

##############
# Question 4 #
##############
def bibformat_mla(author, title, city, publisher, year):
	return "%s. %s. %s: %s, %s"% (author, title, city, publisher, year)
#tests
print "bibformat_mla", bibformat_mla("Randall Munroe", "what if?", "New York", "Houghton Mifflin Hardcourt", 2014)
print "bibformat_mla", bibformat_mla("J. R. R. Tolkien", "The Hobbit", "London", "Unwin Paperbacks", "1981")

##############
# Question 5 #
##############
def bibformat_apa(author, title, city, publisher, year):
	return "%s (%s). %s. %s: %s."% (author, year, title, city, publisher)
#tests
print "bibformat_apa", bibformat_apa("Randall Munroe", "what if?", "New York", "Houghton Mifflin Hardcourt", 2014)
print "bibformat_apa", bibformat_apa("J. R. R. Tolkien", "The Hobbit", "London", "Unwin Paperbacks", "1981")

##############
# Question 6 #
##############
def bmi(w, h):
	return (w / (h * h)) * 703 
#tests
print "bmi", bmi(180, 70)
print "bmi", bmi(500, 200)
print "bmi", bmi(99, 80)

##############
# Question 7 #
##############
def bmi_calculator():
	name = raw_input("First name: ")
	weight = input("Enter weight: ")
	height = input("Enter height: ")
	print "Looks like %s's BMI is %s"%(name, bmi(weight, height))
#tests
# example 1:
# Please enter your name: bob
# Please enter your weight: 180
# Please enter your height: 70
# "Looks like [bob]'s BMI is [25.8244897959]"

# example 2:
# Please enter your name: joe
# Please enter your weight: 200
# Please enter your height: 80
# "Looks like [joe]'s BMI is [21.96875]"