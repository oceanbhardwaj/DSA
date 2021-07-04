class Solution {
    public int countGoodNumbers(long n) {
        long mod=(long)1e9+7;
        if(n==1)
            return 5;
        long ceil=0;
        long m=0;
        if(n%2==0)
        {m=n/2;
         long g=((long)pow(5,n/2,mod))%mod*((long)pow(4,n/2,mod))%mod;
        return (int)(g%mod);}
        else
        {
           ceil=n/2+1;
            System.out.println("ceil"+ceil);
            long g1=((long)pow(5,ceil,mod))%mod*((long)pow(4,n/2,mod))%mod;
            return (int)(g1%mod);
        }
         //return -1;   
            
    }
    public static long pow(long x, long y,long mod)
    {
        long temp;
        if (y == 0)
            return 1;
        temp = pow(x, y / 2,mod);
  
        if (y % 2 == 0)
            return ((temp%mod) * (temp%mod))%mod;
        else {
            if (y > 0)
                return ((x%mod) * (temp%mod) * (temp%mod))%mod;
            else
                return ((temp%mod )* (temp%mod))%mod / (x%mod);
        }
    }
    
}