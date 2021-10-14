#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Employee
{
    private:
        string name;
        string idNumber;
        string department;
        string position;
        int yearsWorked;
    public:
        Employee(string = "", string = "", string = "", string = "", int = 0);
        
        void setName(string);
        string getName();
        
        void setIdNumber(string);
        string getIdNumber();
        
        void setDepartment(string);
        string getDepartment();
        
        void setPosition(string);
        string getPosition();
        
        void setYearsWorked(int);
        int getYearsWorked();
        
        void displayData();
};