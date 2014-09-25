A2
====

Reference: a2.py

Implementations in: Clojure, Java, JavaScript, Ruby, attempts in C and C++

---

Create a file called **a2.py** in a directory of your choosing. In this assignment, you will be creating **six** functions. Each function should have a comment above it the says which question it corresponds to. Be sure to place

`from __future__ import division`

At the top of your file so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

Here are the tasks you will need to complete for this assignment:

1. Write a function `factorial(n)` that takes a positive integer `n` and returns the product *n × (n-1) × (n-2) × (n-3) ×···× 3 × 2 × 1*.
2. Write a function `add_list(a)` that takes a list `a` of numbers and returns the sum of all of the numbers in the list.
3. Write a function `average(a)` that takes a list `a` of numbers and returns the average of all of the numbers in the list.
4. Write a function `threshold(a,x)` that takes a list `a` of numbers and a number `x` and returns a list consisting of all of the elements of a that are greater than or equal to `x` in the same order that they appear in `a`.
5. Write a function `bmi_category(bmi)` that takes a number `bmi` that represents a BMI and returns a string that categorizes it:
`"underweight"` if `bmi < 18.5`
`"normal"` if `18.5 ≤ bmi < 25`
`"overweight"` if  `25 ≤ bmi < 30`
`"obese"` if `bmi ≥ 30`
6. Write a function `log2(n)` that takes a positive integer `n` and returns the number of times `n` can be divided by 2 (using **integer division**) before the result is less than or equal to 1.

**You are expected to test your functions** to make sure that they work. To do this, you should include **several** calls to each function with various values and print the results of those calls, for example:

```python
##############
# QUESTION 1 #
##############
def factorial(n):
     ...

print factorial(1)
print factorial(5)
print factorial(10)
```