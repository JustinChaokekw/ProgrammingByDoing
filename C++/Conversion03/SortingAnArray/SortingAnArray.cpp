#include <cstdlib>
#include <ctime>
#include <iostream>
using namespace std;

int main()
{
    srand((unsigned) time(0));

    int Array[] = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
    int ArraySooooort[] = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
    int temp;
    int count = 0;

    cout << "Array before sorting: ";
    for( int i = 0 ; i < 10 ; i++ )
    {
        Array[i] = ((rand() % 90) + 10);
        cout << Array[i] << " ";
        ArraySooooort[i] = Array[i];
    }

    for( int x = 0; x < 9 ; x++ )
    {
        for( int y = 0 ; y < 9 ; y++ )
        {
            if ( ArraySooooort[y] > ArraySooooort[y+1] )
            {
                temp = ArraySooooort[y+1];
                ArraySooooort[y+1] = ArraySooooort[y];
                ArraySooooort[y] = temp;
            }
        }
    }

    cout << "\nArray after sorting : ";
    for( int i = 0 ; i < 10 ; i++ )
    {
        cout << ArraySooooort[i] << " ";
    }


}