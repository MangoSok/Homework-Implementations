#include <iostream>
#include <iomanip>
#include "GiftWrap.h"
#include <string>
using namespace std;

    GiftWrap::GiftWrap(){
        length = 1.0;
        width = 1.0;
        height = 1.0;
        taxRate = 0.08;
        pricePerInch = 0.0036;
        
    }
    GiftWrap::GiftWrap(double rate, double price){
        length = 1.0;
        width = 1.0;
        height = 1.0;
        if(rate >= 0)
            taxRate = rate;
        else
            taxRate = 0.08;
        if(price > 0)
            pricePerInch = price;
        else
            pricePerInch = 0.0036;
    }
    void GiftWrap::setL(double num){
        length = num;
    }
    void GiftWrap::setW(double num){
        width = num;
    }
    void GiftWrap::setH(double num){
        height = num;
    }
    void GiftWrap::setP(double num){
        pricePerInch = num;
    }
    void GiftWrap::setR(double num){
        taxRate = num;
    }
    double GiftWrap::getL(){
        return length;
    }
    double GiftWrap::getW(){
        return width;
    }
    double GiftWrap::getH(){
        return height;
    }
    double GiftWrap::getP(){
        return pricePerInch;
    }
    double GiftWrap::getR(){
        return taxRate;
    }
    double GiftWrap::calcTax(){
        return calcSubTotal()*taxRate;
    }
    double GiftWrap::calcTotal(){
        return (calcSubTotal()+calcTax());
    }
    double GiftWrap::calcSubTotal(){
        double num = (2*length*width) + (2*length*height) + (2*width*height);
        return num*pricePerInch;
    }
