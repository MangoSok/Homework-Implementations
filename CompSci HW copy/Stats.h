#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Stats{
    private:
        double nums[12];
        int numWithdrawal;
        double balance;
        bool isBasic;
    public:
        Stats();
        void setValue(int, double);
        void displayValues();
        double calcTotal();
        double calcAvg();
        double calcLargest();
        double calcSmallest();
};