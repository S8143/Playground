#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,m=6,k,l,i,r;
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
    k = 5*i;
    l = m+k;
    m = l;
    cout<<" "<<l;
  }
}
}

    