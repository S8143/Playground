#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,m=121;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    if(i==0)
    {
      cout<<m;
      continue;
    }
    else
    {
      int l=i*32;
      int k = m+72+l;
      m=k;
      cout<<" "<<k;
    }
  }
}
    