#include <iostream>
#include <cmath>
#include <math.h>
#include <ctime>
#include <cstdlib>
#define _USE_MATH_DEFINES
using namespace std;

int main(){
    srand((unsigned) time(0));

    int AR[10];
    int* PAR = &AR[0];
    int highest = 0;
    int val;
    for( int i = 0 ; i < 10 ; i++ ){
        *( PAR + i ) = rand()%90+10;
    }
    for( int j = 0 ; j < 10 ; j++ ){
        if( *( PAR + j ) > highest ){
            highest = *( PAR + j );
            val = j + 1;
        }else{}
    }

    cout << endl << "Array: ";
    for( int k = 0 ; k < 10 ; k++ ){
        cout << AR[k] << " ";
    }
    cout << endl << endl << "The largest value is " << highest << ".";
    cout << endl << "It is in slot " << val << "." << endl << endl;
}