#include "BTree.h"
#include <iostream>

BTree::BTree(){
    root = NULL;
}

BTree::~BTree(){
    destroy_tree();
}

void BTree::insert(int key){
    Node *node = new Node;
    Node *parent = new Node;

    parent = NULL;
    node -> key_value = key;
    node -> left = NULL;
    node -> right = NULL;

    if(root == NULL){
        root = node;
    }
    else{
        Node *temp = root;
        while(temp != NULL){
            parent = temp;
            if(key > (temp -> key_value)){
                temp = temp -> right;
            }
            else{
                temp = temp -> left;
            }
        }
        if(key < (parent -> key_value)){
            parent -> left = node;
        }
        else{
            parent -> right = node;
        }
    }
}

Node* Search_Node(int key, Node* node){

    if(node == NULL || node -> key_value == key){
        return node;
    }
    if(node -> key_value < key){
        return Search_Node(key, node -> right);
    }
    return Search_Node(key, node -> left);
}

Node* BTree::search(int key){
    return Search_Node(key, root);
}

void deleteTree(Node* node){
    if(node != NULL){

        deleteTree(node -> left);
        deleteTree(node -> right);

        delete node;
    }
}

void BTree::destroy_tree(){
    deleteTree(root);
}

Node* BTree::BTree_root(){
    return root;
};