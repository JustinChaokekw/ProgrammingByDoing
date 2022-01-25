#include <iostream>
using namespace std;

int main()
{
    for( int a = 0 ; a <= 5 ; a++ )
    {
        for( int b = 0 ; b <= 5 ; b++ )
        {
            cout << "(" << a << "," << b << ")" << " ";
        }
        cout << "\n";
    }

    return 0;
}