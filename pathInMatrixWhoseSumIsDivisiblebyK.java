class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        return helper(grid,k,0,0,grid.length-1,grid[0].length-1,1000000007,0);
        
    }
    public int helper(int grid[][],int k,int x,int y,int X,int Y,int mod,long sum){
        if(x==X && y==Y && (sum+grid[x][y])%k==0 )
            return 1;
        else if(x==X && y==Y)
            return 0;
        else if(x>X || y>Y )
            return 0;
        
        int a=helper(grid,k,x+1,y,X,Y,mod,sum+grid[x][y]);
        int b=helper(grid,k,x,y+1,X,Y,mod,sum+grid[x][y]);
        return (a+b)%mod;
    }
}
----------------------------------------------------------------------------
class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
       HashMap<String,Integer> h=new HashMap<>();
        return helper(grid,k,0,0,grid.length-1,grid[0].length-1,1000000007,0,h);
        
    }
    public int helper(int grid[][],int k,int x,int y,int X,int Y,int mod,long sum,HashMap<String,Integer>h){
        if(x==X && y==Y && (sum+grid[x][y])%k==0 )
            return 1;
        else if(x==X && y==Y)
            return 0;
        else if(x>X || y>Y )
            return 0;
        String ans=x+"code"+y+"abc"+(sum+grid[x][y]);
        if(h.containsKey(ans))
            return h.get(ans);
        int a=helper(grid,k,x+1,y,X,Y,mod,sum+grid[x][y],h);
        int b=helper(grid,k,x,y+1,X,Y,mod,sum+grid[x][y],h);
         h.put(ans,(a+b)%mod);
        return h.get(ans);
    }
}

-----------------------------------------------------------------------------------
class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
      int dp[][][]=new int[n][m][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int l=0;l<k;l++){
                    dp[i][j][l]=-1;
                }
            }
        }
     return helper(grid,k,0,0,grid.length-1,grid[0].length-1,1000000007,0,dp);
        
    }
    public int helper(int grid[][],int k,int x,int y,int X,int Y,int mod,int sum,int dp[][][]){
        if(x==X && y==Y && (sum+grid[x][y])%k==0 )
            return 1;
        else if(x==X && y==Y)
            return 0;
        else if(x>X || y>Y )
            return 0;
       
        if(dp[x][y][sum]!=-1)
            return dp[x][y][sum];
        int a=helper(grid,k,x+1,y,X,Y,mod,(sum+grid[x][y])%k,dp);
        int b=helper(grid,k,x,y+1,X,Y,mod,(sum+grid[x][y])%k,dp);
       return dp[x][y][sum]=(a+b)%mod;
    }
}
