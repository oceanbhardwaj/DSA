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
    public int numIslands(char[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {  bfs(grid,visited,i,j,n,m);
                count++;}
            }
        }
        return count;
    }
    
    public void bfs(char grid[][],boolean visited[][],int x_cor,int y_cor,int n,int m)
    {
        int arrX[]={-1,0,1,0};
        int arrY[]={0,1,0,-1};
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(x_cor,y_cor));
        visited[x_cor][y_cor]=true;
        
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int X=p.x;
            int Y=p.y;
            for(int i=0;i<4;i++)
            {
                int X_cor=X+arrX[i];
                int Y_cor=Y+arrY[i];
                if(X_cor>=0 && X_cor<n && Y_cor>=0 && Y_cor<m && !visited[X_cor][Y_cor]  && grid[X_cor][Y_cor]=='1')
                {
                    visited[X_cor][Y_cor]=true;
                    q.add(new Pair(X_cor,Y_cor));
                }
            }
        }
    }
    
    
    
    
    
    
    
    
    
}
///////////////////////////////////
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
    public int numIslands(char[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {  dfs(grid,visited,i,j,n,m);
                count++;}
            }
        }
        return count;
    }
    
    public void dfs(char grid[][],boolean visited[][],int x_cor,int y_cor,int n,int m)
    {
        int arrX[]={-1,0,1,0};
        int arrY[]={0,1,0,-1};
        
        if(visited[x_cor][y_cor])
            return;
        visited[x_cor][y_cor]=true;
        
        int X=x_cor;
        int Y=y_cor;
            for(int i=0;i<4;i++)
            {
                int X_cor=X+arrX[i];
                int Y_cor=Y+arrY[i];
                if(X_cor>=0 && X_cor<n && Y_cor>=0 && Y_cor<m && !visited[X_cor][Y_cor]  && grid[X_cor][Y_cor]=='1')
                {
                    dfs(grid,visited,X_cor,Y_cor,n,m);
                    
                }
            }
        
    }
    
    
    
    
    
    
    
    
    
}