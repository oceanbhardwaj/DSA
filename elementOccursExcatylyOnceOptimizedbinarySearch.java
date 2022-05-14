=class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=0;
        if(nums.length==1)
            return nums[0];
        
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1])
            { ans=nums[i];
             break;
             
            }
                
        }
        int n=nums.length;
        if(nums[n-1]!=nums[n-2])
            ans=nums[n-1];
        
        
        
        return ans;
    }
}
------------------------------------------------------------------------------------------------------
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-2;
        if(nums.length==1)
            return nums[0];
        while(low<=high){
            int mid=(low+high)>>1;//odd-sec,even-first
            if(nums[mid]==nums[mid^1]){
                //move to right
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        return nums[low];
    }
}