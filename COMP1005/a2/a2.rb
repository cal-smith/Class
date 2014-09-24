#
# Assignment 2
#


#
# Question 1
#
def factorial n
	return (1..n).reduce(:*)
end
#tests
puts "factorial: #{factorial 5}"
puts "factorial: #{factorial 10}"
puts "factorial: #{factorial 24}"

#
# Question 2
#
def add_list list
	return list.reduce(:+)
end
#tests
puts "add_list: #{add_list [1, 1, 1, 1]}"
puts "add_list: #{add_list [1, 2, 3, 4]}"
puts "add_list: #{add_list [5, 10, 1.5, 3]}"

#
# Question 3
#
def average list
	return add_list(list).fdiv(list.length)
end
#tests
puts "average: #{average [1, 2, 3, 4]}"
puts "average: #{average [100, 80, 90, 50, 70, 20, 100]}"
puts "average: #{average [3, 2, 3, 3, 3, 3, 4]}"

#
# Question 4
#
def threshold a, x
	return a.map do |y| y >= x ? y : nil end.compact
end
#tests
puts "threshold: #{threshold [1, 2, 5, 3, 6], 4}"
puts "threshold: #{threshold (1..20), 15}"
puts "threshold: #{threshold (1..15), 4.4}"

#
# Question 5
#
def bmi_category bmi
	case
	when bmi < 18.5
		return "underweight"
	when bmi < 25
		return "normal"
	when bmi < 30
		return "overweight"
	else
		return "obese"
	end
end
#tests
puts "bmi_category: #{bmi_category 18.4}"
puts "bmi_category: #{bmi_category 24}"
puts "bmi_category: #{bmi_category 25}"
puts "bmi_category: #{bmi_category 9001}"

#
# Question 6
#
def log2 n
	x = 0
	while n > 1
		n = n / 2
		x += 1
	end
	return x
end
#tests
puts "log2: #{log2 8}"
puts "log2: #{log2 9001}"
puts "log2: #{log2 23}"