import java.math.*;
import java.util.*;

public class MR
{

    public static void main(String [] args)
    {
        BigInteger p;
        p =  BigInteger.valueOf(1031);

        String ans = millerRobin(p);
        System.out.println(ans);

    }

    public static String millerRobin(BigInteger p)
    {
        int iteration = 20;
        BigInteger m, a, ans;
        m = p.subtract(BigInteger.ONE);
        while(!m.mod(BigInteger.TWO).equals(BigInteger.ZERO))
        {
            m = m.divide(BigInteger.TWO);
        }


        for(int i=0; i<iteration; i++)
        {
            a = new BigInteger(p.bitLength()-1, new Random());
            a = a.add(BigInteger.TWO);
            System.out.println(a+" "+m);

            ans = a.modPow(m, p);

            if(ans.equals(BigInteger.ONE) || ans.equals(p.subtract(BigInteger.ONE)))
            {
                System.out.println("...");
                // continue;
            }

            // while()

        }





        return "YES";
    }
}