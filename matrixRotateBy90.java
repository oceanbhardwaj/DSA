class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length*mat[0].length;
        int n1=mat[0].length;
        for(int i1=0;i1<n;i1++)
        {
            if(isEqual(mat,target))
                return true;
            mat=rotate(mat,n1);
        }
        return false;
        
        
    }
    public boolean isEqual(int mat[][],int target[][])
    {
        for(int j=0;j<mat.length;j++)
        {
            for(int k=0;k<mat[0].length;k++)
            {
                if(mat[j][k]!=target[j][k])
                    return false;
            }
        }
        return true;
    }
    
    public int[][] rotate(int mat[][],int n)
    {
        int arr[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                arr[j][n-i-1]=mat[i][j];
            }
        }
        return arr;
    }
}