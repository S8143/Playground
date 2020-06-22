#include<iostream>
using namespace std;
int power_of(int x, int y)
{
  int m,Ans;
  Ans = x;
  m = y;
  while((m-1)!=0)
  {
    Ans = Ans*x;
      m--;
  }
  return Ans;
}
int main()
{
  int a,n,power;
  cin>>a;
  cin>>n;
  cout<<"Enter the value of a"<<endl;
  cout<<"Enter the value of n"<<endl;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power_of(a,n)<<endl;
}