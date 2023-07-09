import java.math.BigInteger;
import java.util.Scanner;

public class RSAKaw {
    public static void main(String[] args) {
        BigInteger p, q, n, e, d, co, msg;
        // Take two largest prime
        Scanner scanner = new Scanner(System.in);

        msg = new BigInteger("123456789123456789");


        scanner.close();

        System.out.println(msg);

        // initialize big prime
        p=new BigInteger("3737373737373737373737373737373737373737373737373737373737373737373737373743434343434343434343434343434343434343434343434343434343434343434343434343434343434343");
        q=new BigInteger("4001160567659443111330503282468707739798434620548604221627193504975920082305041881662090135042017773659662575788983801725920353518125641884669217468110276929673");

        System.out.println();

        n = p.multiply(q);
        co = p.subtract(BigInteger.valueOf(1)).multiply(q.subtract(BigInteger.ONE));

        // choose value e such e and (p-1)*(q-1) is relatively prime
        e = BigInteger.TWO;

        while(true){
            if(co.gcd(e).equals(BigInteger.ONE)) break;
            e=e.add(BigInteger.ONE);
        }

        System.out.println("co");
        System.out.println(co);
        System.out.println();

        //e = BigInteger.valueOf(79); // for manual teting
        // now calculate d = e^-1 mod (p-1)(q-1)
        d = e.modInverse(co);
        System.out.println(d);

        // System.out.println("message= "+msg+", n="+n+", e="+e+", d="+d+", co="+co);
        System.out.println();

        BigInteger c = msg.modPow(e,n);
        System.out.println("Encrypted message is : " + c);

        BigInteger decrypted = (c.modPow(d,n));
        System.out.println("Decrypted message is : "+ decrypted);
    }
}