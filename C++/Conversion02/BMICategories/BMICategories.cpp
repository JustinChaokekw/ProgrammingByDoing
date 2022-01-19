#include <iostream>
using namespace std;

int main() {
    int foot, inch, pound;
    double bmi;
    string category;

    cout << "Your height (feet only): ";
    cin >> foot;
    cout << "Your height (inches): ";
    cin >> inch;
    cout << "Your weight in pounds: ";
    cin >> pound;
    bmi = ( pound * 0.4535 / ( foot * 0.3048 + inch * 0.0254 ) / ( foot * 0.3048 + inch * 0.0254 ));
    if( bmi < 18.5 )
    {
        category = "Underweight";
    }
    else if( 18.5 <= bmi < 25.0)
    {
        category = "Normal Weight";
    }
    else if( 25.0 <= bmi < 30.0 )
    {
        category = "Overweight";
    }
    else if( 30.0 <= bmi )
    {
        category = "Obese";
    }

    cout << "\nYour BMI is " << bmi;
    cout << "\nBMI Category: " << category;
    
}