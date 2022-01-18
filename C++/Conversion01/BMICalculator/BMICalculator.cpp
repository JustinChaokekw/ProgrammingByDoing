#include <iostream>
using namespace std;

int main() {
    int foot, inch, pound;

    cout << "Your height (feet only): ";
    cin >> foot;
    cout << "Your height (inches): ";
    cin >> inch;
    cout << "Your weight in pounds: ";
    cin >> pound;
    cout << "\n6
    Your BMI is " << ( pound * 0.4535 / ( foot * 0.3048 + inch * 0.0254 ) / ( foot * 0.3048 + inch * 0.0254 ) );
}