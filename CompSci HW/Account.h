#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Account{
    private:
        string name;
        int numWithdrawal;
        double balance;
        bool isBasic;
    public:
        Account(string = "", double = 0, bool = false);
        string getName();
        bool getBasic();
        void deposit(double);
        bool withdraw(double);
        void display();
};
