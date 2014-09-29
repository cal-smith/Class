################
# Assignment 1 #
################



##############
# Question 1 #
##############
def f2c(t)
	return (t - 32) * 5.fdiv(9)
end
#tests
puts "f2c #{f2c(80)}"
puts "f2c #{f2c(100)}"
puts "f2c #{f2c(300)}"

##############
# Question 2 #
##############
def lboz2kg(p,o=0)
	return ((p * 16) + o).fdiv(35.274)
end
#tests
puts "lboz2kg #{lboz2kg(2.2047)}"
puts "lboz2kg #{lboz2kg(50, 80)}"
puts "lboz2kg #{lboz2kg(10, 100)}"

##############
# Question 3 #
##############
def in2ftin(h)
	if h < 12
		return [0, h]
	else
		return [h / 12, ((h.fdiv(12)) - (h / 12)) * 10]
	end
end
#tests
puts "in2ftin #{in2ftin(12)}"
puts "in2ftin #{in2ftin(120)}"
puts "in2ftin #{in2ftin(150)}"
puts "in2ftin #{in2ftin(235)}"
puts "in2ftin #{in2ftin(5)}"

##############
# Question 4 #
##############
def bibformat_mla(author, title, city, publisher, year)
	return "#{author}. #{title}. #{city}: #{publisher}, #{year}"
end
#tests
puts "bibformat_mla #{bibformat_mla("Randall Munroe", "what if?", "New York", "Houghton Mifflin Hardcourt", 2014)}"
puts "bibformat_mla #{bibformat_mla("J. R. R. Tolkien", "The Hobbit", "London", "Unwin Paperbacks", "1981")}"

##############
# Question 5 #
##############
def bibformat_apa(author, title, city, publisher, year)
	return "#{author} (#{year}). #{title}. #{city}: #{publisher}."
end
#tests
puts "bibformat_apa #{bibformat_apa("Randall Munroe", "what if?", "New York", "Houghton Mifflin Hardcourt", 2014)}"
puts "bibformat_apa #{bibformat_apa("J. R. R. Tolkien", "The Hobbit", "London", "Unwin Paperbacks", "1981")}"

##############
# Question 6 #
##############
def bmi(w, h)
	return (w.fdiv(h * h)) * 703
end
#tests
puts "bmi #{bmi(180, 70)}"
puts "bmi #{bmi(500, 200)}"
puts "bmi #{bmi(99, 80)}"

##############
# Question 7 #
##############
def bmi_calculator()
	print "First name: " 
	name = gets.chomp
	print "Enter weight: "
	weight = gets.chomp.to_i
	print "Enter height: "
	height = gets.chomp.to_i
	puts "Looks like #{name}'s BMI is #{bmi(weight, height)}"
end
bmi_calculator()