#include <iostream>
#include <fstream>
#include <assert.h>
#include <string>
using namespace std;


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

	ofstream fin_out;
	fin_out.open("words_out.txt",ios::out);
	assert(!fin_out.fail());
	
	for(i = 0; i < count; i++){
		fin_out<<words[i]<<endl;
	}
	fin_out.close();
}
