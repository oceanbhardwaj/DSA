O(N) TIME  O(N) SPACE
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int even=0;
        int odd=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){//even
                ans[even++]=nums[i];
            }else{
                ans[odd--]=nums[i];
            }
        }
        return ans;
    }
}
----------------------------------------
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
             
            while(i<j && (nums[i]%2==0))
                i++;
           
            while(i<j && (nums[j]%2!=0))
                j--;
            
              
            //swap
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
       
            
        }
        return nums;
    }
}