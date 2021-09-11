class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int colm=mat[0].length;
        if(row*colm!=r*c)
            return mat;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<row;i++)
        {
        for(int j=0;j<colm;j++)
            { 
            a.add(mat[i][j]);
            }
        }
        
        int l=0;
        int m=0;
        int arr[][]=new int[r][c];
        int index=0;
        for(int l1=0;l1<r;l1++)
        {
            for(int m1=0;m1<c;m1++)
            {
                arr[l1][m1]=a.get(index++);
            }
        }
        return arr;
        
        
    }
}