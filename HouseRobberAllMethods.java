class Solution {
    public int rob(int[] nums) {
        //recusrion
        if(nums.length==0)return 0;
        if(nums.length==1)
            return nums[0];
        return Math.max(getMaxAmt(nums,0),getMaxAmt(nums,1));
    }
    public int getMaxAmt(int nums[],int index){
        if(index>=nums.length)
            return 0;
        //take 
        int takeIt=nums[index]+getMaxAmt(nums,index+2);
       
        //not take
        int notTakeIt=getMaxAmt(nums,index+1);
        
        return Math.max(takeIt,notTakeIt);
    }
}
-------------------------------------------------------------------------------------
class Solution {
    public int rob(int[] nums) {
        //memoization
        if(nums.length==0)return 0;
        if(nums.length==1)
            return nums[0];
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return getMaxAmt(nums,0,dp);
    }
    public int getMaxAmt(int nums[],int index,int dp[]){
        if(index>=nums.length)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        //take 
        int takeIt=nums[index]+getMaxAmt(nums,index+2,dp);
       
        //not take
        int notTakeIt=getMaxAmt(nums,index+1,dp);
        
        dp[index]= Math.max(takeIt,notTakeIt);
        return dp[index];
    }
}
-------------------------------------------------------------------------------------
class Solution {
    public int rob(int[] nums) {
        //dp
        if(nums.length==1)
            return nums[0];
        int dp[]=new int[nums.length+1];
       
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
            //nums[i]+dp[i-2]==currrent +before adjacent(take it)
            //dp[i-1]---previous (not take it)
            
            
        }
        return dp[nums.length-1];
    }
}

