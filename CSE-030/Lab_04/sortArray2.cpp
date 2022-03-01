#include <iostream>
#include <string>
using namespace std;

void sortArr(int arr[],int size,bool asc){
	int j = 0;
	int smallest = 0;
	int largest = 0;

	if(!asc){
		for(int i = 1; i < size; i++){
			smallest = arr[i];
			j = i;
			while(j>0 && arr[j-1]>smallest){
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = smallest;

		}
	} else{
		for(int i = 1; i < size; i++){
			largest = arr[i];
			j = i;
			while(j>0 && arr[j-1]<largest){
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = largest;

		}
	}
}

int main(){
	int size = 0;
	int num = 0;
	int temp = 0;
	int smallest = 0;
	bool found = false;

	cout<<"\nEnter the size of the array: ";
	cin>>size;

	if(size < 1){
		cout<<"ERROR: you entered an incorrect value for the array size!\n"<<endl;
	}
	else{
		int arr[size]; //creating the array
		cout<<"\nEnter the numbers in the array, separated by a space, and press enter: ";
		for(int i = 0; i < size; i++){
 
			cin>>num;
			arr[i] = num;
		}
		cout<<"\nSort in ascending (0) or descending (1) order? ";
		cin>>found;
		
		sortArr(arr, size, found);

		for(int i = 0; i < size; i++){
			cout<<arr[i]<<" ";
		}
		cout<<endl;
	}
}

