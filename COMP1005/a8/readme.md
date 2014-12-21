A7
====

Reference: avoid.py

---
In this assignment, you will be making a game similar to the Asteroids-like game we made in class. Instead of shooting at asteroids, the user will control a small spaceship that will have to avoid them.

Follow these steps to create your game:

1. Create a file called **avoid.py**.
2. Create the following classes: `Spaceship` and `Asteroid`. You may use as much of the code from the lectures as you feel is useful. Be sure to obtain some reasonable images for each (you may use the asteroids from class, but should find your own **appropriately licensed** spaceship image.) Neither image needs to be animated, but can be if you wish.
  - The `Spaceship` class should have methods to initialize it to a particular position and move it to a particular position, as well as draw it. You may also define any other methods you feel are useful.
  - The `Asteroid` class should have methods to initialize it to a particular position and angle, advance it by a certain speed, as well as draw it. You may also define any other methods you feel are useful.
3. The game works the following way:
  - The background of the window should be an **appropriately licensed** space-like image.
  - The position of the spaceship is controlled by the player's mouse. Wherever the cursor is located is where the spaceship should be drawn. **The orientation of the spaceship doesn't matter. There is no need to rotate it.**
  - The asteroids are positioned randomly **near the top of the screen** and given a random angle.
 - There should be six asteroids visible on the field at any time. 
 - The asteroids should move at a reasonable speed across the field according to their angle (where "reasonable" means challenging to avoid, but not impossible).
 - If an asteroid collides with the spaceship, the game is over: an explosion sound should be played and then the game should exit. Nothing happens if an asteroid collides with another asteroid; they just pass over each other.
 - At all times, there should be **appropriately licensed** background music of some kind playing.

Here is how your completed assignment might look (since this is just a GIF, there isn't any audio):
[](http://img) 