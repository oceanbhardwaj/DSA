class Solution {
    public int uniquePaths(int m, int n) {
        return call(0,0,m-1,n-1);
    }
    public int call(int x,int y,int m,int n){
        if(x>m || y>n)
            return 0;
        if(x==m && y==n)
            return 1;
        return call(x+1,y,m,n)+call(x,y+1,m,n);
    }
}
--------------------------------------------------------------------
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        Arrays.fill(dp[i],-1);
        return call(0,0,m-1,n-1,dp);
    }
    public int call(int x,int y,int m,int n,int dp[][]){
        if(x>m || y>n)
            return 0;
        if(x==m && y==n)
            return 1;
        if(dp[x][y]!=-1)
            return dp[x][y]; 
        return dp[x][y]=call(x+1,y,m,n,dp)+call(x,y+1,m,n,dp);
    }
}
----------------------------------------------------------------------------
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
           if(i==0 || j==0)
               dp[i][j]=1;
                
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                
              dp[i][j]=dp[i-1][j]+dp[i][j-1]; 
            }
        }
        return dp[m-1][n-1];
        
    }
}