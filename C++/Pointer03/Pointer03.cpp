#include <iostream>
using namespace std;

// declare constant integer M and N to be 3
const int M = 3;
const int N = 3;

// a function that prints out each of the inserted array's element using the pointer notation
// , after each value print, the next value gets printed in the next line
void printArr(int *array, int sizeArr){
    for(int i=0;i<sizeArr;i++)
    cout<<*(array+i)<<endl;
}

// a function that prints out each of the inserted 2D array's element using normal notation
// , adds space after each value, and goes to the next line after a row's elements are all printed out
void print2D(int arr[M][N]){
    for (int i = 0; i < M; i++){
      for (int j = 0; j < N; j++){
        cout<<arr[i][j]<<" ";
        }cout<<endl;
    }
}

// a function that prints out each of the inserted 2D array's element using the pointer notation
// , adds space after each value, and goes to the next line after a row's elements are all printed out
void print2DP(int *arr, int r, int c){
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        cout<<*(arr+i+j)<<" ";
      }cout<<endl;
    }
}

int main()
{
    // set a 1D array called arr with the elements 3, 6, 2, 5, 3, 1
    int arr[6]={3,6,2,5,3,1};
    // prints out all elements in arr with a function that uses pointer notation
    printArr(&arr[0],6);
    // set a 2D array called arr2 with 1, 2, 3 in the first row, 4, 5, 6 in the second, and 7, 8, 9, in the third
    int arr2[3][3]={{1,2,3},{4,5,6},{7,8,9}};
    // prints out all elements in arr with a function that uses normal notation
    print2D(arr2);
    // to the next line
    cout<<endl;
    // prints out all elements in arr with a function that uses pointer notation
    print2DP(&arr2[0][0],3,3);
    return 0;
}