T1
====

Reference: t1.py

Implementations in: Java, Clojure, Ruby

---

Create a file called t1.py somewhere in your user directory. At the top of t1.py, you should put

`from __future__ import division`

so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

Write definitions for the following functions:

* `kilometers2miles(d)`, which returns a number of miles that is equal to `d` kilometers
* `circumference(r)`, which returns the circumference of a circle with radius `r`
* `average(x,y)`, which returns the average of the two numbers `x` and `y`
* `greet(name)`, which prints `Hi, [name]!`
* `s2dhms(t)`, which returns `t` seconds expressed as `(days, hours, minutes, seconds)`, where `hours` must be less than 24, `minutes` must be less than 60, and `seconds` must be less than 60
* `dhms2s(d,h,m,s)`, which returns a number of seconds equivalent to `d` days, `h` hours, `m` minutes, and `s` seconds.

After writing the definitions for these functions, include the following lines of code at the end of t1.py:

```python
print kilometers2miles(0)
print kilometers2miles(3)
print circumference(0)
print circumference(2)
print average(0,0)
print average(0,1)
print average(1,0)
print average(1,3)
greet("John")
print s2dhms(0)
print s2dhms(90061)
print dhms2s(0,0,0,0)
print dhms2s(1,1,1,1)
print dhms2s(1,2,3,4)
```

Once you have finished this, be sure to save t1.py. Open the command prompt and navigate to the directory in which you saved t1.py. Run `python t1.py` and ensure that no errors have occurred.