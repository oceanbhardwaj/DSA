class Solution {
    public int maximalSquare(char[][] matrix) {
        int max=0;
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              int dp[][]=new int[matrix.length][matrix[0].length];
                for(int k=0;k<matrix.length;k++){
                    Arrays.fill(dp[k],-1);
                }
                ans=maximalSq(matrix,i,j,dp);
                max=Math.max(max,ans);
            }
        }
        return max*max;
    }
    public int maximalSq(char matrix[][],int i,int j,int dp[][]){
        if(i>=matrix.length || j>=matrix[0].length || matrix[i][j]=='0')
            return 0;
       if(dp[i][j]!=-1)
           return dp[i][j];
            return dp[i][j]=1+Math.min(maximalSq(matrix,i+1,j,dp),Math.min(maximalSq(matrix,i,j+1,dp),maximalSq(matrix,i+1,j+1,dp)));
       
        
    }
}
-------------------------------------------------------------------------------------
class Solution {
    public int maximalSquare(char[][] matrix) {
        int dp[][]=new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0 || j==0){
                    if(matrix[i][j]=='1')
                    {
                        dp[i][j]=1;
                      
                    }
                     max=Math.max(dp[i][j],max);
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]=='1')
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                else
                    dp[i][j]=0;
                
                max=Math.max(dp[i][j],max);
            }
        }
        return max*max;
    }
}