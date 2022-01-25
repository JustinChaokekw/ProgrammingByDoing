#include <cstdlib>
#include <ctime>
#include <iostream>
using namespace std;

int main(){
    srand((unsigned) time(0));

    int guess;
    int answer = (rand() % 10) + 1;


    cout << "\nI'm thinking of a number from 1 to 10.";
    cout << "\nYour guess: ";
    cin >> guess;

    if ( guess == answer )
    {
        cout << "\n\nThat is correct! The number was " << answer << "!";
    }
    else
    {
        cout << "\n\nSorry, the number was " << answer << ".";
    }
}