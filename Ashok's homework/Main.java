#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int arr1[r][c];
  int arr2[r][c];
  int sum[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>arr1[i][j];
    }
  }
  for(int k=0;k<r;k++)
  {
    for(int l=0;l<c;l++)
    {
      cin>>arr2[k][l];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      sum[i][j] = arr1[i][j] + arr2[i][j];
      cout<<sum[i][j]<<" ";
    }
    cout<<"\n";
  }
}