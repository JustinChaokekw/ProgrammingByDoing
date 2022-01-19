#include <iostream>
using namespace std;

int main(){
    string gender, fname, lname, married;
    int age;

    cout << "What is your gender (M or F): ";
    cin >> gender
    cout << "\nFirst name: ";
    cin >> fname;
    cout << "\nLast name: ";
    cin >> lname;
    cout << "\nAge: ";
    cin >> age;

    if( age < 20 )
    {
        cout << "\nThen I shall call you " << fname << " " << lname ".";
    }
    else if( gender = "M" )
    {
        cout << "\nThen I shall call you Mr. " << lname << ".";
    }
    else
    {
        cout << "\nAre you married, " << fname << " (y or n)? ";
        cin << married
        if( married = y )
        {
            cout << "\nThen I shall call you Mrs. " << lname << ".";
        }
        else
        {
            cout << "\nThen I shall call you Ms. " << lname << ".";
        }
    }
}