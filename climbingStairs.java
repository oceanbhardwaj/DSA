class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return call(n,dp);
    }
    public int call(int n,int dp[]){
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]= call(n-1,dp)+call(n-2,dp);
    }
}
------------------------------------------------------------
class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return call(0,dp,n);
    }
    public int call(int start,int dp[],int n){
        if(start==n)
            return 1;
        if(start>n)
            return 0;
        if(dp[start]!=-1)
            return dp[start];
        return dp[start]= call(start+1,dp,n)+call(start+2,dp,n);
    }
}