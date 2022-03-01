#include "Queue_char.h"
#include "LinkedList_char.cpp"
#include <iostream>

using namespace std;

Queue::Queue(){

}

Queue::~Queue(){

}

void Queue::enqueue(char value){
    insertAtBack(value);
}

char Queue::dequeue(){
    if(first == NULL){
        std::cout<<"Call to dequeue() generated an exception, because the queue is empty\n";
        return 0;
    }

    char num = first->val;
    removeFromFront();
    return num;

    /*
    try{
        throw 20;
    }
    catch(int e){
        cout<<"Cannot remove an element because the queue is empty";
    }*/
}

char& Queue::front(){

    if(first == NULL){
        std::cout<<"Call to front() generated an exception, because the queue is empty\n";
        char num = '?';
        return num;
    }
    char value = first->val;
    return value;

    /*
    try{
        throw 20;
    }
    catch(int e){
        cout<<"Cannot return the front element because the queue is empty";
    }*/
}
