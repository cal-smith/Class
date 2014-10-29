#include <vector>
#include <iostream>
#include <algorithm>
#include <string>

void print_each (std::vector<int> v){	
	for_each(v.begin(), v.end(), [v] (int i) {
		if (i != v.back()){
			std::cout << i << ",";
		} else {
			std::cout << i;
		}
	});
	std::cout << "\n";
}