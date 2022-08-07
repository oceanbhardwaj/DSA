class Solution {
    public int[] singleNumber(int[] nums) {
        int res[]=new int[2];
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int xorSetBit=xor & (-xor);
        for(int i=0;i<nums.length;i++){
            if((xorSetBit & nums [i]) !=0)
                res[0]=res[0]^nums[i];
            else
                res[1]=res[1]^nums[i];
        }
        return res;
    }
}