class Solution {
    public int maxProfit(int[] prices) {
        //o(n2)
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
               if(prices[j]>prices[i]){
                   maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
               }
                   
            }
        }
        return maxProfit;
    }
}





class Solution {
    public int maxProfit(int[] prices) {
        //o(n)
        int maxProfit=0;
      
       int max[]=new int[prices.length];
          max[prices.length-1]=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            max[i]=Math.max(prices[i],max[i+1]);
        }
        
        for(int i=0;i<prices.length;i++){
            if(max[i]>prices[i]){
                maxProfit=Math.max(max[i]-prices[i],maxProfit);
            }
        }
        return maxProfit;
    }
}