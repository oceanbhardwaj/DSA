class Solution {
    public boolean isPowerOfTwo(int n) {
      /* // method 1-->count set bits =1
        int count=0;
        while(n>0)
        {
            n=n&(n-1);
            count++;
        }
        return count==1?true:false;*/

       //method 2----->Recursion
        /*if(n==1)
            return true;
        if(n==0)
            return false;
        return n%2==0 && isPowerOfTwo(n/2);*/
        
        //method 3------->  
        if(n<=0)
            return false;
        return (n&(n-1))==0?true:false;
        
        
    }
}