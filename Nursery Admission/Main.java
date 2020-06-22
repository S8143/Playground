#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str;
  getline(std::cin,str);
  int length = str.length();
  cout<<"The number of letters in the name is "<<length;
}