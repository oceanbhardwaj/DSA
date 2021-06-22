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
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        int dist[][]=new int[N+1][M+1];
        boolean visited[][]=new boolean[N+1][M+1];
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0));
        visited[0][0]=true;
        if(A[0][0]==0)
        return -1;
        int arrX[]={-1,0,1,0};
        int arrY[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            Pair p=q.poll();
            int X1=p.x;
            int Y1=p.y;
            if(X1==X && Y1==Y)
                return dist[X1][Y1];
            for(int i=0;i<4;i++)
            {
                int XX=X1+arrX[i];
                int YY=Y1+arrY[i];
               
                if( XX>=0 && YY>=0 && XX<N && YY<M && A[XX][YY]==1 && !visited[XX][YY])
                {
                    
                    q.add(new Pair(XX,YY));
                    dist[XX][YY]=dist[X1][Y1]+1;
                    visited[XX][YY]=true;
                }
            }
            
        }
        
        return -1;
    }
};