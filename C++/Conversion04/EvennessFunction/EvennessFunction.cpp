#include <iostream>
#include <cmath>
#include <math.h>
#define _USE_MATH_DEFINES
using namespace std;

bool isEven( int x ){
    if( x % 2 == 0 ){
        return true;
    }else{
        return false;
    }
}

bool isTriple( int x ){
    if( x % 3 == 0 ){
        return true;
    }else{
        return false;
    }
}

int main(){
    int bla[20];
    int* Pbla = &bla[0];
    for( int j = 0 ; j < 20 ; j++ ){
        bla[j] = ( j + 1 );
    }
    for( int i = 0 ; i < 20 ; i++ ){
        if( isEven( *( Pbla + i )) == true && isTriple( *( Pbla + i )) == true ){
            cout << *( Pbla + i ) << " " << ":)" << " " << ":D" << endl;
        }else if( isEven( *( Pbla + i )) == false && isTriple( *( Pbla + i )) == true ){
            cout << *( Pbla + i ) << " " << ":D" << endl;
        }else if( isEven( *( Pbla + i )) == true && isTriple( *( Pbla + i )) == false ){
            cout << *( Pbla + i ) << " " << ":)" << endl;
        }else{
            cout << *( Pbla + i ) << endl;
        }
    }
}