from __future__ import division
import random

def quick_sort(a):
	if len(a) == 0:
		return a
	else:
		x = random.choice(a)
		#x = a[0]
		lt = [ y for y in a if y < x ]
		eq = [ y for y in a if y == x ]
		gt = [ y for y in a if y > x ]
		return quick_sort(lt) + eq + quick_sort(gt)

##############
# QUESTION 1 #
##############
def binary_searcher(a, x, i, l):
	index = i + l//2
	if l == 0:
		return None
	if x == a[index]:
		return index
	elif l == 1 and index+1 < len(a) and a[index+1] >= x:
		return index+1
	else:
		if x < a[index]:
			return binary_searcher(a, x, i, l//2)
		else:
			return binary_searcher(a, x, index+1, l-(l//2)-1)

def recursive_binary_search_better(a, x):
	return binary_searcher(a, x, 0, len(a))

print "recursive_binary_search_better", recursive_binary_search_better([1,2,3,4],5)
print "recursive_binary_search_better", recursive_binary_search_better([1,2,3,4],3)
print "recursive_binary_search_better", recursive_binary_search_better([2,4,6,8],3)
print "recursive_binary_search_better", recursive_binary_search_better(range(1000000),1337)

##############
# QUESTION 2 #
##############
def sum_of_two_largest(a):
	return a.pop(a.index(max(a))) + a.pop(a.index(max(a))) if len(a) > 1 else a[0]

print "sum_of_two_largest", sum_of_two_largest([1])
print "sum_of_two_largest", sum_of_two_largest([2,8,4,5,6])
print "sum_of_two_largest", sum_of_two_largest([1,2,10000000,3,4,10000000,6,7])
print "sum_of_two_largest", sum_of_two_largest(range(1000001))

##############
# QUESTION 3 #
##############
def sum_of_smallest_half(a):
	a = sorted(a)#if we can't us the stdlib sorted(), this soln totally actually uses, a = quick_sort(a)
	return a[0] if len(a) == 1 else reduce(lambda x, y: x + y, a[:len(a)//2])

print "sum_of_smallest_half", sum_of_smallest_half([1])
print "sum_of_smallest_half", sum_of_smallest_half([2,8])
print "sum_of_smallest_half", sum_of_smallest_half([2,8,4,5,6])
print "sum_of_smallest_half", sum_of_smallest_half(range(1000001))

##############
# QUESTION 4 #
##############
def median(a):
	a = sorted(a)#if we can't us the stdlib sorted(), this soln totally actually uses, a = quick_sort(a)
	return a[len(a)//2]

print "median", median([0])
print "median", median([1,2,3,4])
print "median", median([1,2,3,4,5])
print "median", median([1,2,5,4,3,7,5,7,2])
print "median", median(range(1,1000000))


##############
# QUESTION 5 #
##############
def majority(a):
	for x in set(a):
		b = [y for y in a if y == x]
		if len(b) >= len(a)//2+1:
			return b[0]

print "majority", majority([5,5,5,4,5])
print "majority", majority([1,2,3,4,5,6,6,6,6,7,7,7,7,7,6,7,7,7,7,7,7])
print "majority", majority([2,2,2,4,5])
print "majority", majority([1,2,3,4,5])
print "majority", majority([50 for x in range(1000000)])
