import java.io.File;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

public class SHA {
    public static void main(String[] args) throws Exception {
        File f = new File("output.txt");

        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();

        PrintWriter fout = new PrintWriter(f);
        fout.println("Hash:\n" + getSHA(msg));
        fout.close();

    }

    public static String getSHA(String msg) {
        String ans = "";
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-1");
            byte[] byteValue = md.digest(msg.getBytes());

            BigInteger num = new BigInteger(1, byteValue);

            ans = num.toString(16);
            while (ans.length() < 64)
                ans = '0' + ans;
            return ans;

        } catch (Exception e) {
            // TODO: handle exception
        }

        return ans;
    }
}
