class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int small=arr[0]+k;
        int big=arr[n-1]-k;
        int ans=arr[n-1]-arr[0];
        
        for(int i=1;i<n;i++)
        {
            //arr[i-1]+k
           int max=Math.max(arr[i-1]+k,big);
           int min=Math.min(arr[i]-k,small);
           if(min<0)
           continue;
           ans=Math.min(max-min,ans);
        }
       return ans; 
    }
}