#include <iostream>
using namespace std;

int main(){
    int start, end, space;

    cout << "\nCount from: ";
    cin >> start;
    cout << "Count to: ";
    cin >> end;
    cout << "Count by: ";
    cin >> space;
    cout << "\n";

    for ( int i = start ; i <= end ; i += space )
    {
        cout << i << " ";
    }
}