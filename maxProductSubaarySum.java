class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long max=Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            long prod=arr[i];
            for(int j=i+1;j<n;j++)
            {
                prod=prod*arr[j];
                max=Math.max(max,prod);
            }
        }
        return max;
    }
}
//////////////////////////////////
class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        long max=arr[0];
        long currMax=arr[0];
        long currMin=arr[0];
        long prevMax=arr[0];
        long prevMin=arr[0];
        for(int i=1;i<n;i++)
        {
            currMax=Math.max(prevMax*arr[i],Math.max(prevMin*arr[i],arr[i]));
            currMin=Math.min(prevMax*arr[i],Math.min(prevMin*arr[i],arr[i]));
            max=Math.max(max,currMax);
            prevMax=currMax;
            prevMin=currMin;
            
        }
        return max;
    }
}