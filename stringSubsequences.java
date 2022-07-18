//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine().trim());
        while (tc-- > 0) {
            String S1 = in.readLine();
            String S2 = in.readLine();
            Solution ob = new Solution();
            System.out.println( ob.countWays(S1,S2) );
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countWays(String S1, String S2) { 
        return call(S1,S2,S1.length(),S2.length());
    }
    public int call(String S1,String S2,int n,int m){
        if(n==0 && m==0 || m==0)
        return 1;
        if(n==0)
        return 0;
        if(S1.charAt(n-1)==S2.charAt(m-1))
        return call(S1,S2,n-1,m-1)+call(S1,S2,n-1,m);
        else
        return call(S1,S2,n-1,m);
    }
}
----------------------------------------------------------
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine().trim());
        while (tc-- > 0) {
            String S1 = in.readLine();
            String S2 = in.readLine();
            Solution ob = new Solution();
            System.out.println( ob.countWays(S1,S2) );
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countWays(String S1, String S2) { 
        int dp[][]=new int[S1.length()][S2.length()];
        for(int i=0;i<S1.length();i++)
        Arrays.fill(dp[i],-1);
        return call(S1,S2,S1.length(),S2.length(),dp);
    }
    public int call(String S1,String S2,int n,int m,int dp[][]){
        if(n==0 && m==0 || m==0)
        return 1;
        if(n==0)
        return 0;
        if(dp[n-1][m-1]!=-1)
        return dp[n-1][m-1];
        if(S1.charAt(n-1)==S2.charAt(m-1))
        return dp[n-1][m-1]= call(S1,S2,n-1,m-1,dp)+call(S1,S2,n-1,m,dp);
        else
        return dp[n-1][m-1]= call(S1,S2,n-1,m,dp);
    }
}
-----------------------------------------------------------------
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine().trim());
        while (tc-- > 0) {
            String S1 = in.readLine();
            String S2 = in.readLine();
            Solution ob = new Solution();
            System.out.println( ob.countWays(S1,S2) );
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countWays(String S1, String S2) { 
       int n=S1.length();
       int m=S2.length();
       int dp[][]=new int[n+1][m+1];
       for(int i=0;i<=n;i++){
           for(int j=0;j<=m;j++)
{  if(i==0)
dp[i][j]=0;
if(j==0)
dp[i][j]=1;
    }
       }
       for(int i=1;i<=n;i++){
           for(int j=1;j<=m;j++){
               if(S1.charAt(i-1)==S2.charAt(j-1))
               dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
               else
               dp[i][j]=dp[i-1][j];
         }
       }
      return dp[n][m];
    }
}