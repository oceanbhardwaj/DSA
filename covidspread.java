class Solution{
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
     public int helpaterp(int[][] hospital) {
         int n=hospital.length;
         int m=hospital[0].length;
         boolean visited[][]=new boolean[n][m];
         int dist[][]=new int[n][m];
         Queue<Pair> q=new LinkedList<>();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 if(hospital[i][j]==2)
                 {q.add(new Pair(i,j));
                 visited[i][j]=true;
                 dist[i][j]=0;
                 }
             }
         }
         int count=0;
         while(!q.isEmpty())
         {
             //int size=q.size();
            
                
             
             Pair p=q.poll();
             int X=p.x;
             int Y=p.y;
             int arrX[]={-1,0,1,0};
             int arrY[]={0,1,0,-1};
             for(int i=0;i<4;i++)
             {
                 int x_cor=X+arrX[i];
                 int y_cor=Y+arrY[i];
                 if(x_cor>=0 && x_cor<n && y_cor>=0 && y_cor<m && !visited[x_cor][y_cor] && hospital[x_cor][y_cor]==1)
                 {
                     q.add(new Pair(x_cor,y_cor));
                     visited[x_cor][y_cor]=true;
                     dist[x_cor][y_cor]=dist[X][Y]+1;
                     hospital[x_cor][y_cor]=2;
                 }
             }
             
             
             
             
             
             
         }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(hospital[i][j]==1)
                return -1;
            }
        }
    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                count=Math.max(count,dist[i][j]);
            }
        }
        return count;
    }
}
