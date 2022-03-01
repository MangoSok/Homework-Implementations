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

int main()
{
	int i = 0;
	int count = 0;
	string data;
	ifstream fin;

	fin.open("words_in.txt",ios::in);
	assert(!fin.fail());
	fin>>data;

	while(!fin.fail()){
		count++;
		fin>>data;
	}

	fin.close();

	string* words = new string[count];

	fin.open("words_in.txt",ios::in);
	assert(!fin.fail());
	fin>>data;
	
	while(!fin.fail() && i < count){
		words[i++] = data;
		fin>>data;
	}
	fin.close();
	int num = checkArraySort(words, count);
	cout<<"\n"<<num<<endl;	
	if(num == -1){
		cout<<endl<<"The array is sorted in descending order!"<<endl;
	}
	else if(num == 1){
		cout<<endl<<"The array is sorted in ascending order!"<<endl;
	}
	else{
		cout<<endl<<"The array is not sorted!"<<endl;
	}
}

