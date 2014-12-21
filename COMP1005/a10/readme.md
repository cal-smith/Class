A10
====

Reference: a10.py

Implementations in:

---
Create a file called **a10.py** in a directory of your choosing. Be sure to place

`from __future__ import division`

At the top of your file so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

In each of the following tasks, **you must use a recursive solution**. Here are the tasks you will need to complete for this assignment:

1. Write a function `fibonacci(n)` that takes as input an integer `n` which is greater than or equal to 0, and returns the `n`-th Fibonacci number. The 0th Fibonacci number is 0, the 1st Fibonacci number is 1, and all other Fibonacci numbers are the sum of the previous two (e.g., the 2nd is the sum of the 1st and the 0th; the 3rd is the sum of the 2nd and the 1st; the 4th is the sum of the 3rd and 2nd; and so on.) **Note:** this function may not work with very large values of `n`; that is to be expected and you will not be penalized. 
2. Write a function `tribonacci(n)` that takes as input an integer `n` which is greater than or equal to 0, and returns the `n`-th Tribonacci number. The 0th Tribonacci number is 0, the 1st Tribonacci number is also 0, the 2nd Tribonacci number is 1, and all other Tribonacci numbers are the sum of the previous three (e.g., the 3rd is the sum of the 2nd, 1st and 0th; the 4th is the sum of the 3rd, 2nd, and 1st; the 5th is the sum of the 4th, 3rd, and 2nd; and so on.) **Note**: this function may not work with very large values of `n`; that is to be expected and you will not be penalized. 
3. Write a function `multiply(a,b)` that takes as input two positive numbers `a` and `b` and returns `a*b` **but without using the `*` operator.** Instead, you should rely on the fact that `a*b = a+a+a+a+...+a` (where there are `b` many `a`'s). For example, `2*5 = 2+2+2+2+2`. **Note:** this function may not work with very large values of `a` and `b`; that is to be expected and you will not be penalized. 
4. Write a function `exponent(a,b)` that takes as input two positive numbers `a` and `b` and returns `a**b` but **without using the `**` operator.** Instead, you should rely on the fact that `a**b = a*a*a*a*...*a` (where there are `b` many `a`'s). For example, `2**5 = 2*2*2*2*2`. **Note**: this function may not work with very large values of `a` and `b`; that is to be expected and you will not be penalized. 
5. Write a function `maximum(a)` that takes as input a non-empty list of numbers `a` and returns the largest number in the list `a`. You may not use the built-in `max` function. **Note:** this function should work even if `len(a)` is very large.