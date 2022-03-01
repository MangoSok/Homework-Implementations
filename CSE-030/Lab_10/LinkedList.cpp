#include "LinkedList.h"
#include <iostream>

using namespace std;

LinkedList::LinkedList(){
    first = NULL;
    last = NULL;
}

LinkedList::~LinkedList(){

}


void LinkedList::insertAtBack(int valueToInsert){
    Node *newNode = new Node;
    newNode->val = valueToInsert;
    newNode->next = NULL;

    if(first == NULL){
        first = newNode;
        last = newNode;
    }
    else{
        last->next = newNode;
        last = newNode;
    }
    newNode = NULL;
}

bool LinkedList::removeFromBack(){

    if(first == NULL){
        return false;
    }

    else if(last == first){
        delete first;
        first = NULL;
        last = NULL;
        return true;
    }

    else{

        Node *temp = first;

        while(temp->next != last){
            temp = temp->next;
        }

        delete last;
        last = temp;
        last->next = NULL;

        temp = NULL;
        return true;
    }
}

void LinkedList::print(){

    if(first != NULL){
        Node *temp = new Node;
        temp = first;

        while(temp != last){
            cout<<temp->val<<",";
            temp = temp->next;
        }
        cout<<temp->val;
    }
}

bool LinkedList::isEmpty(){
    return (first == NULL);
}

int LinkedList::size(){

    int size = 0;
    Node *temp = new Node;
    temp = first;

    while(temp != NULL){
        size++;
        temp = temp->next;
    }

    return size;
}

void LinkedList::clear(){
    first = NULL;
    last = NULL;
}

void LinkedList::insertAtFront(int valueToInsert){

    Node *temp = new Node;
    temp->val = valueToInsert;
    temp->next = first;
    first = temp;
    if(first->next == NULL){
        last = first;
    }
}

bool LinkedList::removeFromFront(){

    Node *temp = first;

    if(first == NULL){
        return false;
    }

    if(first == last){
        delete first;
        first = NULL;
        last = NULL;
        return true;
    }

    temp = first->next;
    delete first;
    first = temp;

    return true;
}