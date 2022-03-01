#include <iostream>
#include <list>
#include <cmath>
#include <cstdlib>
#include <ctime>
using namespace std;

// The required class for the class (haha nice pun)
class student{
private: 
    string name;
    int age;
    int gradelevel;
    double GPA;
    char gender;
    double grades[4];
    string letters[4];
    double GPAs[4];
public: 
    student( string n, int a, int g, char gen ){
        name = n;
        gradelevel = g;
        age = a;
        gender = gen;
    };

// Set the grades in an array of different subjects' score
    void setGrade( string course, double grade ){
        if( course == "English" ){
            grades[0] = grade;
        }else if( course == "Math" ){
            grades[1] = grade;
        }else if( course == "Science" ){
            grades[2] = grade;
        }else if( course == "Social Studies" ){
            grades[3] = grade;
        }
    };

// [not required] Make the grade into letter form
    void setLetterGrade(){
        for( int i = 0 ; i < 4 ; i++ ){
            if( 97 < grades[i] ){
                letters[i] = "A*";
            }else if( 93 <= grades[i] && grades[i] < 97 ){
                letters[i] = "A";
            }else if( 90 <= grades[i] && grades[i] < 93 ){
                letters[i] = "A-";
            }else if( 87 <= grades[i] && grades[i] < 90 ){
                letters[i] = "B*";
            }else if( 83 <= grades[i] && grades[i] < 87 ){
                letters[i] = "B";
            }else if( 80 <= grades[i] && grades[i] < 83 ){
                letters[i] = "B-";
            }else if( 77 <= grades[i] && grades[i] < 80 ){
                letters[i] = "C*";
            }else if( 73 <= grades[i] && grades[i] < 77 ){
                letters[i] = "C";
            }else if( 70 <= grades[i] && grades[i] < 73 ){
                letters[i] = "C-";
            }else if( 67 <= grades[i] && grades[i] < 70 ){
                letters[i] = "D*";
            }else if( 60 <= grades[i] && grades[i] < 67 ){
                letters[i] = "D";
            }else{
                letters[i] = "F";
            }
        }
    };

// Calculating GPA by letter grades
    void calcGPA(){
        double total = 0;

        for( int k = 0 ; k < 4 ; k++ ){
            if( letters[k] == "A*"){
                GPAs[k] = 4.0;
            }else if( letters[k] == "A"){
                GPAs[k] = 4.0;
            }else if( letters[k] == "A-"){
                GPAs[k] = 3.7;
            }else if( letters[k] == "B*"){
                GPAs[k] = 3.3;
            }else if( letters[k] == "B"){
                GPAs[k] = 3.0;
            }else if( letters[k] == "B-"){
                GPAs[k] = 2.7;
            }else if( letters[k] == "C*"){
                GPAs[k] = 2.3;
            }else if( letters[k] == "C"){
                GPAs[k] = 2.0;
            }else if( letters[k] == "C-"){
                GPAs[k] = 1.7;
            }else if( letters[k] == "D*"){
                GPAs[k] = 1.3;
            }else if( letters[k] == "D"){
                GPAs[k] = 1.0;
            }else if( letters[k] == "F"){
                GPAs[k] = 0.0;
            }

            total = total + GPAs[k];
        }

        GPA = total / 4;
    };

// Return GPA
    double returnGPA(){
        return GPA;
    }

// Return grades of different subjects
    int returnGrades( string course ){
        if( course == "English" ){
            return grades[0];
        }else if( course == "Math" ){
            return grades[1];
        }else if( course == "Science" ){
            return grades[2];
        }else if( course == "Social Studies" ){
            return grades[3];
        }else{
            return 0;
        }
    };

// Print information of the student
    void printInfo(){
        cout << "Student Name: " << name << endl;
        if( gradelevel < 1 ){
            cout << "Grade: " << "Preschool" << endl;
        }else if( gradelevel == 1 ){
            cout << "Grade: " << "Elementary " << gradelevel << "st Grade" << endl;
        }else if( gradelevel == 2 ){
            cout << "Grade: " << "Elementary " << gradelevel << "nd Grade" << endl;
        }else if( gradelevel == 3 ){
            cout << "Grade: " << "Elementary " << gradelevel << "rd Grade" << endl;
        }else if( 4 <= gradelevel && gradelevel <= 5 ){
            cout << "Grade: " << "Elementary " << gradelevel << "th Grade" << endl;
        }else if( 6 <= gradelevel && gradelevel <= 8 ){
            cout << "Grade: " << "Middle School " << gradelevel << "th Grade" << endl;
        }else if( gradelevel == 9 ){
            cout << "Grade: " << "High School " << "Freshman " << gradelevel << "th Grade" << endl;
        }else if( gradelevel == 10 ){
            cout << "Grade: " << "High School " << "Sophomore " << gradelevel << "th Grade" << endl;
        }else if( gradelevel == 11 ){
            cout << "Grade: " << "High School " << "Junior " << gradelevel << "th Grade" << endl;
        }else if( gradelevel == 12 ){
            cout << "Grade: " << "High School " << "Senior " << gradelevel << "th Grade" << endl;
        }else{
            cout << "Grade: " << "Graduated" << endl;
        }
        cout << "Age: " << age << endl;
        if( gender == 'm' ){
            cout << "Gender: " << "Male" << endl;
        }else if( gender == 'f' ){
            cout << "Gender: " << "Female" << endl;
        }
    };

// Print grades and GPA of the student
    void printGrades(){
        cout << "English:        " << grades[0] << " / " << letters[0] << endl;
        cout << "Math:           " << grades[1] << " / " << letters[1] << endl;
        cout << "Science:        " << grades[2] << " / " << letters[2] << endl;
        cout << "Social Studies: " << grades[3] << " / " << letters[3] << endl;
        cout << "GPA:            " << GPA << endl;
    };
};

// Compare to grades belonging to two different students
void compare( string A, string W, double a, double b, string C ){
    if( a > b ){
        cout << A << "'s " << C << " grade is better than " << W << "'s grade by " << ( a - b ) << "." << endl;
    }else if( a == b ){
        cout << A << "'s " << C << " grade is the same with " << W << "'s grade." << endl;
    }else if( a < b ){
        cout << W << "'s " << C << " grade is better than " << A << "'s grade by " << ( b - a ) << "." << endl;
    }
};

// Compare to GPAs belonging to two different students
void compareGPA( string A, string W, double a, double b){
    if( a > b ){
        cout << A << "'s GPA is better than " << W << "'s GPA by " << ( a - b ) << "." << endl;
    }else if( a == b ){
        cout << A << "'s GPA is the same with " << W << "'s GPA." << endl;
    }else if( a < b ){
        cout << W << "'s GPA is better than " << A << "'s GPA by " << ( b - a ) << "." << endl;
    }
};

// [not required] smol divider
void printDivider(){
    cout << endl;
    cout << "------------------------------------------" << endl;
    cout << endl;
};

// [not required] BIG DIVIDER
void printDIVIDER(){
    cout << endl;
    cout << "==========================================" << endl;
    cout << endl;
};

// [not required] those student suck at their grades, they need curving
double curve( double bg ){
    double better;
    better = sqrt( bg ) * 10;
    return better;
}

// [not required] haha logo of PAS
void PASLogo(){
    cout << "PPPP " << " " << "  A  " << " " << " SSSS" << endl;
    cout << "P   P" << " " << " A A " << " " << "S    " << endl;
    cout << "PPPP " << " " << "AAAAA" << " " << " SSS " << endl;
    cout << "P    " << " " << "A   A" << " " << "    S" << endl;
    cout << "P    " << " " << "A   A" << " " << "SSSS " << endl;
    cout << endl;
    cout << "Pacific American School" << endl;
}

int main(){
    srand((unsigned) time(0));
    string stdfirst = "Tabeuail \"Tabeu\" Scotsolia";
    string stdsecond = "Elina \"Lina\" Beren";
    string sb;

    printDIVIDER();
    PASLogo();

    student std1( stdfirst, 16, 9 , 'm');

    std1.setGrade("English", curve(curve(rand()%100+1)));
    std1.setGrade("Math", curve(curve(rand()%100+1)));
    std1.setGrade("Science", curve(curve(rand()%100+1)));
    std1.setGrade("Social Studies", curve(curve(rand()%100+1)));
    std1.setLetterGrade();
    std1.calcGPA();

    printDIVIDER();
    std1.printInfo();
    printDivider();
    std1.printGrades();

    student std2( stdsecond, 16, 9 , 'm');

    std2.setGrade("English", curve(curve(rand()%100+1)));
    std2.setGrade("Math", curve(curve(rand()%100+1)));
    std2.setGrade("Science", curve(curve(rand()%100+1)));
    std2.setGrade("Social Studies", curve(curve(rand()%100+1)));
    std2.setLetterGrade();
    std2.calcGPA();

    printDIVIDER();
    std2.printInfo();
    printDivider();
    std2.printGrades();

    printDIVIDER();
    for( int yo = 0 ; yo < 4 ; yo++ ){
        if( yo == 0 ){
            sb = "English";
        }else if( yo == 1 ){
            sb = "Math";
        }else if( yo == 2 ){
            sb = "Science";
        }else if( yo == 3 ){
            sb = "Social Studies";
        }

        compare( stdfirst, stdsecond, std1.returnGrades(sb), std2.returnGrades(sb), sb );
    }
    compareGPA( stdfirst, stdsecond, std1.returnGPA(), std2.returnGPA() );
    printDIVIDER();
}