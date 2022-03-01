#include <iostream>
using namespace std;
int main()
{
        int size = 0;
        int num = 0;
        cout<<"\nEnter the size of the array: ";
        cin >> size;
        bool inc = true;

        if(size <= 0){
                cout<<"\nERROR: you entered an incorrect value for the size of an array!"<<endl;
        }
        else{
                int arr[size];
                cout<<"\nEnter the number in the array, separated by a space, and press enter: ";
                for(int i = 0; i < size; i++){
                        cin>>num;
                        arr[i] = num;
                        if(i > 0 && arr[i-1] >= num){
                                inc = false;
                        }
                }
                if(inc){
                        cout<<"\nThis IS an increasing array!\n";
                }
                else{
                        cout<<"\nThis is NOT an increasing array!\n";
                }
		for(int i = 0; i < size; i++){
			cout<<arr[i]<<" ";
		}
		cout<<endl;
        }
        return 0;
}



