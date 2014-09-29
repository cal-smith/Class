def multiply_list a
	return a.reduce(:*)
end

def join_strings a
	return a.reduce(:+)	
end

def square a
	return a.map do |x| x*x end
end

def describe_seconds s
	case
	when s < 60
		return (s).to_s + " seconds"
	when s < 3600
		return ((s / 60) % 60).to_s + " minutes and " + (s % 60).to_s + " seconds"
	when s < 86400
		return (((s / 60) / 60) % 24).to_s + " hours, " + ((s / 60) % 60).to_s + " minutes and " + (s % 60).to_s + " seconds"
	else
		return "a long time"
	end
end

puts "#{multiply_list((1..5))}"
puts "#{multiply_list((3..5))}"
puts "#{multiply_list([1,1,1])}"
puts "#{join_strings(["Hello", " ", "World!"])}"
puts "#{join_strings(["Look ", "at ", "my ", "function!"])}"
puts "#{square((1..5))}"
puts "#{square([0,1,2,2,1,0])}"
puts "#{describe_seconds(5)}"
puts "#{describe_seconds(70)}"
puts "#{describe_seconds(3700)}"
puts "#{describe_seconds(90000)}"