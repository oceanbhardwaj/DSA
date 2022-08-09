class Solution {
    public void rotate(int[] nums, int k) {
        //left rotation
        k=k%nums.length;
        int count=0;
        int arr[]=new int[nums.length];
        for(int i=nums.length-k;i<nums.length;i++){
            arr[count++]=nums[i];
        }
        for(int i=0;i<nums.length-k;i++){
            arr[count++]=nums[i];
        }
       for(int i=0;i<nums.length;i++){
           nums[i]=arr[i];
       }
        
    }
}
---------------------------------
class Solution {
    public void rotate(int[] nums, int k) {
        //left rotation
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
       reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    public void reverse(int nums[],int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
        
    }
    public void swap(int nums[],int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    
}