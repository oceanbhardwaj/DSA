class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            int sum=arr[i];
            for(int j=i+1;j<n;j++)
            {
                sum=sum+arr[j];
                max=Math.max(max,sum);
            }
        }
        return max;
        
    }
    
}

////////////////////////////////////
//Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        int meh=0;
        int msf=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            meh=meh+arr[i];
            if(meh<arr[i])
            meh=arr[i];
            
            msf=Math.max(msf,meh);
        }
        return msf;
        