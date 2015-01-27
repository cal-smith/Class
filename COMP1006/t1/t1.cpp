#include <iostream>
#include <algorithm>

using namespace std;

int findMissing(int array[], int size){
	sort(array, array + size);
	for (int i = 0; i < size; ++i){
		if (i < size - 1  && array[i] != (array[i+1] - 1)){
			return array[i] + 1;
		}
	}
	return 0;
}

bool isSorted(int array[], int size){
	int correct = 0;
	int sorted[size];
	for (int i = 0; i < size; ++i){
		sorted[i] = array[i];
	}
	sort(sorted, sorted + size);
	for (int i = 0; i < size; ++i){
		if (sorted[i] == array[i]){
			correct++;
		}
	}
	if (correct == size) {
		return true;
	} else {
		return false;
	}
}

void word(){
	char in = cin.get();
	int words = 0;
	int longest = 0;
	int currentlongest = 0;
	int mostvowels = 0;
	int currentvowels = 0;
	while (in != '\n'){
		if (in != ' '){
			currentlongest++;
		}

		if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u'){
			currentvowels++;
		}

		if (in == ' '){
			words++;
			if (currentlongest > longest){
				longest = currentlongest;
				currentlongest = 0;
			}
			if (currentvowels > mostvowels){
				mostvowels = currentvowels;
				currentvowels = 0;
			}
		}

		in = cin.get();
	}
	if (in != ' '){
		words++;
	}
	if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u'){
		currentvowels++;
	}
	if (currentlongest > longest){
		longest = currentlongest;
		currentlongest = 0;
	}
	if (currentvowels > mostvowels){
		mostvowels = currentvowels;
		currentvowels = 0;
	}
	cout << "words: " << words << endl;
	cout << "longest word len: " << longest << endl;
	cout << "most vowels: " << mostvowels << endl;
}

int main(){
	word();
	int a1[] = {1, 2, 3};
	int a2[] = {2, 1, 3};
	cout << "sorted? " << isSorted(a1, 3) << endl;
	cout << "sorted? " << isSorted(a2, 3) << endl;
	int aa1[] = {3, 1, 4, 5, 9, 2, 6, 8, 10};
	int aa2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	cout << "missing: " << findMissing(aa1, 9) << endl;
	cout << "missing: " << findMissing(aa2, 9) << endl;
	return 0;
}