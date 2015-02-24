#include <iostream>

using namespace std;

typedef char* arrayString;

//helper function
int len(arrayString s){
	int i = 0;
	while (s[i] != '\0'){
		i++;
	}
	return i;
}

void deleteLastCharacter(arrayString &s){
	int length = len(s);
	arrayString result = new char[length];
	for (int j = 0; j < length-1; j++){
		result[j] = s[j];
	}
	result[length] = '\0';
	delete [] s;
	s = result;
}

void reverseString(arrayString &s){
	int i = len(s);
	arrayString result = new char[i+1];
	int k = i-1, j = 0;//i-1 because we want to skip the null terminator in s
	while (s[j] != '\0'){
		//start at the end of the original string and count down
		//copying the value to the result string counting up
		result[j] = s[k];
		k--;
		j++;
	}
	result[i] = '\0';
	delete [] s;
	s = result;
}

int main(){
   	arrayString s = new char[7];
   	s[0] = 'h';
   	s[1] = 'e';
   	s[2] = 'l';
   	s[3] = 'l';
   	s[4] = 'o';
   	s[5] = '!';
   	s[6] = '\0';
   	cout << s << endl;
   	deleteLastCharacter(s);
   	cout << s << endl;
   	reverseString(s);
   	cout << s << endl;
   	delete [] s;
    return 0;
}
