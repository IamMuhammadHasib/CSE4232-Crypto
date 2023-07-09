#include <bits/stdc++.h>
using namespace std;

int main()
{
    ifstream fin("in.txt");
    ofstream fout("cipher.txt");
    ifstream dict("dictionary.txt");

    map<string, string> end, ded;

    string line, key, val;
    while(getline(dict, line))
    {
        key = line.substr(0, 3);
        val = line.substr(4, line.length());

        end[key] = val;
    }

    string s;
    fin>>s;
    cout<<s<<endl;

    string ans="";
    for(int i=0; i<s.length(); i+=3)
    {
        ans += end[s.substr(i,3)];
    }
    cout<<ans<<endl;
    fout<<ans;


}