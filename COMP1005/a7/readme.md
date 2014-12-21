A7
====

Reference: a7q1.py, a7q2.py, a7q3.py, a7q4.py, a7q5.py, and a7q6.py

---
Copy and paste the **template** below into **six files** and save them as **a7q1.py, a7q2.py, a7q3.py, a7q4.py, a7q5.py, and a7q6.py.** These files will contain your answers for Questions 1, 2, 3, 4, 5, and 6, respectively.

```Python
from __future__ import division
import pygame

# initialize pygame
pygame.init()

# set up the screen
width = 640
height = 480
size = (width, height)
screen = pygame.display.set_mode(size)

# specify how many frames per second should be drawn
fps = 60 # you may want to change this!

# set up the clock
clock = pygame.time.Clock()

while True:
	# draw a specified number of frames per second
	clock.tick(fps) 

	# check to see if the user wants to quit
	for event in pygame.event.get():
		if event.type == pygame.QUIT:
			exit()

	# do stuff here
	# ...

	# draw everything onto the screen
	pygame.display.flip()
```

In this assignment, you will modify the above template in each of the six questions. **Each question is completely independent of all other questions, therefore you should start with the above template for each question.**

Here are the tasks you will need to complete for this assignment:

1. Modify the **template** above so that the background colour is red. For example:  
[](http://img)  

2. Modify the **template** above so that the background colour changes continuously between red, green, blue, black, and white. The background colour should change once per second, so be sure to adjust the `fps` variable accordingly. (Warning: if you forget to change the `fps` variable or do so inappropriately, the colours may change very quickly. This can be problematic for those with certain photosensitivity conditions such as epilepsy.) For example:  
[](http://img)

3. Modify the **template** above to place the image below into the center of the screen. To download the image, right-click (or the Mac equivalent) and select "Save as". Remember to place it in the same directory as your Python code. The image is:
[](http://img)
and the window should look like:
[](http://img)

4. Modify the **template** above to place the image from Question 3 in the center of the screen and rotate counter-clockwise continuously at a rate of one complete revolution every two seconds. (Note: you should look at the Pygame documentation for the function pygame.transform.rotate.) For example: 
[](http://img)

5. Modify the **template** above to move the image from Question 3 along the bottom edge of the window from left to right and back continuously. It should take two seconds to travel from the one side of the window to the other. For example:
[](http://img)

6. Modify the **template** above to roll the image from Question 3 along the bottom edge of the window from left to right and back continuously. It should rotate while moving in a realistic way: when moving left-to-right it should rotate clockwise, and when moving right-to-left it should rotate counterclockwise. It should take two seconds to travel from the one side of the window to the other. For example:
[](http://img)

Note: the animations above are not perfectly looped, so they stutter a bit at the end before they repeat. Your implementation should not.