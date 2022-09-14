class Solution {
    public void moveZeroes(int[] nums) {
        //method1
       /* int arr[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                arr[count++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }*/
        
        
        //method2
        
     /*  int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0)
                nums[i++]=nums[j];
        }
        for(;i<nums.length;i++){
            nums[i]=0;
        }*/
        
        //method3
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                //swap
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
    }
}