#include <iostream>
#include <iomanip>
#include <string>
#include "Employee.h"
using namespace std;

Employee::Employee(string n, string id, string d, string p, int num){
    name = n; 
    idNumber = id;
    department = d;
    position = p;
    if(num >= 0){
        yearsWorked = num;
    }
    else{
        yearsWorked = 0;
    }
}

void Employee::setName(string n){
    name = n;
}
string Employee::getName(){
    return name;
}
        
void Employee::setIdNumber(string id){
    idNumber = id;
}
string Employee::getIdNumber(){
    return idNumber;
}
        
void Employee::setDepartment(string d){
    department = d;
}
string Employee::getDepartment(){
    return department;
}
        
void Employee::setPosition(string p){
    position = p;
}
string Employee::getPosition(){
    return position;
}
        
void Employee::setYearsWorked(int num){
    if(num >= 0){
        yearsWorked = num;
    }
    else{
        yearsWorked = 0;
    }
}
int Employee::getYearsWorked(){
    return yearsWorked;
}

void Employee::displayData(){
    cout<<"\n"<<setw(14)<<name<<"|";
    cout<<setw(14)<<idNumber<<"|";
    cout<<setw(14)<<department<<"|";
    cout<<setw(14)<<position<<"|";
    cout<<setw(14)<<yearsWorked<<"|";
}