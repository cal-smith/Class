def unique(a):
	b = set(a)
	y = []
	for x in a:
		if x in b:
			y.append(x)
			b.remove(x)
	return y

print "unique:", unique([2,1,3,1,4])
print "unique:", unique(map(int, str(12323523562234146890724)))#map(int, str()) returns a list of ints
print "unique:", unique(map(int, str(1230462987546783159347860)))
print "unique:", unique(map(int, str(45234526)))
print "unique:", unique(map(int, str(123)))

def pos_and_neg(a):
	return [x for x in a if x in set(a) and -x in set(a)]

print "pos and neg:", pos_and_neg([-1,-2,3,1,2])
print "pos and neg:", pos_and_neg([-1,-4,-3,1,2,-5,4])
print "pos and neg:", pos_and_neg([-1,-2,-3,-4,-5,1])
print "pos and neg:", pos_and_neg([-0,-1,-3,-4,3,0])
print "pos and neg:", pos_and_neg([-1,-1,-1,1,1,1,-1,2,-2,-4,-5,5,4])#this prints too many -1's, but its not wrong strictly speaking

def encrypt(s, d):
	return reduce(lambda x, y: x + y, map(lambda x: d[x] if x in d else '?', s))
	
	'''I really like how map-reduce works, but here is a alt soln with loops
	y = []
	for i in s:
		if i in d:
			y.append(d[i])
		else:
			y.append('?')
	return reduce(lambda x, a: x + a, y)
	'''

d = { 'a':'m', 'b':'d', 'c':'l', 'd':'x', 'e':'j', 'f':'t', 'g':'u', 'h':'k', 'i':'z', 'j':'d', 'k':'o', 'l':'y', 'm':'i', 'n':'v', 'o':'p', 'p':'q', 'q':'f', 'r':'c', 's':'r', 't':'b', 'u':'j', 'v':'w', 'w':'n', 'x':'h', 'y':'s', 'z':'a' }
d1 = { 'a':'m', 'b':'d', 'c':'1', 'd':'x', 'e':'j', '0':'t', 'g':'u', 'h':'k', 'i':'z', 'C':'d', 'O':'o', 'l':'y', 'M':'i', 'A':'v', 'o':'p', 'p':'q', 'q':'f', 'r':'c', 's':'r', 't':'b', 'u':'j', 'v':'w', 'w':'n', 'x':'h', 'y':'s', 'z':'a' }
d2 = {'a':'l', 'h':'q', 'z':'x', 'y':'z', 'c':'y', 'k':'n', 'p':'d', 'i':'h', 'q':'j', 'f':'e', 'x':'s', 'w':'m', 't':'c', 's':'g', 'j':'w', 'd':'p', 'h':'u', 'l':'o', 'v':'b', 'n':'t', 'o':'a', 'g':'i', 'm':'r', 'b':'k', 'r':'v', 'u':'f', 'e':'q'}
print "encrypt:", encrypt('hello', d)
print "encrypt:", encrypt('Hello', d)
print "encrypt:", encrypt('WoRlD', d1)
print "encrypt:", encrypt('COMP1005', d1)
print "encrypt:", encrypt('lawl', d2)
print "encrypt:", encrypt('supercalifragilisticexpialidocious', d2)
