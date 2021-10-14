#include <iostream>
#include <string>
#include <cctype>
#define _USE_MATH_DEFINES
using namespace std;

void inverse(string&);
void reverse(string&);
void uppercase(string&);
int countWords(string);
int consonants(string);
void printStr(string);

int main()
{
    string input = "";
    char choice;
    
    cout<<"Please enter a word, a sentence, or a string of numbers:";
    getline(cin,input);
    
    do{
        cout<<"\n\nUSE THIS MENU TO MANIPULATE YOUR STRING";
        cout<<"\n---------------------------------------";
        cout<<"\n1) Inverse String";
        cout<<"\n2) Reverse String";
        cout<<"\n3) To Uppercase";
        cout<<"\n4) Count Number of Words";
        cout<<"\n5) Count Consonants";
        cout<<"\n6) Enter a Different String";
        cout<<"\n7) Print the String";
        cout<<"\nQ) Quit";
        cout<<"\nEnter your selection: ";
        cin>>choice;
        
        if(isalpha(choice))
            choice = toupper(choice);
            
        if(choice == '1'){
            inverse(input);
        }
        else if(choice == '2'){
            reverse(input);
        }
        else if(choice == '3'){
            uppercase(input);
        }
        else if(choice == '4'){
            cout<<"\nThere are "<<countWords(input)<<" words in "<<input;
        }
        else if(choice == '5'){
            cout<<"\nThere are "<<consonants(input)<<" consonants in: "<<input;
        }
        else if(choice == '6'){
            input = "";
            cout<<"\nEnter a different string: ";
            getline(cin,input);
            getline(cin,input);
        }
        else if(choice == '7'){
            printStr(input);
        }
    }
    while(choice != 'Q');
    cout<<"\n\nQuitting the program, bye!\nDont forget to wash your hands!"<<endl;
    return 0;
}

void inverse(string& input){
    for(int i = input.length()-1; i >= 0; i--){
                if(isalpha(input[i])){
                    if(input[i] == tolower(input[i]))
                        input[i] = toupper(input[i]);
                    else
                        input[i] = tolower(input[i]);
                }
    }
}

void reverse(string& input){
    string temp = "";
    for(int i = input.length()-1; i >= 0; i--){
        temp += input[i];
    }
    input = temp;
}

void uppercase(string& input){
    for(int i = input.length()-1; i >= 0; i--){
        if(isalpha(input[i]))
            input[i] = toupper(input[i]);
    }
}

int countWords(string input){
    /***int count = 0;
    for(int i = input.length()-1; i >= 0; i--){
        if(isspace(input[i]) && i != input.length()-1){
            count++;
            while(i != 0 && isspace(input[i]))
                        i--;
        }
    }
    return count;***/
    int spaces = 0;

    // Skip over spaces at the beginning of the word
    int i = 0;
    while(i < isspace(input[i]))
        i++;

    for(; i < input.length(); i++)
    {
        if(isspace(input[i]))
        {
            spaces++;

            // Skip over duplicate spaces & if a NULL character is found, we're at the end of the string
            while(isspace(input[i++]))
                if(input[i] == '\0')
                    spaces--;
        }
    }

    // The number of words = the number of spaces + 1
    return spaces + 1;
}

int consonants(string input){
    int count = 0;
    int arr[5] = { 'a', 'e', 'i', 'o', 'u'};
    char letter;
    for(int i = input.length()-1; i >= 0; i--){
        if(isalpha(input[i])){
            letter = tolower(input[i]);
            if(letter != 'a'&&letter != 'e'&&letter != 'i'&&letter != 'o'&&letter != 'u'){
                count++;
            }
        }
    }
    return count;
}

void printStr(string input){
    cout<<"\nThe current string is: "<<input;
}