class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int arr[]=new int[cuts.length+2];
        int dp[][]=new int[cuts.length+2][cuts.length+2];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        arr[0]=0;
        arr[arr.length-1]=n;
        for(int i=1;i<arr.length-1;i++){
            arr[i]=cuts[i-1];
        }
        return helper(arr,1,arr.length-2,dp);
    }
    public int helper(int arr[],int i,int j,int dp[][]){
        if(i>j)
            return 0;
        int mini=Integer.MAX_VALUE;
        if(dp[i][j]!=-1)
            return dp[i][j];
        for(int ind=i;ind<=j;ind++){
            int cost=arr[j+1]-arr[i-1]+helper(arr,i,ind-1,dp)+helper(arr,ind+1,j,dp);
            mini=Math.min(mini,cost);
        }
        return dp[i][j]= mini;
    }
}