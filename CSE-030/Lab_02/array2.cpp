#include <iostream>
using namespace std;
int main()
{
	string str = "";
	string reverse = "";
	cout<<"\nEnter the string to reverse: ";
	cin>>str;

        for(int i = str.length()-1; i >= 0; i--){
		reverse += str[i];
	}
	cout<<"\n"<<reverse<<endl;
        return 0;
}
