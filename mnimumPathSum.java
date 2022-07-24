class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return helper(grid,0,0,m,n,dp);
    }
    public int helper(int grid[][],int i,int j,int m,int n,int dp[][]){
        if(i==m-1 && j==n-1)
            return grid[i][j];
        if(i>=m || j>=n )
            return Integer.MAX_VALUE;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int right=helper(grid,i,j+1,m,n,dp);
        int down=helper(grid,i+1,j,m,n,dp);
        return dp[i][j]=grid[i][j]+Math.min(right,down);
    }
}
-----------------------------------------------------------------
class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        dp[0][0]=grid[0][0];
       for(int i=1;i<n;i++){
           dp[0][i]=dp[0][i-1]+grid[0][i];
       }
        for(int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
}
}