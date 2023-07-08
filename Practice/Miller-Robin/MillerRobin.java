public class MillerRobin {
    int iterate;
    ModPow modPow;

    public MillerRobin(int iterate) {
        this.iterate = iterate;
        modPow = new ModPow();
    }

    public boolean isPrime(int p) {
        int m = p - 1;
        while (m % 2 == 0)
            m /= 2;

        for(int i=0; i<iterate; i++)
        {
            int a = (int)(Math.random()*(p-3)) + 2;
            int ans = modPow.modPow(a, m, p);
            if(ans == 1 || ans == p-1) continue;

            while(m!=p-1)
            {
                ans = (ans*ans) % p;
                m *= 2;

                if(ans == 1) return false;
                if(ans == p - 1) break;
            }
            if(m==p-1) return false;
        }

        return true;
    }

}
