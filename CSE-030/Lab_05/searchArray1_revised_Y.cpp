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


int binarySearchR(string *a, int left, int right, string key, bool ascending){
	cout<<ascending<<endl;
	if(right >= 1){
// Y: that is a weird updating of 'middle'
		int middle = left + (right - 1)/2;
// Y: why not:
//		int middle=(left+right)/2;	 												// un-quote this line to see the difference
		
		cout<<left<<" "<<middle<<" "<<right<<endl ; //Y: moniter every round of binary search. 
//Y: You will find that, if you search for the element on the tail, the search will never end.
		
		if(a[middle] == key){
			return middle;
		}
// Y: so you need also check the left and right element to solve the problem:
// Y: un-quote the followings to see the difference
//		if(a[left] == key){	 														// un-quote this line to see the difference
//			return left;	 														// un-quote this line to see the difference
//		}	 																		// un-quote this line to see the difference
//		if(a[right] == key){	 													// un-quote this line to see the difference
//			return right;	 														// un-quote this line to see the difference
//		}	 																		// un-quote this line to see the difference
		
		if((a[middle] > key && ascending) || (a[middle] < key && !ascending)){
			return binarySearchR(a, left, middle-1, key, ascending);
		}
		return binarySearchR(a, middle+1, right, key, ascending);
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

	fin.open("words_in.txt",ios::in);
	assert(!fin.fail());
	fin>>data;

	while(!fin.fail()){
		count++;
		fin>>data;
	}
// Y:count is the length of the array.
cout<<"The total length is "<<count<<", which means the last index is "<<count-1<<endl;

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
	
cout<<"And yet, the 'right' value you passed to the binarySearchR function is "<<count-1<<endl;
cout<<"No wonder that will exceed the array boundary and report error"<<endl;

	if(num == -1){
                cout<<endl<<"The array is sorted in descending order!"<<endl;
                
		num = binarySearchR(words, 0, count, key, false);
// Y: the next line is the right version:
//		num = binarySearchR(words, 0, count-1, key, false); 						// un-quote this line to see the difference
		
		if(num == -1){
			cout<<"\nThe key "<<key<<" was not found in the array!\n";
		} else{
			cout<<"\nFound key "<<key<<"at index "<<num<<"!\n";
		}
        }
        else if(num == 1){
                cout<<endl<<"The array is sorted in ascending order!"<<endl;
                
		int index = binarySearchR(words, 0 , count, key, true);
// Y: the next line is the right version:
//		int index = binarySearchR(words, 0 , count-1, key, true); 					// un-quote this line to see the difference
		
		if(index == -1){
                        cout<<"\nThe key "<<key<<" was not found in the array!\n";
                } else{   
                        cout<<"\nFound key "<<key<<"at index "<<index<<"!\n";
                }
	}
        else{
                cout<<endl<<"The array is not sorted!"<<endl;
        }
// Y: by the way, you can do this version:
// Y: num+1 is 2 when ascending and will be regarded as true
// Y: num+1 is 0 when descending and will be regarded as false
//cout<< binarySearchR(words, 0, count-1, key, num+1);     							// un-quote this line to see the difference
// Y: That will save two ifs on line 112 and 125
	
}



