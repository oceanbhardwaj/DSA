class Solution {
    public void rotate(int[][] matrix) {
    //step1 transpose
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
              //swap
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            
            }
        }
        
        //step2
        int colstart=0;
        int colend=m-1;
        while(colstart<colend){
            for(int i=0;i<n;i++){
                  //swap
                int temp=matrix[i][colstart];
                matrix[i][colstart]=matrix[i][colend];
                matrix[i][colend]=temp;
            }
            colstart++;
            colend--;
        }
       
        
        
    }
}