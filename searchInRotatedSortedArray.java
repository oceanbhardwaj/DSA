class Solution {
    public int search(int[] nums, int target) {
       //step 1 : finding min
        //step2 : find in first half
        //step3 : find in second half
        
        //step1:
        int min=findMin(nums,target);
        System.out.println(min);
        int ans1=binarySearch(0,min-1,nums,target);
        int ans2=binarySearch(min,nums.length-1,nums,target);
        return Math.max(ans1,ans2);
    }
    public int findMin(int nums[],int target){
        int n=nums.length;
        int ans=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start-(start-end)/2);
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            if(nums[prev]>nums[mid] && nums[mid]<nums[next])
                return mid;
            else if(nums[mid]<=nums[end])
            {
                end=mid-1;
            }else if(nums[start]<=nums[mid])
                start=mid+1;
                
        }
        return ans;
    }
    public int binarySearch(int start,int end,int nums[],int target){
        int ans=-1;
        while(start<=end){
            int mid=(start-(start-end)/2);
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target){
                end=mid-1;
            }else
                start=mid+1;
        }
        return ans;
    }
}