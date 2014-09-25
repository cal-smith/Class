T2
====

Reference: t2.py

Implementations in: Java, Clojure

---

Create a file called t1.py somewhere in your user directory. At the top of t1.py, you should put

`from __future__ import division`

so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

Write definitions for the following functions:

* `multiply_list(a)`, which takes a list of numbers `a` and returns the product of all of the numbers in the list.
* `join_strings(a)`, which takes a list of strings `a` and returns a string that consists of all of the strings ofa combined (in order) to produce a single string.
* `square(a)`, which takes a list of numbers `a` and returns a list consisting of each of the elements of `a` squared in the same order as they appear in `a` .
*` describe_seconds(s)`, which takes a number `s` of seconds and returns a string describing that number of seconds:
if `s < 60`, then return a string that says `"%d seconds"` (with appropriate substitutions).
if `60 ≤ s < 3600`, then return a string that says `"%d minutes and %d seconds"` (with appropriate substitutions).
if `3600 ≤ s < 86400`, then return a string that says `"%d hours, %d minutes and %d seconds"` (with appropriate substitutions).
otherwise, return a string that says `"a long time"`

After writing the definitions for these functions, include the following lines of code at the end of t2.py:

```python
print multiply_list(range(1,5))
print multiply_list(range(3,5))
print multiply_list([1,1,1])
print join_strings(["Hello", " ", "World!"])
print join_strings(["Look ", "at ", "my ", "function!"])
print square(range(5))
print square([0,1,2,2,1,0])
print describe_seconds(5)
print describe_seconds(70)
print describe_seconds(3700)
print describe_seconds(90000)
```

Once you have finished this, be sure to save t2.py. Open the command prompt and navigate to the directory in which you saved t2.py. Run `python t2.py` and ensure that no errors have occurred.