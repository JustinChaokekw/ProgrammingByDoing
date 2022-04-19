#include <iostream>
#include <string>

using namespace std;

//after inserting a name, the system will print out "Hello " and the name.
void sayHello(string name){
    cout<<"Hello "<<name;
}

//after inserting a name, the system will print out "Hi " and the name.
void sayHi(string &name){
    cout<<"Hi "<<name;
}

//compare the two input values that the two pointer points to and store the larger one as a value of the integer that is going to be defined.
int * larger(int *x, int *y){
    if(*x>*y) return x;
    else return y;
}

int main()
{
    //define a string name, insert the value "World".
    string name = "World";

    //say hello with the previous string defined as input.
    sayHello(name);
    cout<<endl;
    
    string *pName = &name;
    sayHi(*pName);

    //define two integer a and b, and insert values 5 and 1.
    int a = 5;
    int b = 1;

    //compare a and b and find the larger value that the two pointer points to to be the value inserted in the integer *pNum.
    int *pNum = larger(&a,&b);
    cout<<"\n"<<*pNum<<" is larger"<<endl;
    return 0;
}