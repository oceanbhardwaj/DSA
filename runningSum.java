class Solution {
    public int[] runningSum(int[] nums) {
      /*  int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            arr[i]=sum;
        }
        return arr;*/
        
       // method-2
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}