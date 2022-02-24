#include <iostream>
#include <list>
using namespace std;

class Doge{
private: 
    int Age;
    double Weight;
public: 
Doge( int a , double w ){
    Age = a;
    Weight = w;
}

void Getinfo(){
    cout << "Age: " << Age << endl;
    cout << "Weight: " << Weight << endl;
}
};

int main(){
    Doge pet( 3, 15.15 );
    pet.Getinfo();

    return 0;
}