#include <iostream>

using namespace std;

/*
this function acts as a black box in that the programmer needs 
to only supply an integer array, and the size of that array
when calling the function to get a sum of the smallest half of 
the array. It's not important to the programmer how the function
achives this, just that the answer returned is correct given
the expectations and assumptions presented by the function.
*/
int sum_of_smallest_half(int array[], int size){
	if (size == 1){
		return array[0];
	}
	sort(array, array + size);
	int sum = 0;
	for (int i = 0; i < size / 2; ++i){
		sum += array[i];
	}
	return sum;
}

int main() {
	int a1[] = {1, 1, 1, 1, 1, 1, 1, 1};
	int a2[] = {1, 2, 4, 6, 3, 20, 4, 8, 9, 6, 44, 2, 2, 45, 7, 6, 3, 23, 5, 7};
	int a3[] = {5};
	cout << sum_of_smallest_half(a1, 8) << endl;
	cout << sum_of_smallest_half(a2, 20) << endl;
	cout << sum_of_smallest_half(a3, 1) << endl;
	return 0;
}