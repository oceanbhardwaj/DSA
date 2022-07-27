class Solution {
    class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
        //multisource
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        int dist[][]=new int[n][m];
        boolean visited[][]=new boolean[n][m];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j));
                    visited[i][j]=true;
                }
            }
        }
        int x_cor[]={1,0,-1,0};
        int y_cor[]={0,1,0,-1};
        while(!q.isEmpty()){
            Pair popped=q.poll();
            int X=popped.x;
            int Y=popped.y;
            for(int i=0;i<4;i++){
                int newX=X+x_cor[i];
                int newY=Y+y_cor[i];
                if(isValid(newX,newY,n,m) && grid[newX][newY]==1 && !visited[newX][newY])
                {
                    q.add(new Pair(newX,newY));
                    grid[newX][newY]=2;
                    visited[newX][newY]=true;
                    dist[newX][newY]=dist[X][Y]+1;
                    max=Math.max(max,dist[newX][newY]);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                    return -1;
            }
        }
       
    return max;
        
    }
    public boolean isValid(int x,int y,int n,int m){
        if(x<0 || y<0 || x>=n || y>=m)
            return false;
        
        return true;
    }
}