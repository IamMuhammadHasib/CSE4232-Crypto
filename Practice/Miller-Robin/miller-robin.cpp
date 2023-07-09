#include <bits/stdc++.h>
#define ll long long
#define ull unsigned long long
using namespace std;

int iteration = 20;

int modpow(int a, int n, int p)
{
    if (n == 1)
        return a;

    int res = modpow(a, n / 2, p);
    res = (res * res) % p;

    if (n % 2 == 1)
        res = (res * a) % p;
    return res;
}

string mr(int p)
{
    int m = p - 1;
    while (m % 2 == 0)
        m /= 2;

    for (int i = 0; i < iteration; i++)
    {
        int a = ((rand() / RAND_MAX) * (p - 3)) + 2;

        int ans = modpow(a, m, p);
        if (ans == 1 || ans == p - 1)
            continue;

        if (m == p - 1)
            return "NO";
        while (m != p - 1)
        {
            ans = (ans * ans) % p;
            m *= 2;

            if (ans == 1)
                return "NO";
            if (ans == p - 1)
                break;
        }
    }
    return "YES";
}

int main()
{
    int p = 1031;
    // cin>>p;

    cout << p << " is prime? " << mr(p) << endl;
}