#include <cstdlib>
#include <ctime>
#include <iostream>
using namespace std;

int main()
{
    srand((unsigned) time(0));

    int Array[] = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
    int aim;
    int count = 0;

    cout << "Array: ";
    for( int i = 0 ; i < 10 ; i++ )
    {
        Array[i] = ((rand() % 100) + 1);
        cout << Array[i] << " ";
    }

    cout << "\nValue to find: ";
    cin >> aim;

    cout << "\n";
    for( int i = 0 ; i < 10 ; i++ )
    {
        if( Array[i] == aim )
        {
            cout << aim << " is in slot " << i << ".\n";
            count++;
        }
    }
    if( count == 0 )
    {
        cout << aim << " is not in the array.";
    }
}