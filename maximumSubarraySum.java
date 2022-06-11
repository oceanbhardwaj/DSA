class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int count=nums[i];
            sum=Math.max(sum,count);
            for(int j=i+1;j<nums.length;j++){
                count+=nums[j];
                   sum=Math.max(sum,count);
            }
        }
        return sum;
    }
}

--------------------------------------------
class Solution {
    public int maxSubArray(int[] nums) {
        int meh=nums[0];
        int msf=nums[0];
        for(int i=1;i<nums.length;i++){
            meh+=nums[i];
            if(nums[i]>meh)
                meh=nums[i];
            msf=Math.max(msf,meh);
        }
        return msf;
    }
}