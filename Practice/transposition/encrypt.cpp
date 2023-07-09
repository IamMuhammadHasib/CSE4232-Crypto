#include <bits/stdc++.h>
#define ll long long
#define ull unsigned long long
using namespace std;

string encodeIt(string text, int width)
{
    string ans;
    for(int i=0; i<width; i++)
    {
        for(int j=0; j*width+i<text.size(); j++)
        {
            ans += text[j*width + i];
        }
    }
    return ans;
}

int main()
{
    int width = 10;

    ifstream fin("in.txt");
    ofstream fout("cipher.txt");

    string text = "", tem;
    while (fin >> tem)
    {
        text += tem + " ";
    }
    text = text.substr(0, text.length()-1);
    cout<<text<<endl;

    string cipherText = encodeIt(text, width);
    cipherText = encodeIt(cipherText, 2*width);
    cout<<cipherText;
    fout<<cipherText;

}