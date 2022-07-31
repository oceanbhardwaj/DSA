//TC-O(N)  SC-O(N)

class Solution {
    public void sortColors(int[] nums) {
        int ans[]=new int[nums.length];
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zero++;
            else if(nums[i]==1)
                one++;
            else
                two++;
                
        }
        int count=0;
        for(int i=0;i<zero;i++){
            ans[count++]=0;
        }
        for(int i=zero;i<zero+one;i++){
            ans[count++]=1;
        }
        for(int i=zero+one;i<nums.length;i++){
            ans[count++]=2;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
        
    }
}

-----------------------------------------------------------------------------------------
TC-O(N)  SC-(N)
class Solution {
    public void sortColors(int[] nums) {
        int mid=0;
        int low=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(mid,low,nums);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else
            {
                swap(mid,high,nums);
                high--;
            }
        }
        
    }
    public void swap(int a,int b,int nums[]){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}