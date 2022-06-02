class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[][]=new int[m][n];
        int row=0;
        int col=0;
        for(int i=0;i<n;i++){
            row=0;
            for(int j=0;j<m;j++){
                arr[row++][col]=matrix[i][j];
            }
            col++;
        }
        return arr;
    }
}
-------------------------------------------------
class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int arr[][]=new int[m][n];
        int row=0;
        int col=0;
        for(int i=0;i<m;i++){
          
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[j][i];
            }
           
        }
        return arr;
    }
}