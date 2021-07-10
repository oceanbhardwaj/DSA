class Solution {
    public int candy(int[] arr) {
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        Arrays.fill(left,1);
         Arrays.fill(right,1);
        int n=arr.length;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
                left[i]=left[i-1]+1;
        }
        for(int j=n-2;j>=0;j--)
        {
           if(arr[j]>arr[j+1])
           {
               right[j]=right[j+1]+1;
           }
        }
        int max=0;
        for(int i=0;i<arr.length;i++)
        {max=max+Math.max(left[i],right[i]);
            
        }
        return max;
        
    }
}