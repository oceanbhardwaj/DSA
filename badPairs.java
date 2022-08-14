class Solution {
    public long countBadPairs(int[] nums) {
      long count=0;
        long n=nums.length;
        HashMap<Long,Long> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           count+=h.getOrDefault(nums[i]-(long)i,(long)0);
            h.put(nums[i]-(long)i,(long)(h.getOrDefault(nums[i]-(long)i,(long)0)+1));
        }
        System.out.println((n*(n-1))/2);
        return ((long)(n*(n-1))/2)-count;
    }
}