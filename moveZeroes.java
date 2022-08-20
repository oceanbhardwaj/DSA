time O(n) space o(n)
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i:nums){
            if(i!=0){
                a.add(i);
            }
        }
        int arr[]=new int[nums.length];
        int c=0;
        for(int i:a){
           arr[c++]=i; 
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}
-------------------------------------------------------------------
Order does not matter -o(n) o(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end){
            while(start<end && nums[start]!=0)
                start++;
            while(start<end && nums[end]==0)
                end--;
            
            //swap
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
        }
    }
}
-------------------------------------------------------------------
o(n) inplace   two traversal
class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeroEle=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonzeroEle++]=nums[i];
            }
        }
        for(int i=nonzeroEle;i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}
-------------------------------------------------------------------
o(n)   o(1) one traversal
class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeroEle=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
               // nums[nonzeroEle++]=nums[i];
                swap(nonzeroEle++,i,nums);
            }
        }
        // for(int i=nonzeroEle;i<nums.length;i++){
        //     nums[i]=0;
        // }
        
    }
    public void swap(int i,int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}