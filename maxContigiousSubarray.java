class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=nums[i];
            max=Math.max(max,sum);
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
                max=Math.max(max,sum);
                
            }
        }
        return max;
    }
}
----------------------------------------------------------
class Solution {
    public int maxSubArray(int[] nums) {
        int msf=nums[0];
        int meh=nums[0];
        for(int i=1;i<nums.length;i++){
            meh=meh+nums[i];
            if(nums[i]>meh)
                meh=nums[i];
            
            msf=Math.max(msf,meh);
        }
        return msf;
    }
}