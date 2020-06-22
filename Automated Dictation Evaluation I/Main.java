#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1;
  string str2;
  getline(std::cin,str1);
  getline(std::cin,str2);
  if(str1!=str2)
  {
    cout<<"It is wrong";
  }
  else
  {
    cout<<"It is correct";
  }
    
}