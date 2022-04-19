//Pointer and Arrays
#include <stdio.h>
#include <iostream>
using namespace std;

int main()
{
    float arr[3]={5,6,7};

    // declare pointer variable named *ptr
    float *ptr;
    
    cout << "Displaying address using arrays: " << endl;

    // use for loop to print addresses of all array elements
    for (int i = 0; i < 3; ++i)
    {
        cout << "&arr[" << i << "] = " << &arr[i] << endl;
    }

    // ptr = &arr[0]
    ptr = arr;

    cout<<"\nDisplaying address using pointers: "<< endl;

    // use for loop to print addresses of all array elements
    // using pointer notation by adding i to ptr to result in different address that correspond to each of the array elements
    for (int i = 0; i < 3; ++i)
    {
        cout << "ptr + " << i << " = "<< ptr + i << endl;
    }

    cout<<"\nDisplaying value using pointers: "<< endl;

    // use for loop to print addresses of all array elements
    // using pointer notation by adding i to ptr to result in different address that correspond to each of the array elements 
    // , and then find the values each result points to, which would become all the array elements
    for (int i = 0; i < 3; ++i)
    {
        cout << "ptr + " << i << " = "<< *(ptr + i) << endl;
    }
    return 0;
}