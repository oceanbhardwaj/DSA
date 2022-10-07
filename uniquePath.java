class Solution {
  
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return dfs(0,0,m-1,n-1,dp);
       
    }
    public int dfs(int sourceX,int sourceY,int destX,int destY,int dp[][]){
        if(sourceX==destX && sourceY==destY)
        { 
          
        return 1;}
        if(sourceX>destX || sourceY>destY || sourceX<0 || sourceY<0)
        { 
            return 0;
         
        }
        if(dp[sourceX][sourceY]!=-1)
            return dp[sourceX][sourceY];
        
       int a= dfs(sourceX+1,sourceY,destX,destY,dp);
       int b= dfs(sourceX,sourceY+1,destX,destY,dp);
        return dp[sourceX][sourceY]=a+b;
    }
}


------------------------------------------------------------------
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