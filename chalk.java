class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n=chalk.length;
        int i=0;
        long sum=0;
       
        for(int j=0;j<chalk.length;j++)
        {
            sum=sum+chalk[j];
        }
       int K=(int)((long)k%sum);
        while(i<n )
        {
            
            if(K<chalk[i])
                return i;
            K=K-chalk[i];
           
            i++;
           
        }
        return i;
        
    }
}