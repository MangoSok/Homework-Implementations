#include <stdio.h>
int main( ) {

    int num, typo;

    printf( "\nEnter the number of times you want to repeat the punishment phrase: ");
    scanf("%d", &num);

    while(num < 1){
        printf( "\nYou entered an invalid value for the number of repetitions!");
        printf( "\nEnter the number of times you want to repeat the punishment phrase again: ");
        //num = getint( );
        scanf("%d", &num);
    }

    printf( "\nEnter the repetition line where you want to introduce a typo: ");
    //typo = getint();
    scanf("%d", &typo);

    while(typo < 1 || typo > num){
        printf( "\nYou entered an invalid value for the typo placement!");
        printf( "\nEnter the repetition line where you want to introduce a typo again: ");
        //typo = getint();
        scanf("%d", &typo);
    }

    for(int i = 0; i < num; i ++){

        if(i+1 == typo){
            printf( "\nProgramming in C is phun!");
        }
        else{
            printf( "\nProgramming in C is fun!");
        }
    }
    printf( "\n\n");
    return 0;
}
