class Solution {
    public void solve(char[][] board) {
       //boundary DFS
       int n=board.length;
       int m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        boolean flag=false;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X')
                    flag=true;
            }
             
         }
        if(!flag)
            return;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                if(!visited[i][j] && board[i][j]=='O'){
                    dfs(i,j,board,visited,n,m); //will set boundary 'O' to 'B'
                }
                }
            }
        }
        //System.out.println(Arrays.deepToString(board));
        //convert 'O' to X and B to O
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                else if(board[i][j]=='B')
                    board[i][j]='O';
            }
        }
        
        
    }
    public void dfs(int i,int j,char board[][],boolean visited[][],int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j] || board[i][j]!='O')
            return;
        visited[i][j]=true;
        board[i][j]='B';
        dfs(i+1,j,board,visited,n,m);
         dfs(i,j+1,board,visited,n,m);
         dfs(i-1,j,board,visited,n,m);
         dfs(i,j-1,board,visited,n,m);
    }
}