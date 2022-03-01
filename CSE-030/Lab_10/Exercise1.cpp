#include <iostream>
#include "Queue.cpp"

using namespace std;
int main()
{
    Queue q;

    q.front();
    q.dequeue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.enqueue(6);
    q.enqueue(7);
    q.enqueue(8);
    q.enqueue(9);
    q.enqueue(10);

    cout<<endl<<q.front();

    cout<<"\nSize of queue is : "<<q.size();

    if(q.isEmpty()){
        cout<<"\nThe queue is empty\n";
    }
    else{
        cout<<"\nThe queue is not empty\n";
    }

    q.print();
    cout<<endl;
}