class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        int one=0;
       for(int i=0;i<32;i++){
           one=0;
           for(int j=0;j<nums.length;j++){
               if((nums[j] & (1<<i))!=0)
                   one++;
           }
           one=one%3;
           ans=ans|(one<<i);
       }
        return ans;
    }
}