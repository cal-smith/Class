import signal
from random import shuffle 

def pose_question(question, answer_a, answer_b, answer_c, answer_d, correct_answer):
	print '\n%s\n A: %s\n B: %s\n C: %s\n D: %s\
			'%(question, answer_a, answer_b, answer_c, answer_d)

	answer = raw_input("Answer: ")
	answered = False
	while not answered:
		if (answer.lower() == "a" or answer.lower() == "b" or answer.lower() == "c" or answer.lower() == "d"):
			answered = True
		else:
			answer = raw_input("(A, B, C or D): ")

	if answer.lower() == correct_answer:
		print "Correct! score++"
		return 1
	else:
		print "False"
		return 0

#shuffles the questions, calls pose_question, and handles endgame state
def play():
	questions = [
	{"question":"[x for x in range(5)] is a:",
	"a":"For loop",
	"b":"While Loop",
	"c":"Magic",
	"d":"List comprehension",
	"answer":"d"
	},
	{"question":"Python is a:",
	"a":"Interpreted Language",
	"b":"Compiled Language",
	"c":"Punchcard Language",
	"d":"Foreign Language",
	"answer":"a"
	},
	{"question":"Where is John's office?",
	"a":"1170 HP",
	"b":"5380 HP",
	"c":"4155 HP",
	"d":"KM-TH SA",
	"answer":"b"
	},
	{"question":"Linux was originally programmed by:",
	"a":"Ken Thompson and Dennis Ritchie",
	"b":"Richard Stallman",
	"c":"Linus Torvalds",
	"d":"DEVELOPERS DEVELOPERS DEVELOPERS DEVELOPERS", #see also: https://www.youtube.com/watch?v=KMU0tzLwhbE
	"answer":"c"
	},
	{"question":"What algorithm was Google founded on?",
	"a":"MapReduce",
	"b":"PageRank",
	"c":"GoogleRank",
	"d":"A* Graph Search",
	"answer":"b"}]
	
	shuffle(questions)
	score = 0
	for q in questions:
		score += pose_question(q["question"], q["a"], q["b"], q["c"], q["d"], q["answer"])

	print "\nscore:", score,
	if score > 5:
		print '"hacker"'
	elif score >= 4:
		print '"10/10 good job!"'
	elif score >= 2:
		print '"It went okay"'
	else:
		print '"awww..."'

	while True:
		again = raw_input("play again? y/n: ")
		if again.lower() == "y":
			play()
		elif again.lower() == "n":
			print "bye!"
			exit()

#lets us exit without spewing a stack trace
signal.signal(signal.SIGINT, lambda s, f: exit())

play()


