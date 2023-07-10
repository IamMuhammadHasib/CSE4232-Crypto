public class DH {
    public static void main(String[] args) {
        // primitive root q, prime p
        int p = 1031;
        int aq = 2;

        int xa = 1064, xb = 570; // private key

        int ya = modPow(aq, xa, p);
        int yb = modPow(aq, xb, p);

        // public key
        int k1 = modPow(ya, xa, p);
        int k2 = modPow(yb, xb, p);

        System.out.println(k1+" "+k2);

    }

    public static int modPow(int aq, int x, int p) {
        if (x == 0)
            return 1;
        int res = modPow(aq, x / 2, p);
        res = (res * res) % p;

        if (x % 2 == 1)
            res = (res * aq) % p;
        return res;
    }
}
