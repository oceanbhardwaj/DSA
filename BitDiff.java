class Solution{
    static int countBits(int N, long A[])
    {
        int mod=(int)(1e9+7);
        int sum=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                sum=sum+check(A[i],A[j]);
                sum=sum%(mod);
            }
        }
        return sum;
        
    }
    
    public static  int check(long x,long y)
    {
        int count=0;
        // for(int i=0;i<32;i++)
        // {
           
        //     if(((((x>>i)&1)!=0) && (((y>>i)&1)==0)) || 
        //     ((((x>>i)&1)==0) && (((y>>i)&1)!=0)))
        //     count++;
            
        // }
        long z=x^y;
        while(z!=0)
        {
            z=z&(z-1);
            count++;
        }
        return count;
        
    }
}
////////////////////////////////////////////////
class Solution{
    static int countBits(int N, long A[])
    {
        int mod=(int)(1e9+7);
        long sum=0;
        for(int i=0;i<32;i++)
        { long set=0;
        long unset=0;
            for(int j=0;j<N;j++)
            {
                if(((A[j]>>i)&1)!=0)
                set++;
                else
                unset++;
            }
            //unset=A.length-set;
            long d=set*unset*2;
        //d=d%mod;
        sum=sum+d;
        sum=sum%mod;
        }
        
        return (int)(sum%mod);
        
    }
    
   
     
}