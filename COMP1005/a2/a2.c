#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*
 * Assignment 2
 */

/*
 * Question 1
 */

int factorial(int n){
	int x = 1;
	for (int i = 1; i < n + 1; ++i){
		x = x * i;
	}
	return x;
}

/*
 * Question 2
 */
int add_list(int a[]){
	int x = 0;
	int count = sizeof(a[0]);
	for (int i = 0; i < count; ++i)
	{
		x = x + a[i];
	}
	return x;
}

/*
 * Question 3
 */
int average(int a[]){
	return add_list(a) / sizeof(a[0]);
}

/*
 * Question 4
 */
int * threshold(int a[], int x){
	static int y[] = {0};
	int yi = 0;
	int count = sizeof(a[0]);
	for (int i = 0; i < count; ++i){
		if (a[i] >= x){
			y[yi] = a[i];
			++yi;
		}
	}
	return y;
}

/*
 * Question 5
 */
char * bmi_category(int bmi){
    if (bmi < 18.5) {
        return "underweight";
    } else if (bmi < 25){
        return "normal";
    } else if (bmi < 30){
        return "overweight";
    } else {
        return "obese";
    }
}

/*
 * Question 6
 */
int llog2(int n){
    int x = 0;
    while (n > 1) {
        n = n / 2;
        ++x;
    }
    return x;
}

int main(int argc, char const *argv[]){
    
	printf("factorial: %d\n", factorial(5));
	int aarray[4] = {3, 2, 3, 4};
	printf("add_list: %d\n", add_list(aarray));
	printf("average: %d\n", average(aarray));
    
	int tarray[5] = {1, 2, 5, 3, 6};
	printf("threshold: %d\n", *threshold(tarray, 4));
    
    printf("bmi_category: %s\n", bmi_category(18));
    
    printf("log2: %d\n", llog2(8));
    
	return 0;
}
