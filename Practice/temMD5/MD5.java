import java.util.Scanner;
import java.io.File;
import java.io.*;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;

public class MD5 {
    public static void main(String [] args) throws Exception
    {
        File i = new File("in.txt");
        FileWriter writer = new FileWriter("out.txt");

        Scanner fin = new Scanner(i);

        String msg = "";
        while(fin.hasNextLine())
        {
            msg += fin.nextLine() + " ";
        }

        System.out.println(hashMD5(msg));

        writer.write(hashMD5(msg));
        writer.close();
    }

    public static String hashMD5(String msg)
    {
        String ans = "";
        MessageDigest md;

        try
        {
            md = MessageDigest.getInstance("SHA-512");
            byte[] byteValue = md.digest(msg.getBytes());

            BigInteger num = new BigInteger(1, byteValue);
            ans = num.toString(16);

            while(ans.length()<130)
            {
                ans = '0' + ans;
            }
            // return ans;

        } catch(Exception e)
        {

        }
        return ans;
    }
}
