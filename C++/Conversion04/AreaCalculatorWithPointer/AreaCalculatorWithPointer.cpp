#include <iostream>
#include <cmath>
#include <math.h>
#define _USE_MATH_DEFINES
using namespace std;

double triangle( double* b, double* h )
{
    double trarea = ( *b * *h / 2 );
    return trarea;
}

double rectangle( double* l, double* w )
{
    double rearea = ( *l * *w );
    return rearea;
}

double square( double* sl )
{
    double sqarea = ( pow( *sl , 2 ) );
    return sqarea;
}

double circle( double* r )
{
    double ciarea = ( M_PI * pow( *r , 2 ) );
    return ciarea;
}

int main()
{
    int response;
    double x, y;
    double* Px = &x;
    double* Py = &y;

    do{
        cout << "\n>>-==-vv-==-oo-==-vv-==-<<";
        cout << "\n";
        cout << "\n1) Triangle";
        cout << "\n2) Rectangle";
        cout << "\n3) Square";
        cout << "\n4) Circle";
        cout << "\n5) Exit";
        cout << "\n> ";
        cin >> response;

        if( response == 1 )
        {
            cout << "\nBase: ";
            cin >> x;
            cout << "\nHeight: ";
            cin >> y;

            cout << "\nThe area of the shape is " << triangle( Px, Py ) << ".";
        }
        else if( response == 2 )
        {
            cout << "\nLength: ";
            cin >> x;
            cout << "\nWidth: ";
            cin >> y;

            cout << "\nThe area of the shape is " << rectangle( Px, Py ) << ".";
        }
        else if( response == 3 )
        {
            cout << "\nSide Length: ";
            cin >> x;

            cout << "\nThe area of the shape is " << square( Px ) << ".";
        }
        else if( response == 4 )
        {
            cout << "\nRadius: ";
            cin >> x;

            cout << "\nThe area of the shape is " << circle( Px ) << ".";
        }
        else if( response == 5 )
        {
            cout << "Goodbye!";
        }
        else
        {
            cout << "Sorry, your request is invalid, please try again.";
        }
    }while( response != 5 );
}