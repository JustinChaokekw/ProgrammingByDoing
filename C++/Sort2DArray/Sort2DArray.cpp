#include <iostream>
#include <cmath>
#include <ctime>
#include <cstdlib>
using namespace std;

int main(){
    srand((unsigned) time(0));
    // int AR[6] = {rand()%26+97, rand()%26+97, rand()%26+97, rand()%26+97, rand()%26+97, rand()%26+97};
    int temp, rownumber, columnnumber;

    cout << "> ";
    cin >> rownumber;
    cout << "> ";
    cin >> columnnumber;
    
    int AR[rownumber][columnnumber];

    cout << "Generated Array: " << endl;
    for( int k = 0 ; k < rownumber ; k++ ){
        for( int j = 0 ; j < columnnumber ; j++ ){
            AR[k][j] = rand()%26+97;
            cout << (char)AR[k][j] << " ";
        }
        cout << endl;
    }

    for( int s = 0 ; s < rownumber * columnnumber ; s++ ){
        for( int k = 0 ; k < rownumber ; k++ ){
            for( int j = 0 ; j < columnnumber-1 ; j++ ){
                if( AR[k][j] > AR[k][j+1] ){
                    temp = AR[k][j];
                    AR[k][j] = AR[k][j+1];
                    AR[k][j+1] = temp;
                }else{}
            }
        }
        for( int o = 0 ; o < columnnumber ; o++ ){
            for( int p = 0 ; p < rownumber-1 ; p++ ){
                if( o % 2 == 0 ){
                    if( AR[p][o] > AR[p+1][o] ){
                        temp = AR[p][o];
                        AR[p][o] = AR[p+1][o];
                        AR[p+1][o] = temp;
                    }else{}
                }else{
                    if( AR[p][o] < AR[p+1][o] ){
                        temp = AR[p][o];
                        AR[p][o] = AR[p+1][o];
                        AR[p+1][o] = temp;
                    }else{}
                }
            }
        }
    }
    cout << endl;
    
    cout << "Sorted Array: " << endl;
    for( int k = 0 ; k < rownumber ; k++ ){
        for( int j = 0 ; j < columnnumber ; j++ ){
            cout << (char)AR[k][j] << " ";
        }
        cout << endl;
    }

    for( int s = 0 ; s < rownumber * columnnumber ; s++ ){
        for( int k = 0 ; k < rownumber ; k++ ){
            for( int j = 0 ; j < columnnumber-1 ; j++ ){
                if( AR[k][j] < AR[k][j+1] ){
                    temp = AR[k][j];
                    AR[k][j] = AR[k][j+1];
                    AR[k][j+1] = temp;
                }else{}
            }
        }
        for( int o = 0 ; o < columnnumber ; o++ ){
            for( int p = 0 ; p < rownumber-1 ; p++ ){
                if( o % 2 == 0 ){
                    if( AR[p][o] < AR[p+1][o] ){
                        temp = AR[p][o];
                        AR[p][o] = AR[p+1][o];
                        AR[p+1][o] = temp;
                    }else{}
                }else{
                    if( AR[p][o] > AR[p+1][o] ){
                        temp = AR[p][o];
                        AR[p][o] = AR[p+1][o];
                        AR[p+1][o] = temp;
                    }else{}
                }
            }
        }
    }
    cout << endl;

    cout << "Reservedly Sorted Array: " << endl;
    for( int k = 0 ; k < rownumber ; k++ ){
        for( int j = 0 ; j < columnnumber ; j++ ){
            cout << (char)AR[k][j] << " ";
        }
        cout << endl;
    }

}