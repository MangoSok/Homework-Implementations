#include <iostream>
#include <iomanip>
#include <string>
#include "Employee.h"
using namespace std;

int main()
{
    int num = 0;
    string name, id, dep, pos;
    int years;
    Employee a;
    /*Employee a, b, c; */
    cout<<"How many employees do you want to add?\n";
    cout<<"# of employees: ";
    cin>>num;
    while(num < 0 || num > 100){
        cout<<"Pick a number between 0 and 100: ";
        cin>>num;
    }
    Employee arr[num];
    for(int i = 0; i < num; i++){
        
        cout<<"Enter employee's name: ";
        getline(cin, name);
        getline(cin, name);
        cout<<"Enter employee's ID Number: ";
        getline(cin, id);
        cout<<"Enter employee's department: ";
        getline(cin, dep);
        cout<<"Enter employee's position: ";
        getline(cin, pos);
        cout<<"Enter the number of years this employee has worked: ";
        cin>>years;
	
	if(years < 0){
		cout<<"# of years worked cannot be negative.";
		cout<<"\nIt will be automatically set to 0.\n";
	}
        
        a.setName(name);
        a.setIdNumber(id);
        a.setDepartment(dep);
        a.setPosition(pos);
        
        arr[i] = a;
    }
    /*
    a.setName("Jenny Jacobs");
    b.setName("Myron Smith");
    c.setName("Chris Raines");
    
    a.setIdNumber("JJ8990");
    b.setIdNumber("MS7571");
    c.setIdNumber("CR6873");
    
    a.setDepartment("Accounting");
    b.setDepartment("IT");
    c.setDepartment("Manufacturing");
    
    a.setPosition("President");
    b.setPosition("Programmer");
    c.setPosition("Engineer");
    
    a.setYearsWorked(15);
    b.setYearsWorked(5);
    c.setYearsWorked(30);
    
    arr[0] = a;
    arr[1] = b;
    arr[2] = c;*/
    
    cout<<"     Name     |   ID Number  |";
    cout<<"  Department  |   Position   | Years Worked |";
    
    for(int i = 0; i < num; i++){
        cout<<"\n-------------------------------------";
        cout<<"---------------------------------------";
        arr[i].displayData();
    }
    
    return 0;
}