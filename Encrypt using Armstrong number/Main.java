#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int number, temp, remainder, result = 0, n = 0 ;
  cin >> number;
  temp = number;
// Finding the number of digits
  while (temp != 0)
  {
    temp /= 10;
    ++n;
  }
  temp = number;
  // Checking if the number is armstrong
  while (temp != 0)
  {
    remainder = temp%10;
    result += pow(remainder, n);
    temp /= 10;
  }
  if(result == number)
    cout <<"Kindly proceed with encrypting\n";
  else
     cout <<"It is not an Armstrong number\n";
  return 0;
}
