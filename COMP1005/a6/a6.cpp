#include <iostream>

using namespace std;

class A{
	int a;
public:
	A(int n) : a(n) {}
	int total(){return a;};
};

class B{//inherits from a
	A a;
	int b;
public:
	B(int n) : a(n/3+2), b(n) {}
	int total(){return b + a.total();};	
};

class C{//inherits from b
	B b;
	int c;
public:
	C(int n) : b(2*n+3), c(n) {}
	int total(){return c + b.total();};	
};

int main(int argc, char const *argv[]){
	auto lambda = []{ cout << "lambda!\n";};
	lambda();
	for (int i = 0; i < 10000; ++i){
		if (C(i).total() == 31337){
			cout << "i = " << i << "\n";
			printf("C(%d).total() = %d\n", i, C(i).total());
		}
	}
    return 0;
}