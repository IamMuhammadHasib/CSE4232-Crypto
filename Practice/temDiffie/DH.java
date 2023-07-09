public class DH{
    public static int modPow(int a, int n, int p)
    {
        if(n == 1) return a;

        int res = modPow(a, n/2, p);
        res = (res*res)%p;

        if(n%2==1) res = (res*a)%p;

        return res;

    }
    public static void main(String [] args)
    {
        // primitive
        int p = 223;
        int aq = 9;

        int xa = 512, xb = 123;

        int ya = modPow(aq, xa, p);
        int yb = modPow(aq, xb, p);

        // public
        int ka = modPow(aq, ya, p);
        int kb = modPow(aq, yb, p);

        System.out.println(ka+" "+kb);
    }
}