#include <iostream>
#include <regex>
#include <string>

using namespace std;

void luhn (string n) {
	cout << n << endl;
	for (int i = 0; i >= 0; i--){
		string::size_type sz;
		int x = stoi(n, &sz);
		cout << x;
	}
}

/*string strip_joy(string x){
	regex reg("yay");
	return regex_replace(x, reg, " ");
}

void lel(){
	for (int i = 0; i < 5; i++){
		for (int j = 0; j <= 4-i; j++){
			cout << "#";
		}
		cout << endl;
	}
}

void varlel(int size){
	for (int i = 0; i < size; i++){
		for (int j = 0; j <= (size-1)-i; j++){
			cout << "#";
		}
		cout << endl;
	}
}

void k (){
	for (int i = 0; i < 7; i++){
		for (int j = 0; j <= 3 - abs(3 - i); j++){
			cout << "#";
		}
		cout << endl;
	}
}*/

int main(){
	/*cout << "weeeee" << endl;
	cout << strip_joy("wordsyaywords") << endl;
	lel();
	varlel(10);
	k();*/
	cout << "#";
	string n;
	cin >> n;
	luhn(n);
	return 0;
}