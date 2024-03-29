//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int n=str.length();
       int dp[][]=new int[n+1][n+1];
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               if(str.charAt(i-1)==str.charAt(j-1) && i!=j)
               dp[i][j]=dp[i-1][j-1]+1;
               else
               dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
           }
       }
       int i=n;
       int j=n;
       String ans="";
       while(i>0 && j>0){
           if(dp[i][j]==dp[i-1][j-1]+1){
               ans=str.charAt(i-1)+ans;
               i--;
               j--;
           }else if(dp[i-1][j]>dp[i][j-1])
           i--;
           else
           j--;

       }
       System.out.println(ans);
       return dp[n][n];
    }
}