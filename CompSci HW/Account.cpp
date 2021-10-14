#include <iostream>
#include <iomanip>
#include <string>
#include "Account.h"
using namespace std;

Account::Account(string n, double b, bool i){
    name = n;
    numWithdrawal = 0;
    balance = b;
    isBasic = i;
}

string Account::getName(){
    return name;
}

bool Account::getBasic(){
    return isBasic;
}

void Account::deposit(double num){
    balance += num;
}

bool Account::withdraw(double num){
    if(balance - num < 0.00){
        return false;
    }
    if(isBasic){
        if(numWithdrawal >= 3){
            if(balance - num - 0.5 < 0.00){
                return false;
            }
            else{
                balance -= 0.5;
                cout<<"\n\nYou have been charged extra 50 cents because";
                cout<<" you made more than 3 withdrawals this month.\n\n";
            }
        }
        balance -= num;
        numWithdrawal += 1;
        return true;
    }
    
    else{
        if(balance - num < 1000.00){
            if(balance - num - 0.5 < 0){
                return false;
            }
            balance -= 0.5;
            cout<<"\n\nYou have been charged extra 50 cents because";
            cout<<" your balance dropped below $1000.\n\n";
        }
        balance -= num;
        numWithdrawal += 1;
        return true;
    }
}

void Account::display(){
    cout<<fixed;
    cout<<"\nFor ";
    if(isBasic){
        cout<<"basic ";
    }
    else{
        cout<<"regular ";
    }
    cout<<"account, number of withdrawals is "<<numWithdrawal;
    cout<<" and the balance is $"<<setprecision(2)<<balance<<"\n";
}
