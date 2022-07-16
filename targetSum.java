class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        count=0;
         countAllTargets(nums,target,0,0);
             return count;
    }
    public void countAllTargets(int nums[],int target,int start,int sum){
        if(start==nums.length && sum==target )
        {
            count++;
            return;
        }
        if(start>=nums.length)
            return;
        //plus
        countAllTargets(nums,target,start+1,sum+nums[start]);
        countAllTargets(nums,target,start+1,sum-nums[start]);
    }
}
----------------------------------------------------------------------------
class Solution {
 
    public int findTargetSumWays(int[] nums, int target) {
    
        return  countAllTargets(nums,target,0,0);
           
    }
    public int countAllTargets(int nums[],int target,int start,int sum){
        if(start==nums.length && sum==target )
        {
            return 1;
        }
        if(start>=nums.length)
            return 0;
     
      int plus= countAllTargets(nums,target,start+1,sum+nums[start]);
      int minus= countAllTargets(nums,target,start+1,sum-nums[start]);
        return plus+minus;
    }
}
--------------------------------------------------------------------------
class Solution {
 
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String,Integer> h=new HashMap<>();
        return  countAllTargets(nums,target,0,0,h);
           
    }
    public int countAllTargets(int nums[],int target,int start,int sum,HashMap<String,Integer> h){
        if(start==nums.length && sum==target )
        {
            return 1;
        }
        if(start>=nums.length)
            return 0;
      String ans=start+"leet"+sum;
     if(h.containsKey(ans))
         return h.get(ans);
      int plus= countAllTargets(nums,target,start+1,sum+nums[start],h);
      int minus= countAllTargets(nums,target,start+1,sum-nums[start],h);
          h.put(ans,plus+minus);
        return h.get(ans);
    }
}
-----------------------------------------------------------------------------
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        //using subset sum 
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int s=(target+sum)/2;
        if(Math.abs(target)>sum || (target+sum)%2!=0)
            return 0;
        //count of subset sum with sum=s
        int dp[][]=new int[nums.length+1][s+1];
       
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<=s;j++){
                if(i==0)
                    dp[i][j]=0;
                 dp[0][0]=1;
                   
                 if(i>0 && nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j-nums[i-1]]+dp[i-1][j];
                }else if(i>0 && nums[i-1]>j)
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[nums.length][s];
    }
}