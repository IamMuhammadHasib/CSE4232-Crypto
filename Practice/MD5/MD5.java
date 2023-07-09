import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class MD5 {
    public static void main(String[] args) throws Exception {
        File f = new File("input.txt");
        Scanner sc = new Scanner(f);

        String msg = "";
        while (sc.hasNextLine()) {
            msg += sc.nextLine() + " ";
        }

        sc.close();
        System.out.println(msg);
        System.out.println("Hash: ");
        System.out.println(getMD5(msg));
        System.out.println();
    }

    public static String getMD5(String msg) {
        String ans = "";
        MessageDigest md;

        try {
            md = MessageDigest.getInstance("md5");
            byte[] byteValue = md.digest(msg.getBytes());

            BigInteger num = new BigInteger(1, byteValue);

            ans = num.toString(16);

            while (ans.length() < 32)
                ans = '0' + ans;

            return ans;

        } catch (Exception e) {
            // TODO: handle exception
        }
        return ans;

    }
}
