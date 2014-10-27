class Person(object):
	def __init__(self, first, last, id):
		self.first = first
		self.last = last
		self.id = id

	def __str__(self):
		return "fist: %s, last: %s, id: %d" % (self.first, self.last, self.id)
		
class Student(Person):
	def __init__(self, first, last, id, major):
		super(Student, self).__init__(first, last, id)
		self.major = major

	def __str__(self):
		return "fist: %s, last: %s, id: %d, major: %s" % (self.first, self.last, self.id, self.major)

class Employee(Person):
	def __init__(self, first, last, id, home_dept):
		super(Employee, self).__init__(first, last, id)
		self.home_dept = home_dept

	def __str__(self):
		return "fist: %s, last: %s, id: %d, home dept: %s" % (self.first, self.last, self.id, self.home_dept)

class Professor(Employee):
	def __init__(self, first, last, id, home_dept, grant):
		super(Professor, self).__init__(first, last, id, home_dept)
		self.grant = grant

	def __str__(self):
		return "fist: %s, last: %s, id: %d, home dept: %s, grant: %d" % (self.first, self.last, self.id, self.home_dept, self.grant)
		
class Instructor(Employee):
	def __init__(self, first, last, id, home_dept, courses):
		super(Instructor, self).__init__(first, last, id, home_dept)
		self.courses = courses

	def __str__(self):
		return "fist: %s, last: %s, id: %d, home dept: %s, courses: %d" % (self.first, self.last, self.id, self.home_dept, self.courses)

class TeachingAssistant(Employee):
	def __init__(self, first, last, id, home_dept, course):
		super(TeachingAssistant, self).__init__(first, last, id, home_dept)
		self.course = course

	def __str__(self):
		return "fist: %s, last: %s, id: %d, home dept: %s, course: %s" % (self.first, self.last, self.id, self.home_dept, self.course)

class UndergraduateStudent(Student):
	def __init__(self, first, last, id, major, gpa):
		super(UndergraduateStudent, self).__init__(first, last, id, major)
		self.gpa = gpa

	def __str__(self):
		return "fist: %s, last: %s, id: %d, major: %s, gpa: %d" % (self.first, self.last, self.id, self.major, self.gpa)

class GraduateStudent(Student):
	def __init__(self, first, last, id, major, thesis):
		super(GraduateStudent, self).__init__(first, last, id, major)
		self.thesis = thesis

	def __str__(self):
		return "fist: %s, last: %s, id: %d, major: %s, thesis: %s" % (self.first, self.last, self.id, self.major, self.thesis)

person = Person("bob", "person", 123456789)
student_person = Student("bob", "person", 123456789, "B.Sc.")
undergrad_student_person = UndergraduateStudent("bob", "person", 123456789, "B.Sc.", 12)
grad_student_person = GraduateStudent("bob", "person", 987654321, "B.Sc.", "Optimizing JavaScript")

print "person", person
print "student_person", student_person
print "undergrad_student_person", undergrad_student_person
print "grad_student_person", grad_student_person
print

person = Person("people", "personson", 123654897)
employee_person = Employee("people", "personson", 123654897, "School of Computer Science")
professor_employee_person = Professor("people", "personson", 123654897, "School of Computer Science", 9001)
instructor_employee_person = Instructor("people", "personson", 123654897, "School of Computer Science", 6)
ta_employee_person = TeachingAssistant("people", "personson", 123654897, "School of Computer Science", "COMP 1005A")

print "person", person
print "employee_person", employee_person
print "professor_employee_person", professor_employee_person
print "instructor_employee_person", instructor_employee_person
print "ta_employee_person", ta_employee_person