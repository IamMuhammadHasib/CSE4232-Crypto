#include <bits/stdc++.h>
#define ll long long
#define ull unsigned long long
using namespace std;

string decodeIt(string cipherText, int width)
{
    int length = cipherText.size();
    int overflow = length%width;
    int row = length/width;

    string ans(length, '#');
    int k = 0;
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
    int width = 10;

    ifstream fin("cipher.txt");
    ofstream fout("out.txt");

    string cipherText = "", tem;
    while (fin >> tem)
    {
        cipherText += tem + " ";
    }
    cipherText = cipherText.substr(0, cipherText.length() - 1);
    cout << cipherText << endl;

    string text = decodeIt(cipherText, 2*width);
    text = decodeIt(text, width);
    cout << text;
    fout << text;
}