class Solution {
    class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int numIslands(char[][] grid) {
      
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]=='1')
                {count++;
                 bfs(i,j,grid,n,m,visited);
                 
                }
            }
        }
        return count;
    }
    public void bfs(int i,int j,char grid[][],int n,int m,boolean visited[][]){
          Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(i,j));
        visited[i][j]=true;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int x=p.x;
            int y=p.y;
            int a[]={1,0,-1,0};
            int b[]={0,1,0,-1};
           for(int i1=0;i1<4;i1++){
               int X=a[i1]+x;
               int Y=b[i1]+y;
               if(X>=0 && X<n && Y>=0 && Y<m && grid[X][Y]=='1' && !visited[X][Y]){
                   q.add(new Pair(X,Y));
                   visited[X][Y]=true;
               }
           }
           
            
        }
    }
}