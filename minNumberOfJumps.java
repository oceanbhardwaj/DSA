class Solution{
    static int minJumps(int[] arr){
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[0]=0;
        if(arr[0]==0)
        return -1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i<=j+arr[j])
                {
                    ans[i]=Math.min(ans[i],ans[j]+1);
                }
            }
        }
        return ans[n-1]==Integer.MAX_VALUE?-1:ans[n-1];
    }
}
////////////////////////////////
class Solution{
    static int minJumps(int[] arr){
        int maxR=arr[0];
        int steps=arr[0];
        if(arr[0]==0)
        return -1;
        int jumps=1;
        for(int i=1;i<arr.length;i++)
        {
            if(i==arr.length-1)
            return jumps;
            maxR=Math.max(maxR,i+arr[i]);
            steps--;
            if(steps==0)
            {
                jumps++;
                if(i>=maxR)
                return -1;
                steps=maxR-i;
            }
        }
        return jumps;
    }
}