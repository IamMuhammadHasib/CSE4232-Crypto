#include <bits/stdc++.h>
using namespace std;

int main()
{
    ifstream encodedFile("cipher.txt");
    ofstream outputFile("out.txt");

    string s;
    encodedFile >> s;
    cout << s << endl;

    string ans = "";
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] > 'Z')
        {
            ans += 'a' + (((s[i] - 'a' - 3) + 26) % 26);
        }
        else
        {
            ans += 'A' + (((s[i] - 'A' - 3) + 26) % 26);
        }
    }
    cout << ans;
    outputFile << ans;
}