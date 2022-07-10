class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
       arr[0]=binarySearchFirstOcc(nums,target);
        arr[1]=binarySearchLastOcc(nums,target);
        return arr;
    }
    public int binarySearchFirstOcc(int nums[],int target){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start-(start-end)/2);
            if(nums[mid]==target)
                ans=mid;
            if(nums[mid]>=target){
                end=mid-1;
            }
            else
                start=mid+1;
            }
         return ans;
        }
       
    
    public int binarySearchLastOcc(int nums[],int target){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start-(start-end)/2);
            if(nums[mid]==target)
                ans=mid;
            if(nums[mid]>target){
                end=mid-1;
            }else
                start=mid+1;
        }
        return ans;
    }
}