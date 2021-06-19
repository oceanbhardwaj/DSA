class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        
          k=k%n;
        int len=n-k;
        int arr[]=new int[n];
        for(int i=len;i<n;i++)
        {
            arr[i-len]=nums[i];
            
        }
        for(int i=0;i<len;i++)
        {
            arr[k+i]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
    }
}
////////////////////////////////////////
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        
          k=k%n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }
    public void reverse(int start,int end,int nums[])
    {
        while(start<=end)
        {
            swap(start,end,nums);
            start++;
            end--;
        }
    }
    public void swap(int start,int end,int nums[])
    {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}