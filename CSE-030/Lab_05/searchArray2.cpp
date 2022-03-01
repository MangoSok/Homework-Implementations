#include <iostream>
#include <string>
#include <fstream>
#include <assert.h>
using namespace std;

int checkArraySort(string *a, int size){
	
	int i = 0;
	bool inc = true;
	bool dec = true;


	while(inc == true && i < size-1){
		
		if(a[i+1]<a[i]){
			inc = false;
		}
		i++;
	} 
	
	if(inc){
		return 1;
	}
	else{
		i=0;
		while(dec == true && i < size-1){
			if(a[i]<a[i+1]){
				dec = false;
			}
			i++;
		}
		
		if(dec){
			return -1;
		}
	}
	return 0; 
}


int binarySearchL(string *a, int size, string key, bool ascending){
	
    	int low = 0, high = size - 1;
 
    	while (low <= high)
    	{
 		int middle = (low + high)/2;
        	
		if (key == a[middle]) {
            		return middle;
        	}
        	else if ((key < a[middle] && ascending) || (key > a[middle] && !ascending)){
            		high = middle - 1;
        	}
        	else {
            		low = middle + 1;
        	}
    	}
	return -1;
}


int main()
{
	int i = 0;
	int count = 0;
	string data;
	ifstream fin;
	string key = "";

	cout<<"\nPlease input the key to search for: ";
	cin>>key;

	fin.open("sorted_descending.txt",ios::in);
	assert(!fin.fail());
	fin>>data;

	while(!fin.fail()){
		count++;
		fin>>data;
	}

	fin.close();

	string* words = new string[count];

	fin.open("sorted_descending.txt",ios::in);
	assert(!fin.fail());
	fin>>data;
	
	while(!fin.fail() && i < count){
		words[i++] = data;
		fin>>data;
	}
	fin.close();

	int num = checkArraySort(words, count);	

	if(num == 0){
		cout<<endl<<"The array is not sorted!"<<endl;
	}
	else{
		int index = binarySearchL(words, count, key, num+1);
	
		if(index == -1){
			cout<<"\nThe key "<<key<<" was not found in the array!\n";
		} else{
			cout<<"\nFound key "<<key<<" at index "<<index<<"!\n";
		}

		if(num == -1){
                	cout<<endl<<"The array is sorted in descending order!"<<endl;
        	}
        	else if(num == 1){
                	cout<<endl<<"The array is sorted in ascending order!"<<endl;
		}
        }
	
}

