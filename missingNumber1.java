class Solution {
    public int missingNumber(int[] nums) {
        int n=10000;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        for(int i=0;i<=10000;i++ )
        {
            if(!h.contains(i))
                return i;
        }
        return -1;
    }
}
------------------------------------------------------
class Solution {
    public int missingNumber(int[] nums) {
        int sum=nums.length*(nums.length+1)/2;
        int s=0;
        for(int i:nums)
            s+=i;
        
        return sum-s;
    }
}