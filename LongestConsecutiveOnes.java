 public static int maxConsecutiveOnes(int N) {
        int max=0;
        int count=0;
         for(int i=0;i<32;i++)
        {
            if(((N>>i)&1)!=0)
            {
                count++;
                max=Math.max(count,max);
            }
            else
            {
                //max=Math.max(count,max);
                count=0;
            }
        }
        return max;
    }
}
/////////////////////////////////////////////
int count=0;
        while(N!=0)
        {
            N=(N&(N<<1));
            count++;
        }
        return count;


