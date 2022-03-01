#include "Queue.h"
#include "LinkedList.cpp"
#include <iostream>

using namespace std;

Queue::Queue(){

}

Queue::~Queue(){

}

void Queue::enqueue(int value){
    insertAtBack(value);
}

int Queue::dequeue(){
    if(first == NULL){
        std::cout<<"Call to dequeue() generated an exception, because the queue is empty\n";
        return 0;
    }

    int num = first->val;
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

int& Queue::front(){

    if(first == NULL){
        std::cout<<"Call to front() generated an exception, because the queue is empty\n";
        int num = 0;
        return num;
    }
    return first->val;

    /*
    try{
        throw 20;
    }
    catch(int e){
        cout<<"Cannot return the front element because the queue is empty";
    }*/
}
