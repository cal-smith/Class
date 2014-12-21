#greedy polynomial soln: https://en.wikipedia.org/wiki/Interval_scheduling
def answer(meetings):
	s = []
	meetings = sorted(meetings, cmp=lambda x,y: cmp(y[1], x[1]), reverse=True)
	while len(meetings) > 0:
		ends = [x[1] for x in meetings]#get a list of end times
		x = meetings.pop(ends.index(min(ends)))#get the soonest end time, also remove it from the meetings
		s.append(x) #append to schedual
		delete = []
		for j,y in enumerate(meetings):
			if meetings[j][0] < x[0] or meetings[j][0] < x[1]: #if a meeting overlaps
				delete.append(j)#set it to be deleted
		while len(delete) > 0:#bulk delete!
			meetings.pop(delete[len(delete)-1])
			delete.pop()
	return len(s)

#this fufills 3/5 tests
def answers(meetings):
	meetings = sorted(meetings, cmp=lambda x,y: cmp(y[1], x[1]), reverse=True)
	s = 1
	print meetings
	for i,m in enumerate(meetings):
		if i < len(meetings)-1:	
			if m[1] <= meetings[i+1][0]:
				s += 1
	return s
'''
[[2, 4], [2, 5], [1, 5], [4, 5], [3, 7], [0, 8], [6, 8], [6, 9], [0, 9]]
[[0, 8], [0, 9], [1, 5], [2, 5], [2, 4], [3, 7], [4, 5], [6, 9], [6, 8]]
[1,5][6,9]

[[0, 1], [1, 2], [2, 3], [4, 5], [3, 5]]
[[0, 1], [1, 2], [2, 3], [3, 5], [4, 5]]
'''
print answer([[0,1]])
print answer([[0, 1], [1, 2], [2, 3], [4, 5], [3, 5]])
print answer([[0, 1000000], [42, 43], [0, 1000000], [42, 43]])
print answer([[500, 1000000], [10, 20], [20, 30], [90, 200]])
print answer([[1, 1], [2, 2], [3, 3], [4, 4]])
print answer([[2, 5], [6, 9],[1,5],[0,8],[4,5],[3,7],[0,9],[2,4],[6,8]])
#print answer([[x, x+1] for x in range(100)])


'''maximum number of elements
def answer(a):
	if sum(a)%len(a) == 0:
		return len(a)
	else:
		return len(a) - 1
'''