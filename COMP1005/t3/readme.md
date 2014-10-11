T3
====

Reference: t3.py

Implementations in:

---

Create a file called t3.py somewhere in your user directory. At the top of t3.py, you should put

`from __future__ import division`

so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

In this tutorial, we will create a dice game where the user guesses if the value of the roll of two dice will be **high**, **low**, or **seven**. You should follow the steps below.

1. Put `import random` before the rest of your code so that you can generate random rolls
2. Define a function `roll_die()` that "rolls a 6-sided die" (i.e., generates a random integer between 1 and 6, inclusive). You will likely want to use the function `random.randint` to do this (see Lecture 5, or look it up using your favourite search engine).
3. Welcome the user to your game by printing a greeting. 
4. Inform the user of how many points they have (initially, the user should have 10 points).
5. Allow the user to make a guess: high, low, or seven. The guess "high" means "greater than 7", the guess "low" means "less than 7", and the guess "seven" means "exactly 7".
6. Use your `roll_die()` function to generate two random rolls.
7. Compute the total value rolled.
8. Inform the user of the value of each die as well as the total value of both rolls
9. Let the user know if their guess was right or wrong, and award points accordingly:
	* if the user was correct and the answer was "high" or "low", they get 1 point
	* if the user was correct and the answer was "seven", they get 2 points
	* otherwise, if the user was wrong or entered an invalid guess, they lose 1 point
10. Ask the user if they would like to play again. If they would, return to Step 4. Otherwise, tell them their final score, print a goodbye message, and exit the program.
11. If the user's points reach 0, then tell them that they ran out of points and exit the program.

Once you have finished, be sure to save t3.py. Open the command prompt and navigate to the directory in which you saved t3.py. Run python t3.py and ensure that no errors have occurred. When python t3.py runs with no errors, call a TA over and show the TA your game and your code.

Extra features you can add if you have time:

* Print out a picture of the dice instead of just printing their value. Here is an example what they could look like:
```
+-----+ +-----+ +-----+ +-----+ +-----+ +-----+ 
|     | |*    | |*    | |*   *| |*   *| |*   *| 
|  *  | |     | |  *  | |     | |  *  | |*   *| 
|     | |    *| |    *| |*   *| |*   *| |*   *| 
+-----+ +-----+ +-----+ +-----+ +-----+ +-----+ 
```
* Allow the user to roll a different number of dice. In this case, instead of guessing "seven", they should guess the middle number in the range of possible values.
* Allow the user to bet on their guess, so that the points won or lost depend on the value of the bet.