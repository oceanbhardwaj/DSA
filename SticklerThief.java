class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        return dfs(arr,0);
    }
    public int dfs(int arr[],int i)
    {
        if(i>=arr.length)
        return 0;
        return Math.max(arr[i]+dfs(arr,i+2),dfs(arr,i+1));
    }
}
////////////////////////////////////////////
class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        HashMap<String,Integer> h=new HashMap<>();
        return dfs(arr,0,h);
    }
    public int dfs(int arr[],int i,HashMap<String,Integer> h)
    {
        if(i>=arr.length)
        return 0;
        String str=i+"code";
        if(h.containsKey(str))
        return h.get(str);
        int d=Math.max(arr[i]+dfs(arr,i+2,h),dfs(arr,i+1,h));
        h.put(str,d);
        return d;
    }
}
//////////////////////////////////////////////////////
class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
       int dp[]=new int[n];
       if(n==1)
       return arr[0];
       if(n==2)
       {
           return Math.max(arr[0],arr[1]);
       }
       dp[0]=arr[0];
       dp[1]=Math.max(arr[0],arr[1]);
       for(int i=2;i<n;i++)
       {
           dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
       }
       return dp[n-1];
    }
}