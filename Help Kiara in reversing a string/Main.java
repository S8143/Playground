#include<iostream>
#include<cstring>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
cin.get(str,100);
count = strlen(str);
  for(i=count-1;i>=0;i--)
  {
    std::cout<<str[i];
  }
}