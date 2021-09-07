class Solution {
    public int maxProfit(int[] prices) {
        int max[]=new int[prices.length];
        int n=prices.length;
        max[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--)
        {
           max[i]=Math.max(max[i+1],prices[i]);
        }
        int ans=0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(max[i+1]>prices[i])
         ans=Math.max(max[i+1]-prices[i],ans);
        }
        return ans;
    }
}