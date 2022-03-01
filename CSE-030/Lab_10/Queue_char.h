#ifndef QUEUE_H 
#define QUEUE_H
#include "LinkedList_char.h"
using namespace std; 

class Queue: public LinkedList
{
    // Public Functions/Variables
    public:
        Queue();
        ~Queue(); 
        void enqueue(char value);
        char dequeue();
        char& front();
};
#endif 
