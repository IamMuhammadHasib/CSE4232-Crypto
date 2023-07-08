public class Run {
    public static void main(String[] args) {
        int p = 13;
        int iterate = 20;

        MillerRobin mrTest = new MillerRobin(iterate);
        System.out.println(p+" prime? "+mrTest.isPrime(p));
    }
}
