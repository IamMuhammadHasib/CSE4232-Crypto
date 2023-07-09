#include<bits/stdc++.h>
#define ll long long
#define ull unsigned long long
using namespace std;

string decryptIt(string cipherText, int width)
{
    int length = cipherText.size();
    int row = length/width;
    int overflow = length%width;

    int k=0;
    string ans(length, '#');
    for(int i=0; i<width; i++)
    {
        overflow--;
        int tem = row + (overflow>=0);
        for(int j=0; j<tem; j++)
        {
            ans[j*width+i] = cipherText[k++];
        }
    }
    return ans;
}

int main()
{
    int width = 4;

    string cipherText = "cfeoosdrec";
    string text = decryptIt(cipherText, width);
    cout<<text<<endl;
}