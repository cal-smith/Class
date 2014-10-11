class Book(object):
	def __init__(self, author, title, city, publisher, year):
		self.author = author
		self.title = title
		self.city = city
		self.publisher = publisher
		self.year = year


	def mla_string(self):
		return "%s. %s. %s: %s, %s"% (self.author, self.title, self.city, self.publisher, self.year)

	def apa_string(self):
		return "%s (%s). %s. %s: %s."% (self.author, self.year, self.title, self.city, self.publisher)

def books_from_year(books, year):
	return len([book for book in books if int(book.year) == int(year)])

books = [
	Book("Randall Munroe", "what if?", "New York", "Houghton Mifflin Hardcourt", 2014),
	Book("J. R. R. Tolkien", "The Hobbit", "London", "Unwin Paperbacks", "1981"),
	Book("Terry Pratchett", "The Truth", "New York", "Doubleday", 2000),
	Book("J. R. R. Tolkien", "The Fellowship of the Ring", "London", "Unwin Paperbacks", 1954),
	Book("Terry Pratchett and Stephen Baxter", "The Long War", "New York", "Doubleday", "2014")
]

for book in books:
	print "mla:", book.mla_string()
	print "apa:", book.apa_string()

print "Books from 2014:", books_from_year(books, 2014)
print "Books from 1981:", books_from_year(books, "1981")