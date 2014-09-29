A1
====

Reference: a1.py

Implementations in: Clojure, Ruby, and attempted in Haskell

---

Create a file called **a1.py** in a directory of your choosing. In this assignment, you will be creating **seven** functions. Each function should have a comment above it the says which question it corresponds to. For example:

```python
##############
# QUESTION 1 #
##############
def f2c(t):
     ...
```

You should also place

`from __future__ import division`

At the top of your file so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

Here are the tasks you will need to complete for this assignment:

1. Write a function `f2c(t)` that returns the temperature, `t`, expressed in degrees Fahrenheit as a temperature expressed in degrees Celsius. (You may need to look up how Fahrenheit and Celsius are related.)
2. Write a function `lboz2kg(p,o)` that returns the weight `p` pounds and `o` ounces expressed as a weight in kilograms. (You may need to look up how pounds, ounces, and kilograms are related.)
3. Write a function `in2ftin(h)` that takes a number `h` that represents a height in inches and outputs a pair `(ft,in)` such that `h` inches is equal to `ft` feet and `in` inches, and `in` is less than 12. (You may need to look up how feet and inches are related.)
4. Write a function `bibformat_mla(author,title,city,publisher,year)` that returns a string of the form "author. title. city: publisher, year".
5. Write a function `bibformat_apa(author,title,city,publisher,year)` that returns a string of the form "author (year). title. city: publisher.".
6. Write a function `bmi(w,h)` that returns the body mass index (BMI) of someone whose weight (in pounds) is `w` and whose height (in inches) is `h`. (You may need to look up how the BMI is calculated.)
7. Write a function `bmi_calculator()` that prompts the user to enter their first name, their height in inches, and their weight in pounds, and then prints a message that tells the user, by name, their BMI. (You can and should make use of the function you wrote in Question 6.)

**You are expected to test your functions** to make sure that they work. To do this, you should include **several** calls to each function with various values and print the results of those calls, for example:

```python
##############
# QUESTION 3 #
##############
def in2ftin(h):
     ...

print in2ftin(12)
print in2ftin(100)
print in2ftin(200)
```