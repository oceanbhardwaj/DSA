class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
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
    public int[][] nearest(int[][] grid)
    {
       int N=grid.length;
       int M=grid[0].length;
       int dist[][]=new int[N][M];
       int arrX[]={-1,0,1,0};
       int arrY[]={0,1,0,-1};
       for(int i=0;i<N;i++)
       Arrays.fill(dist[i],Integer.MAX_VALUE);
       boolean visited[][]=new boolean[N][M];
       Queue<Pair> q=new LinkedList<>();
       for(int i=0;i<N;i++)
       {
           for(int j=0;j<M;j++)
           {
               if(grid[i][j]==1)
               {q.add(new Pair(i,j));
               visited[i][j]=true;
               dist[i][j]=0;}
           }
       }
       while(!q.isEmpty())
       {
           Pair p=q.poll();
           int X=p.x;
           int Y=p.y;
           for(int i=0;i<4;i++)
           {
               int x_coordinate=X+arrX[i];
               int y_coordinate=Y+arrY[i];
               if(x_coordinate>=0 && x_coordinate<N && y_coordinate>=0 && 
               y_coordinate<M && grid[x_coordinate][y_coordinate]==0 && !visited[x_coordinate][y_coordinate])
               {
                   q.add(new Pair(x_coordinate,y_coordinate));
                   visited[x_coordinate][y_coordinate]=true;
                   dist[x_coordinate][y_coordinate]=Math.min(dist[x_coordinate][y_coordinate],dist[X][Y]+1);
               }
           }
           
       }
       return dist;
       
       
       
       
    }
}