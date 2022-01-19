#include <iostream>
using namespace std;

int main() {
    int qf, qs, qt, count;
    string yn;

    cout << "Are you ready for a quiz (about gods)? ";
    cin >> yn;
    if ( yn == "y" )
    {
        cout << "\nOkay, here it comes! ";

        cout << "\n\nQ1) Which country is the goddess of sun, Amaterasu from?";
        cout << "\n\t1) Korea";
        cout << "\n\t2) Japan";
        cout << "\n\t3) Malaysia";
        cout << "\n> ";
        cin >> qf;
        if ( qf == 2 ){
            cout << "\nThat is correct!";
            count++;
        }
        else{
            cout << "\nSorry, but Amaterasu is the goddess of sun in Japanese mythology.";
        }

        cout << "\n\nQ2) The goddess of winemaking, Dionysus, what else is she the goddess of? ";
        cout << "\n\t1) Orchard";
        cout << "\n\t2) War";
        cout << "\n\t3) Dreams";
        cout << "\n> ";
        cin >> qs;
        if ( qs == 1 ){
            cout << "\nThat is correct!";
            count++;
        }
        else{
            cout << "\nThat is incorrect! Dionysus is the goddess of grape-harvest, winemaking, orchards and fruit.";
        }

        cout << "\n\nQ3) How did the goddess of strife, Eris start the Trojan War?";
        cout << "\n\t1) She spread rumors about gods and goddesses.";
        cout << "\n\t2) She declared her hatred towards the three goddess.";
        cout << "\n\t3) She gifted a golden apple saying, \"To the fairest\".";
        cout << "\n> ";
        cin >> qt;
        if ( qt == 3 ){
            cout << "\nThat is correct!";
            count++;
        }
        else{
            cout << "\nSorry, the goddess of strife, Eris, started the Trojan war by gifted a golden apple saying, \"To the fairest\".";
        }

        cout << "\n\nOverall, you got " << count << " out of 3 correct!";
        cout << "\nThanks for playing!";
    }
    else{
        cout << "\nOkay, bye!";
    }
    return 0;
}