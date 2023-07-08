public class ModPow {
    public int modPow(int a, int m, int p) {
        if (m == 1)
            return a;

        int res = modPow(a, m / 2, p);
        res = (res * res) % p;

        if (m % 2 == 1)
            res = (res * a) % p;

        return res;
    }
}
