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
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int TotalWays(int N)
    {
      long OldwaysOfBuilding=1;
      long OldwaysOfSpaces=1;
      long mod=1000000007;
      for(int i=2;i<=N;i++){
          long newWaysOfBuilding=OldwaysOfSpaces%mod;
          long newWaysOfSpaces=(OldwaysOfBuilding%mod+OldwaysOfSpaces%mod)%mod;
           
           OldwaysOfSpaces=newWaysOfSpaces;
           OldwaysOfBuilding=newWaysOfBuilding;
           
      }
      long ans=(OldwaysOfBuilding%mod+OldwaysOfSpaces%mod)%mod;
      return (int)((ans*ans)%mod);
    }
}