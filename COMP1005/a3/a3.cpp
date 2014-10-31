#include <map>
#include <string>
#include <vector>
#include <chrono>
#include <random>
#include <iostream>
#include <algorithm>

using namespace std;

int pose_question(string question, string answer_a, string answer_b, string answer_c, string answer_d, string correct_answer){
	cout<<"\n"<<question<<"\n A: "<<answer_a<<"\n B: "<<answer_b<<"\n C: "<<answer_c<<"\n D: "<<answer_d<<"\n";
	string answer;
	cout << "Answer: ";
	cin >> answer;
	bool answered = false;
	while (!answered){
		transform(answer.begin(), answer.end(), answer.begin(), ::tolower);
		if (answer == "a" || answer == "b" || answer == "c" || answer == "d"){
			answered = true;
		} else {
			cout << "(A, B, C or D): ";
			cin >> answer;
		}
	}

	if (answer == correct_answer){
		cout << "Correct ++score\n";
		return 1;
	} else {
		cout << "false\n";
		return 0;
	}
}

int play(){
	vector<map<string, string>> questions = {
		{
			{"question", "[x for x in range(5)] is a:"},
			{"a","For loop"},
			{"b","While Loop"},
			{"c","Magic"},
			{"d","List comprehension"},
			{"answer", "d"}
		},{
			{"question", "Python is a:"},
			{"a","Interpreted Language"},
			{"b","Compiled Language"},
			{"c","Punchcard Language"},
			{"d","Foreign Language"},
			{"answer", "a"}
		},{
			{"question", "Where is John's office?"},
			{"a","1170 HP"},
			{"b","5380 HP"},
			{"c","4155 HP"},
			{"d","KM-TH SA"},
			{"answer", "b"}
		},{
			{"question", "Linux was originally programmed by:"},
			{"a","Ken Thompson and Dennis Ritchie"},
			{"b","Richard Stallman"},
			{"c","Linus Torvalds"},
			{"d","DEVELOPERS DEVELOPERS DEVELOPERS DEVELOPERS"},
			{"answer", "c"}
		},{
			{"question", "What algorithm was Google founded on?"},
			{"a","MapReduce"},
			{"b","PageRank"},
			{"c","GoogleRank"},
			{"d","A* Graph Search"},
			{"answer", "b"}
		},
	};
	unsigned seed = std::chrono::system_clock::now().time_since_epoch().count();
	shuffle(questions.begin(), questions.end(), default_random_engine(seed));
	int score = 0;
	for_each(questions.begin(), questions.end(), [questions, &score] (map<string, string> q) {
		score += pose_question(q["question"], q["a"], q["b"], q["c"], q["d"], q["answer"]);
	});

	cout << "\nscore: " << score << "\n";
	if (score > 5){
		cout << "hacker";
	} else if (score >= 4){
		cout << "10/10 good job!";
	} else if (score >= 2){
		cout << "It went okay";
	} else {
		cout << "awww...";
	}

	while (1){
		string again;
		cout << "\nplay again? y/n:";
		cin >> again;
		transform(again.begin(), again.end(), again.begin(), ::tolower);
		if (again == "y"){
			play();
		} else if (again == "n"){
			cout << "bye!\n";
			return 0;
		}
	}
}

int main(int argc, char const *argv[]){
	//[]{cout << "Lambda!";}();
	play();
	return 0;
}