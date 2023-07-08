#include <bits/stdc++.h>
using namespace std;

int main()
{
    ifstream inputFile("in.txt");
    ofstream encodedFile("cipher.txt");

    string s;
    inputFile >> s;
    cout << s << endl;

    string ans = "";
    int t;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] > 'Z')
        {
            ans += 'a' + ((s[i] - 'a' + 3) % 26);
        }
        else
        {
            ans += 'A' + ((s[i] - 'A' + 3) % 26);
        }
    }

    cout << ans;
    encodedFile << ans;
}