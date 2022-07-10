class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums,target,0,nums.length-1);
    }
    public int binarysearch(int nums[],int target,int start,int end){
        if(start>end)
            return -1;
        int mid=(start-(start-end)/2);
        if(nums[mid]==target)
            return mid;
        else if(target>nums[mid])
            return binarysearch(nums,target,mid+1,end);
        else
            return binarysearch(nums,target,start,mid-1);
    }
}