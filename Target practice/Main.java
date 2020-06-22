#include<iostream>
using namespace std;
int main()
{
  int target,score,attempt=1,sum;
  cin>>target>>score;
  sum = score;
  while(sum<target)
  {
    cin>>score;
    sum = sum+score;
    attempt++;
  }
  cout<<"The number of turns is "<<attempt;
}