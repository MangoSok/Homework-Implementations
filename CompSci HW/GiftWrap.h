#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class GiftWrap{
    private:
        double length;
        double width;
        double height;
        double pricePerInch;
        double taxRate;
    public:
        GiftWrap();
        GiftWrap(double, double);
        void setL(double);
        void setW(double);
        void setH(double);
        void setP(double);
        void setR(double);
        double getL();
        double getW();
        double getH();
        double getP();
        double getR();
        double calcTax();
        double calcTotal();
        double calcSubTotal();
};