def kilometers2miles d
	return d * 0.62137
end

def circumference r
	return (2 * 3.1415) * r
end

def average x, y
	return (x + y).fdiv(2)
end

def greet name
	puts "Hi, #{name}"
end

def s2dhms t
	return [(((t / 60) / 60) / 24), (((t / 60) / 60) % 24), ((t / 60) % 60), (t % 60)]
end

def dhms2s d, h, m, s
	return ((((d * 24) * 60) * 60) + ((h * 60) * 60) + (m * 60) + s)
end

puts kilometers2miles 0
puts kilometers2miles 3
puts circumference 0
puts circumference 2
puts average 0, 0
puts average 0, 1
puts average 1, 0
puts average 1, 3
greet "John"
puts "#{s2dhms 0}"
puts "#{s2dhms 90061}"
puts dhms2s 0, 0, 0, 0
puts dhms2s 1, 1, 1, 1
puts dhms2s 1, 2, 3, 4