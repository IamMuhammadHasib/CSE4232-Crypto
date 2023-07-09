#include<bits/stdc++.h>
#define ll long long
#define ull unsigned long long
using namespace std;

string encryptIt(string text, int width)
{
    string ans = "";
    for(int i=0; i<width; i++)
    {
        for(int j=0; j*width+i<text.size(); j++)
        {
            ans += text[j*width+i];
        }
    }
    return ans;
}

int main()
{
    int width = 4;

    string text = "codeforces";
    string cipherText = encryptIt(text, width);
    cout<<cipherText<<endl;
}