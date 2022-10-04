class Solution {
    public boolean checkValid(int[][] matrix) {
       
        for(int i=0;i<matrix.length;i++){
            HashSet<Integer> row=new HashSet<>();
            
            for(int j=0;j<matrix[0].length;j++){
                int val=matrix[i][j];
            
                row.add(val);
            }
            if(row.size()!=matrix.length)
                return false;
        }
         for(int i=0;i<matrix[0].length;i++){
            HashSet<Integer> col=new HashSet<>();
            
            for(int j=0;j<matrix.length;j++){
                int val=matrix[j][i];
            
                col.add(val);
            }
            if(col.size()!=matrix.length)
                return false;
        }
        return true;
    }
}