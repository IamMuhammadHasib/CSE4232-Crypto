public class Run {
    public static void main(String[] args) {
        int p = 7;
        int iterate = 20;

        Lehman lehmanTest = new Lehman(iterate);

        System.out.println(p + " prime? " + lehmanTest.isPrime(p));
    }

}