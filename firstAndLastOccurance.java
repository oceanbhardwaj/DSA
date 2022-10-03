class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
       arr[0]=getFloor(nums,target);
       arr[1]=getCeil(nums,target);
        return arr;
    }
    public int getFloor(int nums[],int target){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(target==nums[mid]){
                ans=mid;
                high=mid-1;
            }else if(target<nums[mid])
                high=mid-1;
            else{
                low=mid+1;
            }
                
        }
        return ans;
    }
    public int getCeil(int nums[],int target){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+(high-low)/2);
            if(target==nums[mid])
            {
                ans=mid;
                low=mid+1;
            }else if(target<nums[mid]) {
                high=mid-1;
            }else{
               low=mid+1;
            }
        }
        return ans;
    }
}