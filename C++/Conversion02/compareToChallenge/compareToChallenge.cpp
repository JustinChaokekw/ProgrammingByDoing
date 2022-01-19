#include <iostream>
using namespace std;

int main(){
    cout << "\nNegative Section: \n";
    string Q = "apple";
    string W = "banana";
    string E = "Germany";
    string R = "Italy";
    string T = "C++";
    string Y = "Java";
    string U = "Tuesday";
    string I = "Wednesday";
    string O = "pain";
    string P = "suffering";
    cout << "\nComparing \"" << Q << "\" with \"" << W << "\" produces " << Q.compare(W);
    cout << "\nComparing \"" << E << "\" with \"" << R << "\" produces " << E.compare(R);
    cout << "\nComparing \"" << T << "\" with \"" << Y << "\" produces " << T.compare(Y);
    cout << "\nComparing \"" << U << "\" with \"" << I << "\" produces " << U.compare(I);
    cout << "\nComparing \"" << O << "\" with \"" << P << "\" produces " << O.compare(P);

    cout << "\n\nPositive Section: \n";
    string A = "vanish";
    string S = "disappear";
    string D = "reflection";
    string F = "mirror";
    string G = "test";
    string H = "quiz";
    string J = "homework";
    string K = "assignment";
    string L = "leave";
    string Z = "departure";
    cout << "\nComparing \"" << A << "\" with \"" << S << "\" produces " << A.compare(S);
    cout << "\nComparing \"" << D << "\" with \"" << F << "\" produces " << D.compare(F);
    cout << "\nComparing \"" << G << "\" with \"" << H << "\" produces " << G.compare(H);
    cout << "\nComparing \"" << J << "\" with \"" << K << "\" produces " << J.compare(K);
    cout << "\nComparing \"" << L << "\" with \"" << Z << "\" produces " << L.compare(Z);

    cout << "\n\nZero Section: \n";
    string X = "literally";
    string C = "literally";
    string V = "same";
    string B = "same";
    cout << "\nComparing \"" << X << "\" with \"" << C << "\" produces " << X.compare(C);
    cout << "\nComparing \"" << V << "\" with \"" << B << "\" produces " << V.compare(B);
}


