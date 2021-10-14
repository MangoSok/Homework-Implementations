#include <iostream>
#include <iomanip>
#include <string>
#include "Stats.h"
using namespace std;

Stats::Stats(){
    for(int i = 0; i < 12; i++){
        nums[i] = 0.00;
    }
}

void Stats::setValue(int index, double num){
    nums[index] = num;
    if(num < 0){
        nums[index] = 0;
    }
}

void Stats::displayValues(){
    cout<<"\n\nRAINFALL VALUES:\n";
    cout<<"| January | Fabruary|    March|    April|      May|     June|\n";
    for(int i = 0; i < 6; i++){
        cout<<"|"<<setw(9)<<nums[i];
    }
    cout<<"|\n\n";
    cout<<"|    July |  August |September| October | November| December|\n";
    for(int i = 6; i < 12; i++){
        cout<<"|"<<setw(9)<<nums[i];
    }
    cout<<"|\n\n";
}

double Stats::calcTotal(){
    double total = 0;
    for(int i = 0; i < 12; i++){
        total += nums[i];
    }
    return total;
}

double Stats::calcAvg(){
    double total = calcTotal();
    return total/12;
}

double Stats::calcLargest(){
    double largest = nums[0];
    for(int i = 1; i < 12; i++){
        if(largest < nums[i]){
            largest = nums[i];
        }
    }
    return largest;
}

double Stats::calcSmallest(){
    double smallest = nums[0];
    for(int i = 1; i < 12; i++){
        if(smallest > nums[i]){
            smallest = nums[i];
        }
    }
    return smallest;
}