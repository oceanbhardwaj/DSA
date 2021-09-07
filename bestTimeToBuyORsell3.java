class Solution {
    public int maxProfit(int[] prices) {
        return dfs(prices,0,0,2,new HashMap<String,Integer>());
    }
    public int dfs(int prices[],int i,int buyOrSell,int k,HashMap<String,Integer> h)
    {
        if(i>=prices.length || k==0)
            return 0;
        String str=i+"code"+buyOrSell+"leet"+k;
        if(h.containsKey(str))
            return h.get(str);
        int buy=0;
        int sell=0;
        if(buyOrSell==0) //buy
        {
            int takeIt=-prices[i]+dfs(prices,i+1,1,k,h);
            int notTakeIt=dfs(prices,i+1,0,k,h);
            buy=Math.max(takeIt,notTakeIt);
        }
        else
        {
            int sellIt=prices[i]+dfs(prices,i+1,0,k-1,h);
                int notSellIt=dfs(prices,i+1,1,k,h);
            sell=Math.max(sellIt,notSellIt);
        }
        h.put(str,Math.max(buy,sell));
        return Math.max(buy,sell);
    }
}
//////////////////////////////////////////////
class Solution {
    public int maxProfit(int[] prices) {
        int dp[][][]=new int[prices.length][2][3];
        for(int i=0;i<dp.length;i++)
        {

        for(int j=0;j<dp[0].length;j++)
        {

        for(int k=0;k<dp[0][0].length;k++)
        {
        dp[i][j][k]=-1;
        }
        }
        }
        return dfs(prices,0,0,2,dp);
    }
    public int dfs(int prices[],int i,int buyOrSell,int k,int dp[][][])
    {
        if(i>=prices.length || k<=0)
            return 0;
        // String str=i+"code"+buyOrSell+"leet"+k;
        // if(h.containsKey(str))
        //     return h.get(str);
        if(dp[i][buyOrSell][k]!=-1)
            return dp[i][buyOrSell][k];
        int buy=0;
        int sell=0;
        if(buyOrSell==0) //buy
        {
            int takeIt=-prices[i]+dfs(prices,i+1,1,k,dp);
            int notTakeIt=dfs(prices,i+1,0,k,dp);
            buy=Math.max(takeIt,notTakeIt);
        }
        else
        {
            int sellIt=prices[i]+dfs(prices,i+1,0,k-1,dp);
                int notSellIt=dfs(prices,i+1,1,k,dp);
            sell=Math.max(sellIt,notSellIt);
        }
        //h.put(str,Math.max(buy,sell));
        dp[i][buyOrSell][k]=Math.max(buy,sell);
        return Math.max(buy,sell);
    }
}