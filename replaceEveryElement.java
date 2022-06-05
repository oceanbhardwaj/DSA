class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],i);
        }
        for(int a[]:operations){
            int index=h.get(a[0]);
       
            int val=a[1];
            nums[index]=val;
            h.put(val,index);
        }
        return nums;
        
    }
}