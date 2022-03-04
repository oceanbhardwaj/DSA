class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double a[][]=new double[102][102];
        a[0][0]=poured;
        for(int i=0;i<=query_row;i++){
            for(int r=0;r<=i;r++){
                double left=(double)((a[i][r]-1.0)/2.0);
                if(left>0){
                    a[i+1][r]+=left;
                    a[i+1][r+1]+=left;
                
                }
                
            }
            
        }
        return Math.min(1,a[query_row][query_glass]);
    }
}