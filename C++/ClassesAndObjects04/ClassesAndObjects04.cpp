#include <iostream>
#include <list>
#include <cmath>
using namespace std;

class moon{
private: 
    string name;
    double distance;
    double mass;
    double diameter;
public: 
    //default constructor
    moon(){}
    moon( string n, double ds, double m, double da ){
        name = n;
        distance = ds;
        mass = m;
        diameter = da;
    };

    void printInfo(){
        cout << "Moon Name: " << name << endl;
        cout << "Distance from its planet: " << distance << " km" << endl;
        cout << "Mass: " << mass << " * 10^24 kg" << endl;
        cout << "Diameter: " << diameter << " km" << endl;
    };

    string getName(){
        return name;
    }

};

class planet{
private: 
    string name;
    double distance;
    double mass;
    double diameter;
    int numMoons;
    moon TopMoons[3];
public: 
    //default constructor
    planet(){}
    planet( string n, double m, double da, double ds, int nM, moon m1, moon m2, moon m3 ){
        name = n;
        distance = ds;
        mass = m;
        diameter = da;
        numMoons = nM;
        TopMoons[0] = m1;
        TopMoons[1] = m2;
        TopMoons[2] = m3;
    }

    double Rdis(){
        return distance;
    }

    string Rname(){
        return name;
    }

    moon getMoon( int i ){
        return TopMoons[i];
    }

    void printInfo(){
        cout << "Planet Name: " << name << endl;
        cout << "Distance from the sun: " << distance << " * 10^6 km" << endl;
        cout << "Mass: " << mass << " * 10^24 kg" << endl;
        cout << "Diameter: " << diameter << endl;
        cout << "Number of Moons: " << numMoons << endl;
        printDivider();
        cout << "Top Moons: " << endl;
        if( numMoons == 0 ){
            cout << "N/A" << endl;
        }else if( numMoons == 1 ){
            printDivider();
            TopMoons[0].printInfo();
        }else if( numMoons == 2 ){
            printDivider();
            TopMoons[0].printInfo();
            printDivider();
            TopMoons[1].printInfo();
        }else{
            printDivider();
            TopMoons[0].printInfo();
            printDivider();
            TopMoons[1].printInfo();
            printDivider();
            TopMoons[2].printInfo();
        }
    }

    void printDivider(){
    cout << "------------------------------------------" << endl;
    }

};

void printDIVIDER(){
    cout << endl;
    cout << "====================================================" << endl;
    cout << endl;
};

void compareDistance( planet a, planet b ){
    if( a.Rdis() > b.Rdis() ){
        cout << "The distance between " << a.Rname() << " and " << b.Rname() << " is " << (a.Rdis() - b.Rdis()) << " * 10^6 km." << endl;
    }else if( b.Rdis() > a.Rdis() ){
        cout << "The distance between " << a.Rname() << " and " << b.Rname() << " is " << (b.Rdis() - a.Rdis()) << " * 10^6 km." << endl;
    }else{
        cout << "There is no distance between " << a.Rname() << " and " << b.Rname() << "." << endl;
    }
};

void FFFFindMoon( moon x, planet arr[8] ){
    for( int i = 0; i < 8 ; i++ ){
        for( int j = 0 ; j < 3 ; j++ ){
            planet temp = arr[i];
            if( x.getName() == (temp.getMoon(j)).getName() ){
                cout << "The moon " << x.getName() << " is a moon of the planet " << temp.Rname() << "!";
            }else{}
        }
    }
};

int main(){

    printDIVIDER();

    planet solarSystem[8] = {
        planet("Mercury", 0.33, 4879, 57.9, 0, moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0)),
        planet("Venus", 4.87, 12104, 108.2, 0, moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0)), 
        planet("Earth", 5.97, 12742, 149.6, 1, moon( "Moon", 384403, 0.07346, 3474.8 ), moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0)),
        planet("Mars", 0.642 , 6792, 227.9, 2, moon("Phobos",9270,22.5,10.6), moon("Deimos", 23460,12.4,2.4), moon("N/A", 0, 0, 0)), 
        planet("Jupiter", 1898, 142984, 778.6, 79, moon("Io",421600,3629,893.2), moon("Europa",670900,3126,480), moon("Callisto",1883000,4800,1075.9)), 
        planet("Saturn", 568, 120536, 1433.5, 82, moon("Titan",1221850,5150,1345.5), moon("Mimas",185520,398,0.379), moon("Rhea",527040,1528,23.1)), 
        planet("Uranus",86.8,51118,2872.5,27, moon("Umbriel",265970,1190,12.2), moon("Ariel",191240,1160,12.9), moon("Miranda",129780,472,0.66)), 
        planet("Neptune", 102, 49528, 4495.1, 14, moon("Neso",47279670,60,0.002), moon("Sao",22337190,38,0.001), moon("Naiad",48200,50,0.002))
    };

    planet Merc("Mercury", 0.33, 4879, 57.9, 0, moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0));
    Merc.printInfo();
    printDIVIDER();
    planet Venu("Venus", 4.87, 12104, 108.2, 0, moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0));
    Venu.printInfo();
    printDIVIDER();
    planet Eart( "Earth", 5.97, 12742, 149.6, 1, moon( "Moon", 384403, 0.07346, 3474.8 ), moon("N/A", 0, 0, 0), moon("N/A", 0, 0, 0) );
    Eart.printInfo();
    printDIVIDER();
    planet Mars("Mars", 0.642 , 6792, 227.9, 2, moon("Phobos",9270,22.5,10.6), moon("Deimos", 23460,12.4,2.4), moon("N/A", 0, 0, 0));
    Mars.printInfo();
    printDIVIDER();
    planet Juni("Jupiter", 1898, 142984, 778.6, 79, moon("Io",421600,3629,893.2), moon("Europa",670900,3126,480), moon("Callisto",1883000,4800,1075.9));
    Juni.printInfo();
    printDIVIDER();
    planet Satu("Saturn", 568, 120536, 1433.5, 82, moon("Titan",1221850,5150,1345.5), moon("Mimas",185520,398,0.379), moon("Rhea",527040,1528,23.1));
    Satu.printInfo();
    printDIVIDER();
    planet Uran("Uranus",86.8,51118,2872.5,27, moon("Umbriel",265970,1190,12.2), moon("Ariel",191240,1160,12.9), moon("Miranda",129780,472,0.66));
    Uran.printInfo();
    printDIVIDER();
    planet Nept("Neptune", 102, 49528, 4495.1, 14, moon("Neso",47279670,60,0.002), moon("Sao",22337190,38,0.001), moon("Naiad",48200,50,0.002));
    Nept.printInfo();
    printDIVIDER();   

    compareDistance(solarSystem[0],solarSystem[1]);
    printDIVIDER();
    FFFFindMoon( moon("Phobos",9270,22.5,10.6), solarSystem );
    cout << endl;
    printDIVIDER();
}