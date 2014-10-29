#include <set>
#include <vector>
#include <iterator>
#include <iostream>

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

int encrypt(int s, int d){
    return 0;
}

int main(int argc, char const *argv[]){
	vector<int> v = {2,1,3,1,4};
	vector<int> v2 = unique(v);
	for (std::vector<int>::iterator i = v2.begin(); i != v2.end(); ++i){
		cout << *i;
	}
	cout << "\n";
    return 0;
}
