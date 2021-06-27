class Solution {
    class Pair
    {
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    boolean flag=true;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n=grid2.length;
        int m=grid2[0].length;
        boolean visited[][]=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            { boolean flag=true;
                if(!visited[i][j] && grid2[i][j]==1 && grid1[i][j]==1)
                {
                    dfs(visited,grid1,grid2,i,j,n,m);
                    
                        System.out.println(i+"        "+j);
                    if(flag)
                        count++;
                    
                }
            }
        }
        return count;
        
    }
    public void dfs(boolean visited[][],int grid1[][],int grid2[][],int x_cor,int y_cor,int n,int m)
    {
        // if(visited[x_cor][y_cor] || grid1[x_cor][y_cor]==0)
        //     return false;
        
        int arrX[]={-1,0,1,0};
        int arrY[]={0,1,0,-1};
        visited[x_cor][y_cor]=true;
       
        for(int i=0;i<4;i++)
        {
            int X=x_cor+arrX[i];
            int Y=y_cor+arrY[i];
            if(X>=0 && X<n && Y>=0 && Y<m && grid2[X][Y]==1 && !visited[X][Y])
            {
                if(grid1[X][Y]==1)
                {
                    dfs(visited,grid1,grid2,X,Y,n,m);
                }
                else
                {
                    flag=false;
                     dfs(visited,grid1,grid2,X,Y,n,m);
                  
                }
            }
        }
        
        
}
}