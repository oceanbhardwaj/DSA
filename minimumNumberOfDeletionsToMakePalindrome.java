//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int n = Integer.parseInt(read.readLine());
            String str = read.readLine().strip();
            Solution ob = new Solution();
            long ans = ob.minDeletions(str, n); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int minDeletions(String str, int n)
    {
    StringBuffer sb=new StringBuffer(str);
    sb.reverse();
    String str2=sb.toString();
    int dp[][]=new int[n+1][n+1];
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(str.charAt(i-1)==str2.charAt(j-1))
            dp[i][j]=1+dp[i-1][j-1];
            else
            dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
        }
    }
    return n-dp[n][n];
    }
} 