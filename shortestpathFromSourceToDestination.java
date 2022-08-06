//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            String s1[] = read.readLine().split(" ");
            x = Integer.parseInt(s1[0]);
            y = Integer.parseInt(s1[1]);
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(N, M, a, x, y));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
  class  Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
       //BFS
       int dist[][]=new int[N][M];
       boolean visited[][]=new boolean[N][M];
       if(A[0][0]==0 || A[X][Y]==0)
       return -1;
      return bfs(N,M,0,0,X,Y,A,dist,visited);
       
    }
    public int bfs(int n,int m,int startx,int starty,int endx,int endy,int A[][],int dist[][],boolean visited[][]){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(startx,starty));
        visited[startx][starty]=true;
        int a[]={0,1,0,-1};
        int b[]={1,0,-1,0};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int XX=p.x;
            int YY=p.y;
            if(XX==endx && YY==endy)
            return dist[XX][YY];
         for(int i=0;i<4;i++){
             int newX=XX+a[i];
             int newY=YY+b[i];
             if(newX>=0 && newX<n && newY>=0 && newY<m && !visited[newX][newY] && A[newX][newY]==1){
                 dist[newX][newY]=dist[XX][YY]+1;
                 q.add(new Pair(newX,newY));
                 visited[newX][newY]=true;
             }
         }
            
        }
        return -1;
    }
};