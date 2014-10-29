#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int pose_question(char *question, char *a, char *b, char *c, char *d, char *correct_answer){
	printf("\n%s\n A: %s\n B: %s\n C: %s\n D: %s\n", question, a, b, c, d);
	
	char answer[3];
	printf("Answer:");
	fgets(answer, 3, stdin);
	
	int answered = 0;
	while (answered == 0){
		if (strcmp(answer, "a\n") == 0 || strcmp(answer, "b\n") == 0 || strcmp(answer, "c\n") == 0 || strcmp(answer, "d\n") == 0){
			answered = 1;
		} else {
			printf("(a, b, c, or d):");
			fgets(answer, 3, stdin);
		}
	}

	if (strncmp(answer, correct_answer, 1) == 0){
		puts("Correct! score ++");
		return 1;
	} else {
		puts("False");
		return 0;
	}
}

int play(){
	int score = 0;
	score += pose_question("[x for x in range(5)] is a:", "For loop", "While Loop", "Magic", "List Comprehension", "d");
	score += pose_question("Python is a:", "Interpreted Language", "Compiled Language", "Punchcard Language", "Foreign Language", "a");
	score += pose_question("Where is John's office?", "1170 HP", "5380 HP", "4155 HP", "KM-TH SA", "b");
	score += pose_question("Linux was originally programmed by:", "Ken Thompson and Dennis Ritchie", "Richard Stallman", "Linus Torvalds", "DEVELOPERS DEVELOPERS DEVELOPERS DEVELOPERS", "c");
	score += pose_question("What algorithm was Google founded on?", "MapReduce", "PageRank", "GoogleRank", "A* Graph Search", "b");
	
	printf("\nscore: %d\n", score);
	if (score > 5){
		puts("hacker");
	} else if (score >= 4){
		puts("10/10 good job!");
	} else if (score >= 2){
		puts("it went okay");
	} else {
		puts("awww...");
	}
	
	while (1){
		char again[3];
		printf("\nplay again? y/n:");
		fgets(again, 3, stdin);
		if (strcmp(again, "y\n") == 0){
			play();
		} else if (strcmp(again, "n\n") == 0){
			puts("bye!");
			return 0;
		}
	}
}

int main(int argc, char const *argv[]){
	play();
	return 0;
}
