A10
====

Reference: a10.py

Implementations in:

---
Create a file called **a10.py** in a directory of your choosing. Be sure to place

`from __future__ import division`

At the top of your file so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

This assignment is about **general problem-solving** using Python. You can (and likely should) use any of the code we have written in class or in the tutorials. Only the first task is restricted in how you should approach it (see note below). You are free to define whatever other functions you feel are necessary and/or useful. Here are the tasks you will need to complete for this assignment:

1. Write a function `recursive_binary_search_better(a,x)` that takes as input a non-empty list of numbers `a` and a number `x` and returns the **index** of the smallest element in `a` that is greater than or equal to `x`. If such an element does not exist (i.e., x is greater than any element of a), then the value `None` should be returned.  **Note: you must use recursion for your solution to this task;** we already saw in class how to do this non-recursively.
2. Write a function `sum_of_two_largest(a)` that takes as input a non-empty list of numbers `a` and returns the sum of the two largest numbers in `a`. Your solution does not necessarily have to be recursive.
3. Write a function `sum_of_smallest_half(a)` that takes as input a non-empty list of numbers `a` and returns the sum of the smallest `len(a)//2` elements in `a`. Your solution does not necessarily have to be recursive.
4. Write a function `median(a)` that takes as input a non-empty list of numbers `a` and returns a number `x` such that at least `len(a)//2` elements in `a` are smaller than or equal to `x` and at least `len(a)//2` elements in `a` are greater than or equal to `x`. Your solution does not necessarily have to be recursive.
5. Write a function `majority(a)` that takes as input a non-empty list of numbers `a` and returns a number `x` such that `x` occurs at least `len(a)//2 + 1` times in `a` (i.e., more than half of the elements in `a` are equal to `x`). If such an element does not exist (i.e., no element `x` occurs at least `len(a)//2 + 1` times in `a`), then the value `None` should be returned. Your solution does not necessarily have to be recursive.

**Efficiency is important.** Your functions should all work on lists of length one million (although it may take a few seconds to get an answer).