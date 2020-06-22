#include<iostream>
using namespace std;
int main()
{
  int num,rem=0,sum=0;
  cin>>num;
  int n = num;
  while(num>0)
  {
    rem = num%10;
    sum  = sum + rem;
      num = num/10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
    
}