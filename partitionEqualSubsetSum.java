class Solution {
    public boolean canPartition(int[] nums) {
        //Edge case
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        
        if(sum%2!=0)
           return false;
        
       return callSubsetSum(nums,nums.length,sum/2);
    }
    public boolean callSubsetSum(int nums[],int n,int sum){
        boolean dp[][]=new boolean[nums.length+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
                 if(i>0  && nums[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }else if(i>0 && nums[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[nums.length][sum];
    }
}