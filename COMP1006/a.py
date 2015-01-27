def luhn(n):
	n = [int(x) for x in str(n)]
	print n
	i = len(n)-1
	while i != 0:
		if i % 2:
			n[i] = n[i] * 2
		i -= 1
	print n
	print "sum%10", sum(n) % 10
	print "valid? ", sum(n) % 10 == 0
	#print int(str(((sum(n) % 10) * 9))[int(len(str(((sum(n) % 10) * 9))))-1])

while (True):
	luhn(raw_input("number: "))