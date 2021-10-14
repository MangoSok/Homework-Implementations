#include <iostream>
#include <iomanip>
#include <string>
#include "Stats.h"
using namespace std;

void fillList(Stats&);

int main()
{
    char input;
    Stats rainfall;
    
    fillList(rainfall);
    rainfall.displayValues();
    
    cout<<"RAINFALL REPORT";
    cout<<fixed;
    cout<<"\nYearly Total: "<<setprecision(2)<<rainfall.calcTotal();
    cout<<"\nMonthly Average: "<<setprecision(2)<<rainfall.calcAvg();
    cout<<"\nLowest Rainfall: "<<setprecision(2)<<rainfall.calcSmallest();
    cout<<"\nHighest Rainfall: "<<setprecision(2)<<rainfall.calcLargest()<<endl;
    
    return 0;
}

void fillList(Stats &rf){
    
    double input;
    string months[12] = {"January" , "February", "March", "April", "May",
                          "June", "July", "August", "September",
                            "October", "November", "December"};
                            
    cout<<"\n.:ENTER RAINFALL VALUES:.\n";
    for(int i = 0; i < 12; i++){
        cout<<months[i]<<": ";
        cin>>input;
        rf.setValue(i, input);
    }
    cout<<"\n";
}