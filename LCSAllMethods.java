class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        return dfs(s1,s2,x,y);
    }
    public static int dfs(String X,String Y,int m,int n)
    {
        if(m==0 || n==0)
        return 0;
        if(X.charAt(m-1)==Y.charAt(n-1))
        return 1+dfs(X,Y,m-1,n-1);
        else
        return Math.max(dfs(X,Y,m,n-1),dfs(X,Y,m-1,n));
    }
    
}
////////////////////////////////////
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
       int dp[][]=new int[x+1][y+1];
       for(int i=0;i<x;i++)
       {
           Arrays.fill(dp[i],-1);
       }
        return dfs(s1,s2,x,y,dp);
    }
    public static int dfs(String X,String Y,int m,int n, int dp[][])
    {
        if(m==0 || n==0)
        return 0;
      if(dp[m-1][n-1]!=-1)
      return dp[m-1][n-1];
       
        int r=0;
        if(X.charAt(m-1)==Y.charAt(n-1))
        { r=1+dfs(X,Y,m-1,n-1,dp);
        dp[m-1][n-1]=r;
        return r;
        }
        else
        {r= Math.max(dfs(X,Y,m,n-1,dp),dfs(X,Y,m-1,n,dp));
       dp[m-1][n-1]=r;
        return r;
        
        }
    }
    
}
//////////////////////////////////////////////
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        int dp[][]=new int[x+1][y+1];
        for(int i=1;i<=x;i++)
        {
            for(int j=1;j<=y;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]= 1+dp[i-1][j-1];
                else
                dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[x][y];
    }
    
}