#include <iostream>
#include "Queue_char.cpp"

using namespace std;
int main()
{
    Queue q;

    q.dequeue();
    q.enqueue('D');
    cout<<q.front()<<endl;

    q.enqueue('A');
    cout<<endl<<q.front()<<endl;

    cout<<endl<<q.dequeue()<<endl;
    cout<<endl<<q.front()<<endl;

    cout<<"\nSize of queue is : "<<q.size();

    q.enqueue('D');

    if(q.isEmpty()){
        cout<<"\nThe queue is empty\n";
    }
    else{
        cout<<"\nThe queue is not empty\n";
    }
    cout<<endl<<q.front()<<endl;
    
    q.enqueue('T');
    cout<<endl<<q.front()<<endl;
    q.print();

    cout<<endl;
}