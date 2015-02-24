#include <iostream>

using namespace std;

struct Point {
	int x;
	int y;
};

void foo (){
	Point point;
	point.x = 1;
	point.y = 2;
	Point *ppoint = &point;
	Point rpoint = point;
	cout << point.x << ", " << point.y << endl;
	ppoint->x = 3;
	rpoint.x = 4;
	cout << point.x << " " << ppoint->x  << " " << rpoint.x << endl;
}

Point bar(){
	Point p = {1, 2};
	return p;
}

int main(){
	//foo();
	Point a = bar();
	cout << a.x << endl;
	return 0;
}
