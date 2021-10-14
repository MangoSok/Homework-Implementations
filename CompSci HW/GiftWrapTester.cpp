#include <iostream>
#include <iomanip>
#include "GiftWrap.h"
#include <string>
using namespace std;

void getParameters(GiftWrap&);
void inputValidation(double&);

int main()
{
    char input;
    GiftWrap obj(0.0925, 0.0025);
    string name = "Sally's Gifts";
    
    do{
        cout<<"GIFT WRAP INVOICE GENERATOR\n";
        cout<<"---------------------------\n";
        cout<<"a) Generate Gift Wrap Invoice\n";
        cout<<"q) Quit\n";
        cout<<"Enter your selection: ";
        cin>>input;
        input = tolower(input);
        
        if(input == 'a'){
            getParameters(obj);
            cout<<fixed;
            cout<<"\n\nGIFT WRAP INVOICE - "<<name<<"\n";
            cout<<"---------------------------------";
            cout<<"\nBox Length: "<<setprecision(2)<<obj.getL();
            cout<<"\nBox Width: "<<setprecision(2)<<obj.getW();
            cout<<"\nBox Height: "<<setprecision(2)<<obj.getH();
            cout<<"\nPrice Per Inch: "<<setprecision(4)<<obj.getP();
            cout<<"\n\nSUBTOTAL:     "<<setprecision(2)<<obj.calcSubTotal();
            cout<<"\nTAX:          "<<setprecision(2)<<obj.calcTax();
            cout<<"\n          --------\nTOTAL:        ";
            cout<<setprecision(2)<<obj.calcTotal()<<"\n\n";
        }
        else if(input != 'q'){
            cout<<"Invalid Input. Try again. \n\n";
        }

    }while(input != 'q');
    cout<<"\nQutting the program, bye!"<<endl;
    return 0;
}

void getParameters(GiftWrap &box){
    
    double input;

    cout<<"\nEnter the length of the box: ";
    cin>>input;
    inputValidation(input);
    box.setL(input);
    
    cout<<"Enter the width of the box: ";
    cin>>input;
    inputValidation(input);
    box.setW(input);
    
    cout<<"Enter the height of the box: ";
    cin>>input;
    inputValidation(input);
    box.setH(input);
}

void inputValidation(double &input){
    while(input <= 0){
        cout<<"Invalid input. Try again: ";
        cin>>input;
    }
}

