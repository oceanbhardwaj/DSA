//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
   HashMap<String,Integer> h=new HashMap<>();
     return call(S1,S2,n,m,0,h);
    }
    public int call(String S1,String S2,int n,int m,int count,HashMap<String,Integer>h){
         if(n<=0 || m<=0)
      return count;
      String ans=n+"code"+m+"leet"+count;
      if(h.containsKey(ans))
      return h.get(ans);
      if(S1.charAt(n-1)==S2.charAt(m-1))
      count= call(S1,S2,n-1,m-1,count+1,h);
    
      h.put(ans, Math.max(count,Math.max(call(S1,S2,n,m-1,0,h),call(S1,S2,n-1,m,0,h))));
    return h.get(ans);
        
    }
}
---------------------------------------------------------------------------
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
       int dp[][]=new int[n+1][m+1];
       int max=0;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=m;j++){
               if(S1.charAt(i-1)==S2.charAt(j-1))
               dp[i][j]=1+dp[i-1][j-1];
               else
               dp[i][j]=0;
               max=Math.max(max,dp[i][j]);
           }
       }
       return max;
    }
}