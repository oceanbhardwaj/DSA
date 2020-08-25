class Solution {
    public int maximumSum(int[] arr) {
        if(arr.length==1)
            return arr[0];
        //forward kdanes;
        int meh=0;
        int msf=Integer.MIN_VALUE;
        int n=arr.length;
        int fwd[]=new int[n];
        int bwd[]=new int[n];
        for(int i=0;i<n;i++)
        {
            meh=Math.max(arr[i]+meh,arr[i]);
            msf=Math.max(msf,meh);
            fwd[i]=meh;
        }
        
        meh=0;
        msf=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            meh=Math.max(arr[i]+meh,arr[i]);
            msf=Math.max(msf,meh);
            bwd[i]=meh;
        }
        for(int i=1;i<n-1;i++)
        {
            msf=Math.max(msf,fwd[i-1]+bwd[i+1]);
        }
        return msf;
    }
}