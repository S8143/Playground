#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  int num;
  cin>>num;
  for(int j=0;j<n;j++)
  {
    if(num==arr[j])
    {
      cout<<"She passed her exam";
      goto end;
    }
     
  }
  cout<<"She failed";
  end: cout<<endl;
 }