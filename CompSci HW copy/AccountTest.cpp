#include <iostream>
#include <iomanip>
#include <string>
#include "Account.h"
using namespace std;

void transaction(Account&);
int main()
{
    char input;
    Account customerA("George Smith", 1200.00, false);
    Account customerB("Mary Brown", 790.00, true);
    do{
        cout<<"\n\n.:Tiny Bank of Burbank:.";
        cout<<"\nA) Customer George Smith";
        cout<<"\nB) Customer Mary Brown";
        cout<<"\nQ) Quit";
        cout<<"\nEnter a selection: ";
        cin>>input;
        
        input = toupper(input);
        if(input == 'A'){
            transaction(customerA);
            customerA.display();
        }
        else if(input == 'B'){
            transaction(customerB);
            customerB.display();
        }
    }while(input != 'Q');
    
    cout<<"\n\nYou are quitting the program, bye!"<<endl;
    return 0;
}

void transaction(Account &acc){
    int num;
    double amount;
    
    cout<<"\nAction to take:";
    cout<<"\n1) Withdrawal";
    cout<<"\n2) Deposit";
    cout<<"\nEnter action: ";
    cin>>num;
    
    if(num == 1){
        cout<<"\nAmount to withdraw: ";
        cin>>amount;
        if(!acc.withdraw(amount)){
            cout<<"\nThis amount exceeds your balance amount.\n";
        }
    }
    else if (num == 2){
        cout<<"\nAmount to deposit: ";
        cin>>amount;
        acc.deposit(amount);
    }
}
