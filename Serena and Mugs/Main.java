#include<iostream>
using namespace std;
int main()
{
  int n,s,volume=0,i;
  cin>>n;
  cin>>s;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(i=0;i<n;i++)
  {
    volume = volume +arr[i];
  }
  if(volume<=s)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
}