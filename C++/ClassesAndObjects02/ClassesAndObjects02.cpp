#include <iostream>
#include <list>
#include <cmath>
#include <cstdlib>
#include <ctime>
using namespace std;

class triangle{
private: 
    int xa, ya, xb, yb, xc, yc;
    double w, x, y, azzzzz;
public: 
triangle( int a, int b, int c, int d, int e, int f ){
    xa = a;
    ya = b;
    xb = c;
    yb = d;
    xc = e;
    yc = f;

    w = sqrt( pow( (xa-xb) , 2 ) + pow( (ya-yb) , 2 ) );
    x = sqrt( pow( (xb-xc) , 2 ) + pow( (yb-yc) , 2 ) );
    y = sqrt( pow( (xc-xa) , 2 ) + pow( (yc-ya) , 2 ) );
    double s = ( w + x + y ) / 2;

    azzzzz = sqrt( s * (s-w) * (s-x) * (s-y) );
}

void Getinfo(){
    cout << "Side 1: " << w << endl;
    cout << "Side 2: " << x << endl;
    cout << "Side 3: " << y << endl;
    cout << "Area: " << azzzzz << endl;
}
};

int main(){
    srand((unsigned) time(0));
    int k = (rand() % 20) - 10;
    int l = (rand() % 20) - 10;
    int m = (rand() % 20) - 10;
    int n = (rand() % 20) - 10;
    int o = (rand() % 20) - 10;
    int p = (rand() % 20) - 10;

    triangle leb( k, l, m, n, o, p );
    leb.Getinfo();

    return 0;
}