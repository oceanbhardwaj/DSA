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
    public int[][] updateMatrix(int[][] mat) {
        //nearest zero
    int n=mat.length;
        
        int m=mat[0].length;
        int dist[][]=new int[n][m];
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        Queue<Pair> q=new LinkedList<>();
        int arrX[]={-1,0,1,0};
        int arrY[]={0,1,0,-1};
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                 q.add(new Pair(i,j));
                    dist[i][j]=0;
                    visited[i][j]=true;
                
                
                }
            }
        }
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int X=p.x;
            int Y=p.y;
            for(int i=0;i<4;i++)
            {
                int x_cor=X+arrX[i];
                int y_cor=Y+arrY[i];
                if(x_cor>=0 && x_cor<n && y_cor>=0 && y_cor<m && mat[x_cor][y_cor]==1 && !visited[x_cor][y_cor])
                {
                    q.add(new Pair(x_cor,y_cor));
                    dist[x_cor][y_cor]=Math.min(dist[x_cor][y_cor],dist[X][Y]+1);
                    visited[x_cor][y_cor]=true;
                }
            }
            
        }
        return dist;
    }
}