#include <iostream>

using namespace std;

void drawx (int x){
	for (int i = x; i >= 0; i--){
		if (i != 5) {
			for (int j = i; j < x-1; j++){
				cout << " ";
			}
			for (int j = 0; j < x-i; j++){
				cout << "#";
			}
			for (int j = 0; j < i+(i*3); j++){
					cout << " ";
			}
			if (i != 0){
				cout << " ";
			}
			for (int j = 0; j < x-(i); j++){
				cout << "#";
			}
			if (i == 0){
				cout << "#";
			}
			cout << endl;
		}
	}
	for (int i = 0; i < x; i++){
		for (int j = i; j < x-1; j++){
			cout << " ";
		}
		for (int j = 0; j < x-i; j++){
			cout << "#";
		}
		for (int j = 0; j < i+(i*3); j++){
			cout << " ";
		}
		if (i != 0){
			cout << " ";
		}
		for (int j = 0; j < x-(i); j++){
			cout << "#";
		}
		if (i == 0){
			cout << "#";
		}
		cout << endl;
	}
}

int main(){
	drawx(5);
	/*
	also works for arbirarily large or small numbers
	drawx(10);
	drawx(2);
	the paramater effectivly specifices the size of 
	one "arm" of the shape
	*/
	return 0;
}