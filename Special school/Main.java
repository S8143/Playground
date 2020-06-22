#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1;
  string str2;
  string str3;
  getline(std::cin,str1);
  getline(std::cin,str2);
   for(int n = str1.length()-1; n >= 0; n--){
    str3.push_back(str1[n]);
   }
  if(str2!=str3)
  {
    cout<<"It is wrong";
  }
  else
    cout<<"It is correct";
}
    
  