class Solution {
    public boolean isPowerOfFour(int n) {
       
       // return (Math.log(n)/Math.log(4))%1==0;
        int count=0;
        if(n>0 && (n&(n-1))==0)
        {   
            while(n>1)
            {
             count++;
                n=n>>1;
            }
            if(count%2==0)
                return true;
        }
        return false;
    }
}