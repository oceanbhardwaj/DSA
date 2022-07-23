class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int dp[][]=new int[matrix.length][matrix[0].length];
                for(int i1=0;i1<matrix.length;i1++){
                    Arrays.fill(dp[i1],-1);
                }
                if(matrix[i][j]==1)
                count+=maximalSq(matrix,i,j,dp);
            }
        }
        return count;
    }
    public int maximalSq(int matrix[][],int i,int j,int dp[][]){
        if(i>=matrix.length || j>=matrix[0].length ||matrix[i][j]==0)
            return 0;
       if(dp[i][j]!=-1)
           return dp[i][j];
            return dp[i][j]=1+Math.min(maximalSq(matrix,i+1,j,dp),Math.min(maximalSq(matrix,i,j+1,dp),maximalSq(matrix,i+1,j+1,dp)));
       
    }
}
-------------------------------------------------------------------------------------------------------------
class Solution {
    public int countSquares(int[][] matrix) {
        int count=0;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               HashMap<String,Integer> h=new HashMap<>();
                if(matrix[i][j]==1)
                count+=maximalSq(matrix,i,j,h);
            }
        }
        return count;
    }
    public int maximalSq(int matrix[][],int i,int j,HashMap<String,Integer> h){
        if(i>=matrix.length || j>=matrix[0].length ||matrix[i][j]==0)
            return 0;
      String ans=i+"leet"+j;
        if(h.containsKey(ans))
            return h.get(ans);
        h.put(ans,1+Math.min(maximalSq(matrix,i+1,j,h),Math.min(maximalSq(matrix,i,j+1,h),maximalSq(matrix,i+1,j+1,h))));
        return h.get(ans);
       
    }
}
--------------------------------------------------------------------------------------------------------------
class Solution {
    public int countSquares(int[][] matrix) {
        int dp[][]=new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0)
                    dp[i][j]=matrix[i][j];
                if(j==0)
                    dp[i][j]=matrix[i][j];
                max+=dp[i][j];
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==1)
                    dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                else
                    dp[i][j]=0;
                max+=dp[i][j];
            }
        }
        return max;
    }
}