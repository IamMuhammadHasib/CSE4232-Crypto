#include <bits/stdc++.h>
#define ll long long
#define ull unsigned long long
using namespace std;

ull iteration = 20;

ull modpow(ull a, ull n, ull p)
{
    if (n == 1)
        return a;

    ull res = modpow(a, n / 2, p);
    res = (res * res) % p;

    if (n % 2 == 1)
        res = (res * a) % p;
    return res;
}

string lehman(ull p)
{
    for (ull i = 0; i < iteration; i++)
    {
        ull a = ((rand() / RAND_MAX) * (p - 3)) + 2;

        // for JAVA
        // a = new BigInteger(p.bitLength()-1, new Random())
        ull ans = modpow(a, (p - 1) / 2, p);
        if (ans != 1 && ans != p - 1)
        {
            return "NO";
        }
    }
    return "YES";
}

int main()
{
    ull p;
    cin >> p;

    cout << p << " is prime? " << lehman(p) << endl;
}