#include<iostream>
#include<cmath>
using namespace std;
int no_of_bacteria(int, int, int);
int main()
{
  int m,n,req;
  cin>>m;
  cin>>n;
  cin>>req;
  if(no_of_bacteria(m,n,req))
    cout<<"Doctor, you can proceed with your experiment."<<endl;
  else
    cout<<"Sorry Doctor! You need more bacteria."<<endl;
}
int no_of_bacteria(int x,int y,int z)
{
  int v,w;
  w = pow(x,y);
  if(w>=z)
    v = 1;
  else
    v = 0;
  return v;
}
  