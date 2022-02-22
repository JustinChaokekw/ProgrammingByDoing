#include <iostream>
#include <cmath>
using namespace std;

unsigned long long forpow( unsigned long long x , unsigned long long p ){
    unsigned long long dopple = x;
    unsigned long long test = 0;
    unsigned long long total = 0;
    for( unsigned long long i = 1 ; i <= 13 ; i++ ){
        test = dopple % 10;
        total = total + pow( test , p );
        dopple = dopple / 10;
    }
    return total;
}

int main(){
    unsigned long long totalefour = 0;
    cout << "all fourth: ";
    for( unsigned long long t = 1000 ; t <= 1000000 ; t++ ){
        if( t == forpow( t , 4 ) ){
            cout << t << " ";
            totalefour = totalefour + t;
        }
    }
    cout << "\n" << "sum for fourth: " << totalefour << "\n" << "all fifth: ";

    unsigned long long totalefive = 0;
    for( unsigned long long t = 1000 ; t <= 10000000 ; t++ ){
        if( t == forpow( t , 5 ) ){
            cout << t << " ";
            totalefive = totalefive + t;
        }
    }
    cout << "\n" << "sum for fifth: " << totalefive << "\n";

    unsigned long long totalesomething = 0;
    for( unsigned long long t = 1000 ; t <= 100000000 ; t++ ){
        if( t == forpow( t , 6 ) ){
            totalesomething = totalesomething + t;
        }
    }
    cout << "sum of sixth: " << totalesomething << "\n";

    unsigned long long totalesomething2 = 0;
    for( unsigned long long t = 1000 ; t <= 100000000 ; t++ ){
        if( t == forpow( t , 7 ) ){
            totalesomething2 = totalesomething2 + t;
        }
    }
    cout << "sum of seventh: " << totalesomething2 << "\n";

    unsigned long long totalesomething3 = 0;
    for( unsigned long long t = 1000 ; t <= 100000000000 ; t++ ){
        if( t == forpow( t , 10 ) ){
            totalesomething3 = totalesomething3 + t;
        }
    }
    cout << "sum of tenth: " << totalesomething3 << "\n";
}