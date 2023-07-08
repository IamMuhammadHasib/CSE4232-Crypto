#include <bits/stdc++.h>
using namespace std;

int main()
{
    ifstream fin("cipher.txt");
    ofstream fout("out.txt");
    string s;
    getline(fin, s);
    cout << s<<endl;

    for (int i = 0; i < 10; i++)
    {
        string ans = "";
        int width = 7;
        // cin>>width;

        int len = s.size();
        int row = (len / width) + (len % width > 0), col = 0;
        // cout << len << " " << row << endl;

        char mat[100][100];
        memset(mat, 0, sizeof(mat));

        int k = 0, extra = len % width;
        int cnt = 0;
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < row - cnt; j++)
            {
                mat[i][j] = s[k++];
                // cout<<"hello";
            }
            extra--;
            if (extra <= 0)
                cnt = 1;
            // cout<<endl;
        }

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < width; j++)
            {
                ans += mat[i][j];
            }
        }
        cout<<s.size()<<" "<<ans.size()<<endl;
        s=ans;
    }
    fout << s;
    cout << s;
}