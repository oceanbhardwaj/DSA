class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]==1){
                    count=bfs(i,j,n,m,visited,grid);
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
    public int bfs(int i,int j,int n,int m,boolean visited[][],int grid[][]){
     
        Queue<Pair> q=new LinkedList<>();
       int a[]={1,0,-1,0};
       int b[]={0,1,0,-1};
        int count=0;
        q.add(new Pair(i,j));
           visited[i][j]=true;
        while(!q.isEmpty()){
            Pair p=q.poll();
            count++;
            int x=p.x;
            int y=p.y;
          for(int i1=0;i1<4;i1++){
              int X=a[i1]+x;
              int Y=b[i1]+y;
              if(X>=0 && Y>=0 && X<n && Y<m && !visited[X][Y] && grid[X][Y]==1){
                  q.add(new Pair(X,Y));
                  visited[X][Y]=true;
              }
          }  
        }
        return count;
    }
}
--------------------------------------------------------------------------------------------------
class Solution {
    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
      
    }
      int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int max=0;
        int n=grid.length;
        int m=grid[0].length;
        
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 count=0;
                if(!visited[i][j] && grid[i][j]==1){
                    dfs(i,j,n,m,visited,grid);
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
    public void dfs(int i,int j,int n,int m,boolean visited[][],int grid[][]){
     
      
       int a[]={1,0,-1,0};
       int b[]={0,1,0,-1};
       
       
        visited[i][j]=true;
        count++;
     
          for(int i1=0;i1<4;i1++){
              int X=a[i1]+i;
              int Y=b[i1]+j;
              if(X>=0 && Y>=0 && X<n && Y<m && !visited[X][Y] && grid[X][Y]==1){
                 
                  dfs(X,Y,n,m,visited,grid);
              }
          }  
        
        
    }
}