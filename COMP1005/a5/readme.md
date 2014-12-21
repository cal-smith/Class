A5
====

Reference: a5.py

Implementations in:

---
Create a file called **a5.py** in a directory of your choosing. Be sure to place

`from __future__ import division`

At the top of your file so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

Here are the tasks you will need to complete for this assignment:

1. Define a function `unique(a)` that takes a list of numbers `a` and returns a new list where each element of `a` occurs only once. The new list should have its elements in the same order as they appear in `a`. Your function must use a set.
2. Define a function `pos_and_neg(a)` that takes a list of numbers `a` and returns a new list that contains each element `x` in `a` such that `-x` is also in `a`. The new list should have its elements in the same order as they appear in `a`. Your function must use a set.
3. Define a function `encrypt(s,d)` that takes a string `s` and a dictionary `d` and returns an encrypted version of the string `s`. To accomplish this, create a new string that replaces every letter `i` of `s` with the letter `d[i]` if such a key exists, or "?" otherwise.

Here is how the functions should work in interactive mode.

```Python
>>> print unique([1,1,2,3,2])
[1, 2, 3]

>>> print unique([2,1,3,1,4])
[2, 1, 3, 4]

>>> print pos_and_neg([1,2,3,-1,-3])
[1, 3, -1, -3]

>>> print pos_and_neg([-1,-2,3,1,2])
[-1, -2, 1, 2]

>>> d = { 'a' : 'm', 'b' : 'd', 'c' : 'l', 'd' : 'x', 'e' : 'j', 'f' : 't', 'g' : 'u', 'h' : 'k', 'i' : 'z', 'j' : 'd', 'k' : 'o', 'l' : 'y', 'm' : 'i', 'n' : 'v', 'o' : 'p', 'p' : 'q', 'q' : 'f', 'r' : 'c', 's' : 'r', 't' : 'b', 'u' : 'j', 'v' : 'w', 'w' : 'n', 'x' : 'h', 'y' : 's', 'z' : 'a' }

>>> print encrypt('hello', d)
kjyyp

>>> print encrypt('Hello', d)
?jyyp
```