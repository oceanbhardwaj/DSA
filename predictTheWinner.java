class Solution {
    public boolean PredictTheWinner(int[] nums) {
        if(nums.length==1)
            return true;
       
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total=total+nums[i];
        }
        int ones=ok(nums,0,nums.length-1,0);
        int two=total-ones;
        return (ones>=two);
        
    }
    static int ok(int nums[],int i,int j,int chances)
    {
        if(i>j)
            return 0;
        if(chances==0)
            return Math.max(nums[i]+ok(nums,i+1,j,1),nums[j]+ok(nums,i,j-1,1));
        else
            return Math.min(ok(nums,i+1,j,0),ok(nums,i,j-1,0));
    }
}