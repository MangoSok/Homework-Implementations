#ifndef LINKEDLISTCHAR_H 
#define LINKEDLISTCHAR_H
using namespace std; 
// Representation of an element in the linked list
struct Node 
{
    char val; // Value of the node
    Node *next; // Pointer to the next node
};
class LinkedList 
{
    // Public Functions/Variables
    public:
        /* IMPLEMENT THESE FUNCTIONS FOR EXERCISE1 */
        LinkedList(); // Constructor
        ~LinkedList(); // Destructor
        void insertAtBack(char value);
        bool removeFromBack();
        void print();
        bool isEmpty();
        int size();
        void clear();
        /* IMPLEMENT THSES FUNCTIONS FOR EXERCISE2 */
        void insertAtFront(char value);
        bool removeFromFront();
        // Private Functions/Variables
        Node *first; // Pointer pointing to the begining of the list
        Node *last; // Pointer pointing to the end of the list
};
#endif