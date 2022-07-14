class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        return Math.max(getMaxAmt(nums,0,nums.length-2),getMaxAmt(nums,1,nums.length-1));
    }
    public int getMaxAmt(int nums[],int start,int end){
        if(start>end)
            return 0;
        int take=nums[start]+getMaxAmt(nums,start+2,end);
        int dontTake=getMaxAmt(nums,start+1,end);
        return Math.max(take,dontTake);
    }
}
---------------------------------------------------------------
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int dp[]=new int[nums.length];
          int dp1[]=new int[nums.length];
        Arrays.fill(dp,-1);
          Arrays.fill(dp1,-1);
        return Math.max(getMaxAmt(nums,0,nums.length-2,dp),getMaxAmt(nums,1,nums.length-1,dp1));
    }
    public int getMaxAmt(int nums[],int start,int end,int dp[]){
        if(start>end)
            return 0;
        if(dp[start]!=-1)
            return dp[start];
        int take=nums[start]+getMaxAmt(nums,start+2,end,dp);
        int dontTake=getMaxAmt(nums,start+1,end,dp);
        dp[start]= Math.max(take,dontTake);
        return dp[start];
    }
}
-----------------------------------------------------------------
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
       int dp1[]=new int[nums.length];
        int dp2[]=new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
       return Math.max(getMax(dp1,nums,0,nums.length-2),getMax(dp2,nums,1,nums.length-1));
    }
    public int getMax(int dp[],int nums[],int start,int end){
        if(start==end)
            return nums[start];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[end];
    }
}