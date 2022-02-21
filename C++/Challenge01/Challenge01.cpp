#include <iostream>
#include <cmath>
using namespace std;

int onetwo( int x )
{
    int total = 0;

    for( int i = 1 ; i < x ; i++ )
    {
        if( i % 3 == 0 || i % 5 == 0 )
        {
            total = total + i;
        }
    }
    return total;
}

int threefour( int x )
{
    int totall = 0;

    for( int i = 1 ; i < x ; i++ )
    {
        if( i % 2 == 0 || i % 7 == 0 )
        {
            totall = totall + i;
        } 
    }
    return totall;
}

int five( int x )
{
    int totalll = 0;

    for( int i = 1 ; i < x ; i++ )
    {
        if( i % 2 == 0 || i % 7 == 0 || i % 13 == 0 )
        {
            totalll = totalll + i;
        }
    }
    return totalll;
}

int main()
{
    cout << onetwo(10) << "\n";
    cout << onetwo(1000) << "\n";
    cout << threefour(100) << "\n";
    cout << threefour(1030) << "\n";
    cout << five(1030) << "\n";
}
