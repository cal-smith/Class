Create a file called a3.py in a directory of your choosing. Be sure to place

`from __future__ import division`

At the top of your file so the `/` operator uses real division. (Of course, you can always use `//` for integer division, if you need it.)

In this assignment, you will be creating a **quiz game**. You should follow the steps below.

1. Think of **five** multiple choice questions. Each question should have four possible answers (a, b, c, or d). Your questions should be general knowledge trivia (so that your TAs have a reasonable chance of getting some answers correct). The more creative and interesting the questions, the better!
2. Define a function `pose_question(question, answer_a, answer_b, answer_c, answer_d, correct_answer)` that does the following:
  1. **Prints** the string `question`
  2. **Prints** the strings `answer_a`, `answer_b`, `answer_c`, and `answer_d`, one per line, each **labelled** with their corresponding letter (a, b, c, or d)
  3. Prompts the user to enter their answer (a, b, c, or d) using `raw_input()`. If the user enters something unexpected (other than a, b, c, or d), you should prompt the user again until they give a proper answer.
  4. Checks whether or not the answer entered in the previous step matches the answer stored in `correct_answer`
    * If the answer is correct, the function should inform the user and return 1 (to indicate that the user scored 1 point)
    * Otherwise, the function should inform the user and return 0 (to indicate that the user scored 0 points)
3. Call the `pose_question` function with each of your five questions and their four possible answers, as well as the correct answer.
  * e.g.: `pose_question("Where is John's office?", "1170 HP", "5380 HP", "4155 HP", "KM-TH SA", "b")` might run like this:
  ```Python
  Where is John's office?
     (a) 1170 HP
     (b) 5380 HP
     (c) 4155 HP
     (d) KM-TH SA
  Enter answer: b
  That's correct! You get 1 point.
  ```
4. After all questions have been asked and answered, you should inform their user of their total score out of a possible five points. Give the user a creative message based on their score (e.g., "Perfect! Great job!" or "Wow, that's a very low score!"). 
5. Ask the user if they would like to play again.
If the user answers **yes**, go back to **Step 3**
Otherwise, if the user answers **no** or some other answer, the program should **exit**