#include<iostream>
using namespace std;
int gcd(int n,int m)
{
    if (m!= 0)
       return gcd(m, n % m);
    else 
       return n;
}
  
int main()
{
  int n,m;
  cin>>n;
  cin>>m;
  cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<gcd(n,m);
}