#include <iostream>

using namespace std;

int constarray(char chararray[], int len){
	int upper = 0;
	for (int i = 0; i < len; ++i){
		if (isupper(chararray[i])){
			upper++;
		}
	}
	return upper;
}

int main(){
	char array[10] = {'a', 'B', 'c', 'd', 'E', 'F', 'G', 'h', 'i', 'J'};
	char array2[4] = {'a', 'b', 'c', 'd'};
	char array3[4] = {'A', 'B', 'C', 'D'};
	cout << "uppercase (should be 5): "<< constarray(array, 10) << endl;
	cout << "uppercase (should be 0): "<< constarray(array2, 4) << endl;
	cout << "uppercase (should be 4): "<< constarray(array3, 4) << endl;
	return 0;
}