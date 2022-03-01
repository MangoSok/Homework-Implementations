#include <iostream>
using namespace std;
int main()
{
        int size = 0; 
	int num = 0;
	int count = 0;
	
	cout<<"\nEnter the size of a square 2D array: ";
	cin>>size;
	
	if(size < 1 || size > 10){
		cout<<"\nERROR: your array is either too large or too little! ENter 1 to 10."<<endl;
	}
	else{
		int arr[size][size];
		for(int r = 0; r < size; r++){
			cout<<"\nEnter the values in the array for row "<<r+1;
			cout<<", separated by a space, and press enter: ";
			for(int c = 0; c < size; c++){
				cin>>num;
				arr[r][c] = num;
				if(num < 0){
					count++;
				}
			}
		}
		cout<<"\nThere are "<<count<<" negative values!"<<endl;
	}
}

