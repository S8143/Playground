#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n;
  cout<<n<<endl;
  while(n!=1)
  {
    if(n%2==0)
    {
      n = n/2;
      cout<<n<<endl;;
    }
    else
    {
      n = 3*n+1;
      cout<<n<<endl;
    }
    ++m;
  }
  cout<<m<<endl;
}