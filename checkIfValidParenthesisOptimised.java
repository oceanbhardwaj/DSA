class Solution {
    Boolean dp[][][];
    public boolean hasValidPath(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new Boolean[n][m][201];
       return call(grid,n,m,0,0,0,0);
    }
    public boolean call(char grid[][],int n,int m,int open,int close,int i,int j){
    
       if(grid[i][j]=='(')
           open++;
        else
            close++;
        if(close>open)
            return false;
          
        if(i==n-1 && j==m-1)
        return open==close;
        
        if(dp[i][j][open-close]!=null)
            return dp[i][j][open-close];
        
        if(i==n-1)
            return dp[i][j][open-close]=call(grid,n,m,open,close,i,j+1);
        if(j==m-1)
            return dp[i][j][open-close]=call(grid,n,m,open,close,i+1,j);
        boolean b=call(grid,n,m,open,close,i+1,j) || call(grid,n,m,open,close,i,j+1);
        dp[i][j][open-close]=b;
        return b;
            
    
    
    
    }
}