#include <iostream>

typedef char* astring;

using namespace std;

char at(astring s, int i){
    return s[i];
}

int len(astring s){
    int size = 0;
    while (s[size] != '\0') {
        size++;
    }
    return size;
}

astring push(astring s, char c){
    int size = len(s);
    astring r = new char[size+2];
    for (int i = 0; i < size; i++) {
        r[i] = s[i];
    }
    r[size] = c;
    r[size+1] = '\0';
    return r;
}

astring push(astring x, astring y){
    int xsize = len(x);
    int ysize = len(y);
    astring r = new char[xsize+ysize+1];
    for (int i = 0; i < xsize; i++) {
        r[i] = x[i];
    }
    for (int i = 0; i < ysize; i++) {
        r[i+xsize] = y[i];
    }
    r[xsize+ysize] = '\0';
    return r;
}

astring pushf(astring x, astring y){
    return push(y, x);
}

int main(){
    astring a = new char[6];
    a[0] = 'h';
    a[1] = 'e';
    a[2] = 'l';
    a[3] = 'l';
    a[4] = 'o';
    a[5] = '\0';
    cout << at(a, 2) << endl;
    astring b = push(a, '!');
    cout << b << endl;
    delete [] a;
    a = push(a, ' ');
    astring c = push(a, b);
    cout << c << endl;
    delete [] a;
    delete [] b;
    delete [] c;
    return 0;
}