#include<iostream>
using namespace std;
int main()
{
  int n,m=121,i,k,l,r;
  cin>>n;
  for(i=0;i<n;i++)
  {
    if(i==0)
    {
      cout<<m;
      continue;
    }
    else
    {
      k = 32*i;
      l = m+72+k;
      m = l;
      cout<<" "<<l;
    }
  }
}