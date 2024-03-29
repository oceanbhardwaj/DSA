class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        
         List<Integer> list=new ArrayList<>();
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1])
                left[i]=left[i-1]+1;
            
        }
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] <=nums[i+1])
                right[i]=right[i+1]+1;
        }
        
        for(int i=k;i<nums.length-k;i++){
            if(left[i-1]>=k && right[i+1]>=k  )
                list.add(i);
        }
        return list;
    }
}