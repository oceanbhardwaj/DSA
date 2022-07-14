class Solution {
    public boolean search(int[] nums, int target) {
      
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            while(start<end && nums[start]==nums[start+1])
                start++;
            while(start<end && nums[end]==nums[end-1])
                end--;
            
            int mid=(start-(start-end)/2);
            if(nums[mid]==target)
                return true;
            else if(nums[mid]>=nums[start]){
                if(target>=nums[start] && target<=nums[mid])
                    end=mid-1;
                else
                    start=mid+1;
               
                    
            }
            else if(nums[mid]<=nums[end])
            {
                if(target>=nums[mid] && target<=nums[end])
                    start=mid+1;
                else
                    end=mid-1;
            }
            }
        return false;
        }
    
}