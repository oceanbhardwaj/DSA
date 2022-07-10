class Solution {
    public int search(int[] nums, int target) {
        //Array is sorted
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start-(start-end)/2); //to prevent Integer overflow
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
            
        }
        return -1;
        
    }
}