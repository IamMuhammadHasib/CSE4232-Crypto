#include <bits/stdc++.h>
using namespace std;

int main()
{
    ifstream fin("cipher.txt");
    ofstream fout("out.txt");
    ifstream dict("dictionary.txt");

    map<string, string> ded;

    string line, key, val;
    while (getline(dict, line))
    {
        key = line.substr(0, 3);
        val = line.substr(4, line.length());

        ded[val] = key;
    }

    string s;
    fin >> s;
    cout << s << endl;

    string ans;
    for (int i = 0; i < s.length(); i++)
    {
        ans += ded[s.substr(i, 3)];
    }
    cout << ans << endl;
    fout << ans;
}