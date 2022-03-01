#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/*
    Return the result of appending the characters in s2 to s1.
    Assumption: enough space has been allocated for s1 to store the extra
    characters.
*/
char* append(char s1[], char s2[]) {
    int s1len = strlen(s1);
    int s2len = strlen(s2);
    int len = s1len + s2len;
    char *str = (char*) malloc(len);
    for (int i = 0; i < len; i++) {
        if(i < s1len){
            str[i] = s1[i];
        }
        else{
            str[i] = s2[i-s1len];
        }
    }
    return str;
}

int main() {
    char str1[10];
    char str2[10];
    while (1) {
        printf("str1 = ");
        scanf("%[^\n]%*c", str1); 
        //if (!gets(str1)) {
        //    return 0;
        //}
        printf("str2 = ");
        scanf("%[^\n]%*c", str2);  
        //if (!gets(str2)) {
        //    return 0;
        //}
        printf ("The result of appending str2 to str1 is %s.\n", append(str1, str2));
        fflush(stdin);
    }
    return 0;
}
