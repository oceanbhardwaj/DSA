class Solution {
    public double myPow(double x, int n) {
       
        
        boolean isNeg=false;
         long nn=(long)n;
        if(nn<0)
        {
            nn=nn*-1;
           
            isNeg=true;
        }
       
        double ans=1.0;
        while(nn>0)
        {
        if(nn%2==0)
        {
            x=x*x;
            nn=nn/2;
        }
        else
        {
            ans=ans*x;
            nn=nn-1;
        }
        }
        System.out.println("ans"+ans);
        if(isNeg)
            ans=1/ans;
        return ans;
        
        
    }
}
//////////////////////////////////////////////////
class Solution {
    public double myPow(double x, int n) {
        if(n<0)
        {
            x=1/x;
            n=-1*n;
        }
        return pow(x,n);
        
    }
    public double pow(double x,int n)
    {
        if(n==0)
            return 1;
        if(n==1)
            return x;
        if(n%2==0)
        {
            return pow(x*x,n/2);
        }
        return x*pow(x*x,n/2);
    }
}