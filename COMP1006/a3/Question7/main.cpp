#include <iostream>

using namespace std;

float averagescore(int scores[], int n) {
	float total = 0;
	for (int i = 0; i < n; i++){
		total += scores[i];
	}
	return total/n;
}

int main(){
	int num_scores = 10;
	int scores[num_scores];
	for (int i = 0; i < num_scores; i++){
		scores[i] = 0;
	}
	for (int i = 0; i < num_scores; i += 2){
		scores[i] = i;
	}
	cout << "Average score: " << averagescore(scores, num_scores) << endl;
	return 0;
}