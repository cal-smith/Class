A6
====

Reference: a6.py

Implementations in:

---
Create a file called **a6.py** in a directory of your choosing. Be sure to place

`from __future__ import division`

At the top of your file so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

Here are the tasks you will need to complete for this assignment:

1. Define three classes `A`, `B`, and `C` such that `C` is a subclass of `B`,  `B` is a subclass of `A`, and `A`  is a subclass of `object`.
2. The `__init__` method in each of these classes takes one parameter `n` (in addition to `self`).
  1. In `C`, set an attribute `self.c` to have value `n`, and call the `__init__` method of `B` with the value `2*n+3`.
  2. In `B`, set an attribute `self.b` to have value `n`, and call the `__init__` method of `A` with the value `n//3 + 2`.
  3. In `A`, set an attribute `self.a` to have value `n`.
3. Define a `total` method in each class that takes no parameters (except for `self`).
  1. In `C`, it returns the sum of `self.c` and the value returned by calling the `total` method in its superclass.
  2. In `B`, it returns the sum of `self.b` and the value returned by calling the `total` method in its superclass.
  3. In `A`, it returns `self.a`.
4. Find and print the value of `i` such that `C(i).total()` evaluates to `31337`.