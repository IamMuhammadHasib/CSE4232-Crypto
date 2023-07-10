import java.math.BigInteger;
import java.util.Random;

public class RSA{
    public static void main(String [] args)
    {
        BigInteger p, q, n, e, d, tem, msg;

        msg = new BigInteger("123456789123456789");
        p=BigInteger.probablePrime(1000, new Random());
        q=BigInteger.probablePrime(1000, new Random());
        System.out.println(p);
        System.out.println();
        System.out.println(q);
        System.out.println();

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