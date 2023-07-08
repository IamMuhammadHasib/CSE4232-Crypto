public class Lehman {
    int iterate;
    ModPow modPow;

    public Lehman(int iterate) {
        this.iterate = iterate;
        modPow = new ModPow();
    }

    public boolean isPrime(int p)
    {
        if(p==2 || p==3) return true;

        for(int i=0; i<iterate; i++)
        {
            int a = (int)(Math.random()*(p-3)) +2;

            int ans = modPow.modPow(a, (p-1)/2, p);
            if(ans != 1 && ans != p-1)
            {
                System.out.println("Iteration: "+i);
                return false;
            }
        }
        return true;
    }
}
