class Solution {
    public int maxProfit(int[] prices) {
        HashMap<String,Integer> h=new HashMap<>();
        return maxPr(prices,0,true,2,h);
    }
    public int maxPr(int prices[],int i,boolean buy,int k,HashMap<String,Integer> h){
        if(i>=prices.length ||k<=0)
            return 0;
        int buyPr=0;
        int sellPr=0;
        String ans=i+"leet"+k+"code"+buy;
        if(h.containsKey(ans))
            return h.get(ans);
        if(buy){
            int take=-prices[i]+maxPr(prices,i+1,!buy,k,h);
            int donottake=maxPr(prices,i+1,buy,k,h);
            buyPr=Math.max(take,donottake);
        }else{
            int sell=prices[i]+maxPr(prices,i+1,!buy,k-1,h);
            int donotsell=maxPr(prices,i+1,buy,k,h);
            sellPr=Math.max(sell,donotsell);
        }
        h.put(ans, Math.max(buyPr,sellPr));
        return h.get(ans);
    }
}
-------------------------------------------------------
class Solution {
    public int maxProfit(int[] prices) {
      int dp[][][]=new int[prices.length][2][2];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return maxPr(prices,0,0,1,dp);
    }
    public int maxPr(int prices[],int i,int buy,int k,int dp[][][]){
        if(i>=prices.length ||k<0)
            return 0;
        int buyPr=0;
        int sellPr=0;
       if(dp[i][buy][k]!=-1)
           return dp[i][buy][k];
        if(buy==0){
            int take=-prices[i]+maxPr(prices,i+1,1,k,dp);
            int donottake=maxPr(prices,i+1,0,k,dp);
            buyPr=Math.max(take,donottake);
        }else{
            int sell=prices[i]+maxPr(prices,i+1,0,k-1,dp);
            int donotsell=maxPr(prices,i+1,1,k,dp);
            sellPr=Math.max(sell,donotsell);
        }
     return dp[i][buy][k]=Math.max(buyPr,sellPr);
      
    }
}