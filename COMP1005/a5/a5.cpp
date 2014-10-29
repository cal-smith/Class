#include <set>
#include <map>
#include <vector>
#include <iterator>
#include <iostream>
#include <algorithm>
#include "a5.h"

using namespace std;

vector<int> unique(vector<int> a){
    set<int> b{a.begin(), a.end()};
    vector<int> y;
	for (std::vector<int>::iterator i = a.begin(); i != a.end(); ++i){
		if (b.count(*i) != 0){
			y.push_back(*i);
			b.erase(*i);
		}
	}
    return y;
}

vector<int> pos_and_neg(vector<int> a){
	set<int> b{a.begin(), a.end()};
	vector<int> y;
	for (std::vector<int>::iterator i = a.begin(); i != a.end(); ++i){
		if (b.count(*i) && b.count(-*i)){
			y.push_back(*i);
		}
	}
    return y;
}

string encrypt(string s, map<char, char> d){
	string y;
	for(char& c : s){
		if (d.count(c) == 1){
			y += d.find(c)->second;
		} else {
			y += "?";
		}
	}
    return y;
}

int main(int argc, char const *argv[]){
	auto lambda = []{ cout << "lambda!\n";};

	vector<int> v = unique(vector<int> {2,1,3,1,4});
	print_each(v);

	vector<int> v2 = pos_and_neg(vector<int> {-1,-2,3,1,2});
	print_each(v2);
	map<char, char> d = {{'a','m'}, {'b','d'}, {'c','l'}, {'d','x'}, {'e','j'}, {'f','t'}, {'g','u'}, {'h','k'}, {'i','z'}, {'j','d'}, {'k','o'}, {'l','y'}, {'m','i'}, {'n','v'}, {'o','p'}, {'p','q'}, {'q','f'}, {'r','c'}, {'s','r'}, {'t','b'}, {'u','j'}, {'v','w'}, {'w','n'}, {'x','h'}, {'y','s'}, {'z','a'}};
	string v3 = encrypt("supercalifragilisticexpialidocious", d);
	cout << v3 << "\n";
    return 0;
}
