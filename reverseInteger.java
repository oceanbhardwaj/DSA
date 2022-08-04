class Solution {
    public int reverse(int x) {
        boolean neg=false;
        int dd=x;
        if(x<0)
        {neg=true;
         x=-1*x;}
        long max=(long)Math.pow(2,31);
        long min=-1*max;
       // System.out.println(max);
        // System.out.println(min);
       
        long ans=0;
        while(x>0){
            int d=x%10;
            ans=ans*10+d;
            x=x/10;
        }
         if(ans<=min || ans>max-1)
            return 0;
        if(!neg)
            return (int)ans;
        return -1*(int)ans;
    }
}