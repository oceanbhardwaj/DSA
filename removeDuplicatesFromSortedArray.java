class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> h=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
            h.add(nums[i]);
        
        int count=0;
        for(int i:h){
           nums[count++]=i; 
        }
        return h.size();
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
      // Arrays.sort(nums);
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[c-1]==nums[i])
                continue;
            else
                nums[c++]=nums[i];
            
        }
        return c;
    }
}