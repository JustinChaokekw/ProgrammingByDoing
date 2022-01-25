#include <iostream>
#include <cmath>
using namespace std;

double distance ( int x1 , int x2 , int y1 , int y2 ){
    double d = sqrt( pow ( ( x2 - x1 ) , 2 ) + pow ( ( y2 - y1 ) , 2 ) );
    return d;
}

int main() {
    
    double first = distance(-2,1 , 1,5);
    cout << "\n(-2,1) to (1,5) => " << first;

    double second = distance(-2,-3 , -4,4);
    cout << "\n(-2,-3) to (-4,4) => " << second;

    cout << "\n(2,-3) to (-1,-2) => " << distance(2,-3 , -1,-2);

    cout << "\n(4,5) to (4,5) => " << distance(4,5 , 4,5);
}