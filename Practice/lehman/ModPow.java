public class ModPow {
    public int modPow(int a, int n, int p) {
        if (n == 1)
            return a;

        int res = modPow(a, n / 2, p);
        res = (res * res) % p;
        if (n % 2 == 1)
            res = (res * a) % p;

        return res;
    }
}
