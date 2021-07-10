class Solution {
    public void sortColors(int[] nums) {
        int arr[]=new int[nums.length];
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i:nums)
        {
         if(i==0)
             count0++;
            else if(i==1)
                count1++;
            else
                count2++;
        }
        int index=0;
        for(int i=0;i<count0;i++)
        {
            arr[index++]=0;
        }
        for(int i=count0;i<count0+count1;i++)
        {
            arr[index++]=1;
        }
        for(int i=count1+count0;i<nums.length;i++)
        {
            arr[index++]=2;
        }
        
        for(int i=0;i<nums.length;i++)
        {
          nums[i]=arr[i];
        
        }
        
    }
}
///////////////////////////////////
class Solution {
    public void sortColors(int[] arr) {
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(low,mid,arr);
                low++;
                mid++;
            
            
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(mid,high,arr);
                high--;
            }
        }}
        public void swap(int a,int b,int nums[])
        {
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            
        }
    
}