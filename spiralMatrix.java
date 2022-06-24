class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a=new ArrayList<>();
        int count=0;
    
        int minr=0;
        int minc=0;
        int maxr=matrix.length-1;
        int maxc=matrix[0].length-1;
        int total=(maxc+1)*(maxr+1);
        int j=0;
        int i=0;
        while(count<total){
            //first row
           // System.out.println("minr :"+minr +"  maxr :"+maxr);
           // System.out.println("minc :"+minc +"  maxc :"+maxc);
            for( j=minc, i=minr;j<=maxc && count<total ;j++){
                a.add(matrix[i][j]);
                count++;
            }
            minr++;
            
            
            //last col
            for(i=minr,j=maxc;i<=maxr  && count<total;i++){
            a.add(matrix[i][j]);
                count++;
            }
            maxc--;
            
            
            //last row
            for(j=maxc,i=maxr ;j>=minc &&  count<total ;j--){
                a.add(matrix[i][j]);
                count++;
            }
            maxr--;
            
            
            //first col
            for(i=maxr, j=minc;i>=minr  && count<total;i--){
                a.add(matrix[i][j]);
                count++;
            }
            minc++;
        }
        return a;
    }
}