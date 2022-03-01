#include <stdio.h> 

    int main() { 
    int x, y, *px, *py; 
    int arr[10]; 

    x = 4;
    y = 5;

    px = &x;
    py = &y;

    for(int i = 0; i < 10; i++){
        arr[i] = i;
    }
    for(int i = 0; i < 10; i++){
        printf("\n:::\n");
        printf("%d" , *(arr+i));
    }
    printf("\n:::\n\n");

    printf("Adress of x is: %p Value of x is: %d", (void*)&x, x);
    printf("\n\nAdress of y is: %p Value of y is: %d", (void*)&y, y);
    printf("\n\npx vatiable is %p, and py variable is %p", px, py);
    printf("\n\n");
    for(int i = 0; i < 10; i++){
        printf("%d", arr[i]);
        printf("\n");
    }
    return 0; 
}