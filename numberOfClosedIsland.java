class Solution {
    public int closedIsland(int[][] grid) {
        //boundary dfs
        int n=grid.length;
        int m=grid[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(grid[i][j]==0 || !visited[i][j])
                        dfs(i,j,grid,visited);
                }
            }
        }
         visited=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]==0){
                    count++;
                    dfsForClosedIsland(i,j,grid,visited);
                }
            }
        }
        return count;
    }
    public void dfs(int i,int j,int grid[][],boolean visited[][]){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] ||grid[i][j]==1)
            return;
        visited[i][j]=true;
        grid[i][j]=1;
        dfs(i+1,j,grid,visited);
        dfs(i,j+1,grid,visited);
        dfs(i,j-1,grid,visited);
        dfs(i-1,j,grid,visited);
        
    }
    public void dfsForClosedIsland(int i,int j,int grid[][],boolean visited[][]){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j] ||grid[i][j]==1)
            return;
        visited[i][j]=true;
      //  visited[i][j]=1;
        dfsForClosedIsland(i+1,j,grid,visited);
        dfsForClosedIsland(i,j+1,grid,visited);
        dfsForClosedIsland(i,j-1,grid,visited);
        dfsForClosedIsland(i-1,j,grid,visited);
    }
}