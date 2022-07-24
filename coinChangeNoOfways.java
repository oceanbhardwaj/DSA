
import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for (int i = 0; i < m; i++) Arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(Arr, m, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int S[], int m, int n) {
       long dp[][]=new long[m+1][n+1];
       for(int i=0;i<=m;i++)
       Arrays.fill(dp[i],-1);
         return helper(S,n,0,dp);
    }
    public long helper(int coins[],int amount,int index,long dp[][]){
        if(index>=coins.length || amount<0)
            return 0;
        if(amount==0)
            return (long)1;
            if(dp[index][amount]!=-1)
            return dp[index][amount];
      
       if(coins[index]<=amount)
        return dp[index][amount]= helper(coins,amount-coins[index],index,dp)+helper(coins,amount,index+1,dp);
        else
            return dp[index][amount]=helper(coins,amount,index+1,dp);
        //return Math.min(d,e);
    }
    
}