from __future__ import division

class Student(object):
	def __init__(self, fname, lname, snum, a1, a2, a3, a4, mid, exm):
		self.fname = fname
		self.lname = lname
		self.snum = snum
		self.a1 = a1
		self.a2 = a2
		self.a3 = a3
		self.a4 = a4
		self.mid = mid
		self.exm = exm
		self.final = 0

	def __str__(self):
		return "%s %s (%d)" % (self.fname, self.lname, self.snum)

	def final_grade(self):
		if self.final == 0:
			self.final = ((20 * ((self.a1 + self.a2 + self.a3 + self.a4) / 400)) + (30 * (self.mid / 100)) + (50 * (self.exm / 100)))
		return self.final

def class_avg(students):
	return reduce(lambda x, y: x + y, [final.final_grade() for final in students]) / len(students)

def highest_grade(students):
	highest = 0
	for student in students:
		if student.final_grade > highest:
			highest = student.final_grade()
	return highest

def top_students(students, high):
	top = [student for student in students if student.final_grade() > avg]
	ret = ["The following student(s) had the highest grade:\n"]
	for student in top:
		ret.append(" " + str(student) + "\n")
	return reduce(lambda x, y: x + y, ret)

students = []
students.append(Student("Chava", "Sears", 100184004, 33, 23, 55, 67, 4, 49))
students.append(Student("Rina", "King", 100191526, 11, 45, 73, 96, 58, 39))
students.append(Student("Magee", "Livingston", 100161634, 57, 47, 88, 45, 26, 43))
students.append(Student("Nolan", "King", 100186234, 74, 45, 65, 9, 14, 11))
students.append(Student("August", "Mcclain", 100105460, 37, 78, 33, 61, 85, 2))
students.append(Student("Ali", "Summers", 100105619, 26, 92, 6, 31, 27, 96))
students.append(Student("Cody", "Emerson", 100193518, 28, 27, 52, 44, 85, 58))
students.append(Student("Lara", "Duran", 100189541, 45, 93, 32, 98, 20, 4))
students.append(Student("Justin", "Chang", 100198189, 94, 86, 52, 5, 71, 92))
students.append(Student("Logan", "Browning", 100166799, 12, 31, 93, 28, 25, 58))
students.append(Student("Shelley", "Ballard", 100191607, 53, 24, 57, 10, 42, 19))
students.append(Student("Shelby", "Schneider", 100121710, 25, 57, 52, 38, 23, 49))
students.append(Student("Brock", "Hicks", 100160230, 2, 35, 79, 36, 7, 1))
students.append(Student("Winter", "Ratliff", 100147728, 67, 48, 77, 54, 79, 90))
students.append(Student("Victor", "Bruce", 100198312, 51, 44, 29, 99, 76, 17))
students.append(Student("Mercedes", "Nash", 100125185, 66, 56, 69, 44, 26, 10))
students.append(Student("Lesley", "Stewart", 100126629, 48, 28, 62, 4, 24, 78))
students.append(Student("Emi", "Bauer", 100167978, 26, 20, 22, 41, 100, 69))
students.append(Student("Reed", "Mcmahon", 100127562, 33, 61, 61, 80, 0, 27))
students.append(Student("Brady", "Leblanc", 100107603, 21, 87, 95, 5, 58, 62))
students.append(Student("Aquila", "Garner", 100107891, 29, 18, 13, 12, 64, 3))
students.append(Student("Jarrod", "Hendrix", 100142441, 72, 95, 48, 57, 59, 35))
students.append(Student("Christopher", "Sears", 100121432, 59, 66, 72, 73, 95, 60))
students.append(Student("Shafira", "Freeman", 100113597, 91, 32, 16, 74, 80, 14))
students.append(Student("Adena", "Huff", 100129013, 84, 19, 66, 15, 47, 84))
students.append(Student("Kiara", "Huber", 100167065, 59, 51, 88, 10, 67, 73))
students.append(Student("Harlan", "Lamb", 100174064, 95, 19, 50, 4, 4, 77))
students.append(Student("Roanna", "Dalton", 100105546, 91, 74, 43, 43, 53, 21))
students.append(Student("Mari", "Diaz", 100125726, 51, 86, 88, 6, 87, 19))
students.append(Student("Armand", "Cochran", 100127974, 89, 13, 62, 80, 82, 76))
students.append(Student("Lydia", "Mccullough", 100179506, 44, 12, 10, 58, 6, 73))
students.append(Student("Shaeleigh", "Randall", 100196701, 72, 29, 4, 82, 68, 94))
students.append(Student("Ina", "Wilkins", 100140544, 100, 64, 57, 30, 9, 59))
students.append(Student("Maile", "Campbell", 100122850, 93, 9, 50, 76, 23, 60))
students.append(Student("Fuller", "Holder", 100148016, 41, 26, 69, 21, 94, 36))
students.append(Student("Molly", "Wilder", 100196411, 43, 31, 13, 91, 13, 40))
students.append(Student("Logan", "Mckenzie", 100110263, 87, 84, 75, 67, 76, 94))
students.append(Student("Ima", "Middleton", 100197742, 65, 34, 17, 96, 56, 17))
students.append(Student("Nichole", "Soto", 100123678, 54, 66, 87, 99, 48, 11))
students.append(Student("Halee", "Reynolds", 100199762, 15, 43, 28, 1, 81, 91))
students.append(Student("Keaton", "Terrell", 100142223, 79, 16, 54, 97, 90, 68))
students.append(Student("Fatima", "Booker", 100152653, 75, 20, 64, 99, 89, 34))
students.append(Student("Yolanda", "Mack", 100103883, 30, 8, 76, 94, 55, 61))
students.append(Student("Kibo", "White", 100145462, 27, 91, 40, 46, 93, 14))
students.append(Student("Latifah", "Bond", 100145145, 4, 34, 3, 82, 6, 39))
students.append(Student("Garth", "Landry", 100143948, 64, 68, 44, 66, 70, 55))
students.append(Student("Margaret", "David", 100122650, 33, 82, 31, 0, 62, 84))
students.append(Student("Candice", "Preston", 100108582, 71, 63, 71, 75, 65, 66))
students.append(Student("Amy", "Oliver", 100105979, 92, 22, 32, 20, 76, 59))
students.append(Student("Conan", "Henson", 100113239, 57, 53, 11, 68, 98, 29))
students.append(Student("Isaac", "Sampson", 100162788, 97, 70, 87, 12, 76, 46))
students.append(Student("Valentine", "Mcfarland", 100174388, 3, 15, 70, 8, 95, 1))
students.append(Student("Damian", "Casey", 100107894, 74, 34, 54, 43, 52, 93))
students.append(Student("Anjolie", "Callahan", 100139195, 80, 95, 34, 17, 72, 73))
students.append(Student("Odessa", "Buckley", 100137333, 99, 57, 85, 66, 47, 8))
students.append(Student("Macy", "Landry", 100192539, 18, 77, 62, 47, 34, 27))
students.append(Student("Gray", "Klein", 100122271, 43, 81, 49, 100, 43, 48))
students.append(Student("Candace", "Stafford", 100168276, 0, 30, 12, 9, 1, 85))
students.append(Student("Stephen", "Curry", 100166779, 84, 23, 75, 99, 81, 64))
students.append(Student("Harding", "Bowman", 100119408, 83, 74, 97, 1, 35, 69))
students.append(Student("Yardley", "Weiss", 100117237, 29, 56, 14, 90, 58, 39))
students.append(Student("Arthur", "Mclean", 100131863, 12, 76, 64, 82, 27, 10))
students.append(Student("Axel", "Peck", 100191804, 10, 74, 17, 44, 20, 100))
students.append(Student("Halla", "Valdez", 100188319, 14, 95, 82, 90, 53, 65))
students.append(Student("Kerry", "Solomon", 100163641, 28, 55, 2, 41, 2, 1))
students.append(Student("Tanisha", "Cantu", 100114473, 73, 47, 74, 98, 3, 55))
students.append(Student("Yael", "Lancaster", 100170728, 66, 22, 11, 91, 42, 11))
students.append(Student("Jonah", "Bullock", 100191200, 67, 42, 42, 65, 73, 28))
students.append(Student("Allegra", "Marshall", 100129491, 71, 34, 58, 48, 88, 41))
students.append(Student("Desiree", "Fitzpatrick", 100186913, 73, 58, 36, 26, 70, 82))
students.append(Student("Pascale", "Macdonald", 100135395, 30, 25, 13, 40, 91, 43))
students.append(Student("Charde", "Quinn", 100192731, 17, 3, 98, 51, 8, 45))
students.append(Student("Aquila", "Moore", 100103592, 38, 89, 100, 16, 58, 70))
students.append(Student("Eleanor", "Merrill", 100195523, 58, 45, 7, 56, 39, 69))
students.append(Student("Grant", "Cross", 100118620, 19, 53, 64, 26, 52, 44))
students.append(Student("Guy", "Ewing", 100103037, 99, 93, 98, 77, 93, 64))
students.append(Student("Callum", "Carter", 100127451, 2, 77, 68, 40, 5, 71))
students.append(Student("Cheryl", "Castaneda", 100107134, 15, 58, 3, 75, 35, 27))
students.append(Student("Linus", "Kramer", 100156221, 91, 15, 65, 55, 57, 87))
students.append(Student("Serina", "Blanchard", 100156951, 80, 33, 83, 63, 0, 59))
students.append(Student("Brielle", "Riley", 100152824, 80, 95, 63, 27, 36, 67))
students.append(Student("Hashim", "Simmons", 100181848, 52, 45, 80, 92, 4, 91))
students.append(Student("Dieter", "Ramos", 100158236, 26, 19, 95, 34, 25, 84))
students.append(Student("Anjolie", "Higgins", 100162019, 54, 64, 88, 43, 19, 69))
students.append(Student("Kadeem", "Bass", 100135258, 73, 8, 10, 100, 60, 91))
students.append(Student("Olga", "Decker", 100179993, 15, 46, 88, 75, 96, 37))
students.append(Student("Adria", "Mullins", 100178841, 92, 65, 68, 2, 49, 21))
students.append(Student("Portia", "Burgess", 100111449, 91, 1, 65, 31, 43, 4))
students.append(Student("Nyssa", "Winters", 100121696, 37, 16, 11, 52, 67, 96))
students.append(Student("Kay", "Horn", 100143440, 74, 5, 58, 88, 37, 61))
students.append(Student("Rae", "Atkinson", 100115171, 79, 62, 5, 74, 93, 3))
students.append(Student("Logan", "Garrett", 100159920, 92, 54, 56, 44, 60, 23))
students.append(Student("Keegan", "Quinn", 100152246, 82, 23, 7, 83, 40, 64))
students.append(Student("Hyacinth", "Oconnor", 100107692, 55, 6, 93, 10, 88, 35))
students.append(Student("Cameron", "Acosta", 100136639, 8, 14, 38, 22, 48, 17))
students.append(Student("Risa", "Sandoval", 100176934, 68, 19, 75, 76, 97, 86))
students.append(Student("Shannon", "Kirby", 100108070, 88, 87, 62, 10, 70, 15))
students.append(Student("Brielle", "Hampton", 100147601, 33, 38, 11, 27, 28, 56))
students.append(Student("Yeo", "Soto", 100131824, 70, 70, 68, 11, 12, 30))
students.append(Student("Shellie", "Davis", 100107683, 30, 78, 32, 6, 65, 90))

avg = class_avg(students)
print "The average final grade was %s/100" % avg
high = highest_grade(students)
print high
print top_students(students, high)
