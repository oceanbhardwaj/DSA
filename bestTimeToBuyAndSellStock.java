class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
            max=Math.max(prices[j]-prices[i],max);
            }
        }
        return max;
    }
}
----------------------------------------------------------
class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int ans[]=new int[prices.length];
        ans[prices.length-1]=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            ans[i]=Math.max(ans[i+1],prices[i]);
        }
        for(int i=0;i<prices.length-1;i++){
           
            max=Math.max(ans[i+1]-prices[i],max);
            
        }
        return max;
    }
}