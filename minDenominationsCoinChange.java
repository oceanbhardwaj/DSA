class Solution {
    public int coinChange(int[] coins, int amount) {
       int d= (int)helper(coins,amount,0);
        if(d==Integer.MAX_VALUE)
            return -1;
        else
            return d;
    }
    public long helper(int coins[],int amount,int index){
        if(index>=coins.length && amount>0)
            return (long)Integer.MAX_VALUE;
        if(amount==0)
            return (long)0;
        if(amount<0)
            return (long)Integer.MAX_VALUE;
        return Math.min(1+helper(coins,amount-coins[index],index),helper(coins,amount,index+1));
    }
}
--------------------------------------------------------------------------
class Solution {
    public int coinChange(int[] coins, int amount) {
        long dp[][]=new long[coins.length+1][amount+1];
        for(int i=0;i<coins.length;i++)
            Arrays.fill(dp[i],-1);
       int d= (int)helper(coins,amount,0,dp);
        if(d==Integer.MAX_VALUE)
            return -1;
        else
            return d;
    }
    public long helper(int coins[],int amount,int index,long dp[][]){
        if(index>=coins.length && amount>0)
            return (long)Integer.MAX_VALUE;
        if(amount==0)
            return (long)0;
        if(amount<0)
            return (long)Integer.MAX_VALUE;
        if(dp[index][amount]!=-1)
            return dp[index][amount];
        return dp[index][amount]=Math.min(1+helper(coins,amount-coins[index],index,dp),helper(coins,amount,index+1,dp));
    }
}
-----------------------------------------------------------------------------
class Solution {
    public int coinChange(int[] coins, int amount) {
        long dp[][]=new long[coins.length+1][amount+1];
        for(int i=0;i<=amount;i++){
            dp[0][i]=Integer.MAX_VALUE;
            
        }
        for(int i=0;i<=coins.length;i++){
            dp[i][0]=0;
            
}
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]<=j)
                {
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }else
                    dp[i][j]=dp[i-1][j];
            }
        }
        long d= dp[coins.length][amount]==Integer.MAX_VALUE?-1:dp[coins.length][amount];
        return (int)d;
    }
}