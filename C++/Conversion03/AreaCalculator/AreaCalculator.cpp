#include <iostream>
#include <cmath>
#include <math.h>
#define _USE_MATH_DEFINES
using namespace std;

double triangle( double b, double h )
{
    double trarea = ( b * h / 2 );
    return trarea;
}

double rectangle( double l, double w )
{
    double rearea = ( l * w );
    return rearea;
}

double square( double sl )
{
    double sqarea = ( pow( sl , 2 ) );
    return sqarea;
}

double circle( double r )
{
    double ciarea = ( M_PI * pow( r , 2 ) );
    return ciarea;
}

int main()
{
    double response, base, height, length, width, sidelength, radius;

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
            cin >> base;
            cout << "\nHeight: ";
            cin >> height;

            cout << "\nThe area of the shape is " << triangle( base, height ) << ".";
        }
        else if( response == 2 )
        {
            cout << "\nLength: ";
            cin >> length;
            cout << "\nWidth: ";
            cin >> width;

            cout << "\nThe area of the shape is " << rectangle( length, width ) << ".";
        }
        else if( response == 3 )
        {
            cout << "\nSide Length: ";
            cin >> sidelength;

            cout << "\nThe area of the shape is " << square( sidelength ) << ".";
        }
        else if( response == 4 )
        {
            cout << "\nRadius: ";
            cin >> radius;

            cout << "\nThe area of the shape is " << circle( radius ) << ".";
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