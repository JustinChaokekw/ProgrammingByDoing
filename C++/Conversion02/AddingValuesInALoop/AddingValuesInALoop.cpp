#include <iostream>
using namespace std;

int main(){
    int number;
    int total = 0;
    cout << "I'll add up the numbers you give me.";
    while( number != 0 ){
        cout << "\nNumber: ";
        cin >> number;
        total = number + total;
        cout << "\nThe total so far is " << total << ".";
    }
    cout << "\n\nThe total is " << total << ".";
}