#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int n,even=0,odd=0;
  cin>>n;
  int *a;
  a = (int*)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      ++even;
    }
    else
    {
      ++odd;
    }
  }
  cout<<odd<<endl;
  cout<<even<<endl;
  return 0;
}