#include <iostream>

using namespace std;

class ball {
	public:
		int x;
		int y;

	ball(){
		this->x = 0;
		this->y = 0;
	}

	ball (int x, int y) {
		this->x = x;
		this->y = y;
	}

	ball& movex(int amount);

	void print();
};

ball& ball::movex(int amount) {
	this->x += amount;
	return *this;
}

void ball::print(){
	cout << "(" << this->x << ", " << this->y << ")" << endl;
}

int main () {
	ball *b = new ball(5, 10);
	ball b2;
	b->movex(5).print();
	b2.movex(5).print();
	return 0;
}
