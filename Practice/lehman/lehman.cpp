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

string lehman(int p)
{
    for (int i = 0; i < iteration; i++)
    {
        int a = ((rand() / RAND_MAX) * (p - 3)) + 2;

        int ans = modpow(a, (p - 1) / 2, p);
        if (ans != 1 && ans != p - 1)
        {
            return "NO";
        }
    }
    return "YES";
}

int main()
{
    int p;
    cin >> p;

    cout << p << " is prime? " << lehman(p) << endl;
}