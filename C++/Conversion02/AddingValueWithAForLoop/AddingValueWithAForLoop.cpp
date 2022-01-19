#include <iostream>
using namespace std;

int main(){
    int number;

    cout << "\nNumber: ";
    cin >> number;
    cout << "\n";

    for ( int i = 1 ; i <= number ; i++ )
    {
        cout << i << " ";
    }
    cout << "\nThe sum is " << ((1 + number) * number / 2) << ".";
}