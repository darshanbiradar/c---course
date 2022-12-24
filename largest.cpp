#include<iostream>
#include<climits>
using namespace std;

int main()
{
    int temp,i, a[100],n;
     temp=-9999;
    cout<<"enter the size of array";
    cin>>n;
    cout<<"enter the elements of array";
    for(i=0;i<n;i++)
    {
        cin>>a[i];
    }
    for(i=0;i<n;i++)
    {
        
        temp=max(temp,a[i]);
        
        
    }
    cout<<"ans"<<temp;
return 0;
}