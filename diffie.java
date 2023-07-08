class diffie {

    public static void main(String[] args) {
        long P, G, x, a, y, b, ka, kb;

        P = 23;
        System.out.println("P:" + P);

        G = 9;
        System.out.println("G:" + G);

        a = 4;
        System.out.println("Private key of Alice:" + a);

        x = ((long) Math.pow(G, a)) % P;

        b = 3;
        System.out.println("Private key of Bob:" + b);

        y = ((long) Math.pow(G, b)) % P;

        ka = ((long) Math.pow(y, a)) % P;
        kb = ((long) Math.pow(x, b)) % P;

        System.out.println("Secret key of Alice:" + ka);
        System.out.println("Secret key of Bob:" + kb);
    }
}
