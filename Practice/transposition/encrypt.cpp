#include <bits/stdc++.h>
using namespace std;

int main()
{
    ifstream fin("in.txt");
    ofstream fout("cipher.txt");

    string s;
    getline(fin, s);
    cout << s << endl;

    string ans = "";
    for (int i = 0; i < 10; i++)
    {
        int width = 7;
        // cin>>width;

        int len = s.size();
        int row = 0, col = 0;

        char mat[100][100];
        memset(mat, 0, sizeof(mat));
        for (int i = 0; i < len; i++)
        {
            mat[row][col++] = s[i];
            if (col >= width)
            {
                row++;
                col = 0;
            }
        }

        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j <= row; j++)
            {
                if (mat[j][i] == 0)
                    continue;
                ans += mat[j][i];
            }
        }
        s=ans;
        ans="";
    }
    fout << s;
    cout << s;
}