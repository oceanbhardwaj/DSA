class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int rows=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int rowe=n-1;
        int cols=0;
        int cole=m-1;
        int count=n*m;
        while(true){
        //first row
            for(int i=cols;i<=cole && count>0 ;i++){
                list.add(matrix[rows][i]);
                count--;
            }
           
            rows++;
            
            //last col
            for(int i=rows;i<=rowe && count>0 ;i++){
                list.add(matrix[i][cole]);
                count--;
            }
          
            cole--;
            
            //last row
            for(int i=cole;i>=cols && count>0 ;i--){
                list.add(matrix[rowe][i]);
                count--;
            }
            
            rowe--;
            //first col
            for(int i=rowe;i>=rows && count>0 ;i--){
                list.add(matrix[i][cols]);
                count--;
            }
             
            cols++;
            if(count<=0)
                break;
        }
        return list;
    }
}