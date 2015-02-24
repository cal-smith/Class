#include <iostream>
//#include 
using namespace std;

class flower{
	public:
		string color;
		int height;
		float percentWater;

	flower (string color, int height, float percentWater){
		this->color = color;
		this->height = height;
		this->percentWater = percentWater;
	}

	void print() {
		cout << this->color << " (" << this->height << " cm, "
		<< this->percentWater << "% water)" << endl;
	}
	void grow(){
		this->height += 2;
		this->percentWater -= 0.05f;
	}

	void water(){
		this->percentWater += 0.1f;
	}
};

int main(){
	flower f = flower("purple", 10, 0.5f);

	f.print();
	f.water();
	f.print();
	f.grow();
	f.print();

	return 0;
}