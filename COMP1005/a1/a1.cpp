#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

float f2c(int t){
	return (t - 32) * 5 / 9;
}

float lboz2kg(int p, int o){
	return ((p * 16) + o) / 35.274;
}

vector<int> in2ftin(int h){
	if (h < 12){
		return {0, h};
	} else {
		return {h / 12, ((h / 12) - (h / 12)) * 10};
	}
}

string bibformat_mla(string author, string title, string city, string publisher, string year){
	return author + ". " + title + ". " + city + ": " + publisher + ", " + year;
}

string bibformat_apa(string author, string title, string city, string publisher, string year){
	return author + " (" + year + "). " + title + ". " + city + ": " + publisher + ".";
}

float bmi(int w, int h){
	return (w / (h * h)) * 703;
}

void bmi_calculator(){
	string name;
	int weight, height;
	cout << "Name:";
	cin >> name;
	cout << "Enter weight:";
	cin >> weight;
	cout << "Enter height:";
	cin >> height;
	cout << "Looks like " << name << "'s BMI is "<< bmi(weight, height) << endl;
}

int main(int argc, char const *argv[]){
	cout << f2c(80) << endl;
	cout << lboz2kg(50, 80) << endl;
	cout << in2ftin(120)[0] << ", " << in2ftin(120)[1] << endl;
	cout << bibformat_mla("Randall Munroe", "what if?", "New York", "Houghton Mifflin Hardcourt", "2014") << endl;
	cout << bibformat_apa("Randall Munroe", "what if?", "New York", "Houghton Mifflin Hardcourt", "2014") << endl;
	cout << bmi(180, 70) << endl;
	bmi_calculator();
	return 0;
}