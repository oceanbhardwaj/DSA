class NumArray {

    int arr[];
    public NumArray(int[] nums) {
        arr=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
}
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
            return arr[right];
        return arr[right]-arr[left-1];
  }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
 --------------------------------------------------------------
 class NumMatrix {

    int arr[][];
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        arr=new int[n][m+1];
      
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){;
                System.out.println(i+"jk"+j);
                arr[i][j+1]=arr[i][j]+matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=0;
       for(int i=row1;i<=row2;i++){
           sum+=arr[i][col2+1]-arr[i][col1];
       }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
 -------------------------------------------------------------
 class NumMatrix {

    int arr[][];
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        arr=new int[n][m+1];
        //prefix sum rows
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j+1]=arr[i][j]+matrix[i][j];
                
            }
        }
        //prefix sum colms
        for(int j=1;j<m+1;j++){
            for(int i=1;i<n;i++){
                arr[i][j]=arr[i-1][j]+arr[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        col1=col1+1;
        col2=col2+1;
        int total=arr[row2][col2];
        int upExtra=row1!=0?arr[row1-1][col2]:0;
        int sideExtra=col1!=0?arr[row2][col1-1]:0;
        int common=(row1!=0 && col1!=0)?arr[row1-1][col1-1]:0;
        return total-(upExtra+sideExtra-common);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */