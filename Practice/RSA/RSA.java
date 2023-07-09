import java.math.BigInteger;

public class RSA{
    public static void main(String [] args)
    {
        BigInteger p, q, n, e, d, tem, msg;

        msg = new BigInteger("123456789123456789");
        p=new BigInteger("3737373737373737373737373737373737373737373737373737373737373737373737373743434343434343434343434343434343434343434343434343434343434343434343434343434343434343");
        q=new BigInteger("4001160567659443111330503282468707739798434620548604221627193504975920082305041881662090135042017773659662575788983801725920353518125641884669217468110276929673");

        n = p.multiply(q);
        tem = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.valueOf(1)));

        e = BigInteger.TWO;
        while(true)
        {
            if(tem.gcd(e).equals(BigInteger.ONE)) break;
            e = e.add(BigInteger.valueOf(1));
        }

        d = e.modInverse(tem);

        BigInteger cipher =msg.modPow(e, n);

        System.out.println("Encryption: "+ cipher);
        System.out.println();
        System.out.println("Decryption: "+cipher.modPow(d, n));

    }
}