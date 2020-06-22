#include<iostream>
using namespace std;
int main()
{
  int n,m,even=0,odd=0;
  cin>>n;
  while(n!=0)
  {
    m=n%10;
    if(m%2==0)
    {
      even = even + m;
    }
    else
    {
      odd = odd + m;
    }
    n=n/10;
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";
    
    
}