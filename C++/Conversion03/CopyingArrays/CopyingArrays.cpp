#include <cstdlib>
#include <ctime>
#include <iostream>
using namespace std;

int main()
{
    srand((unsigned) time(0));

    int firstArray[] = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
    int secondArray[] = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

    for( int i = 0 ; i < 10 ; i++ )
    {
        firstArray[i] = ((rand() % 100) + 1);
        secondArray[i] = firstArray[i];
    }

    secondArray[9] = -7;

    cout << "Array 1: ";
    for( int i = 0 ; i < 10 ; i++ )
    {   
        cout << firstArray[i] << " ";
    }
    cout << "\n";
    cout << "Array 2: ";
    for( int i = 0 ; i < 10 ; i++ )
    {   
        cout << secondArray[i] << " ";
    }
}