class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low=matrix[0][0];
        int m=matrix.length;
        int n=matrix[0].length;
        int high=matrix[m-1][n-1];
        while(low<high){
        int mid=(low+(high-low)/2);
        int count=call(mid,matrix);
            
            if(count<k)
                low=mid+1;
            else
                high=mid;
        
        
        }
        return low;
    }
    public int call(int mid,int matrix[][]){
        int res=0;
        int i=matrix.length-1;
        int j=0;
        while(i>=0 && j<matrix[0].length){
            if(matrix[i][j]>mid)
                i--;
            else{
                res=res+i+1;
                j++;
            }
        }
        return res;
    }
}
----------------------------------------------------------
class Solution {
    class Pair{
        int x;
        int y;
        int val;
        Pair(int x,int y,int val){
        this.x=x;
            this.y=y;
            this.val=val;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((o1,o2)->o1.val-o2.val);
        
        for(int j=0;j<matrix[0].length;j++){
            pq.add(new Pair(0,j,matrix[0][j]));
        }
        while(k-1>0){
            Pair popped=pq.poll();
            System.out.println(popped.val);
            int X=popped.x;
           if(X+1<matrix.length){
               pq.add(new Pair(X+1,popped.y,matrix[X+1][popped.y]));
           }
          k--;  
        }
        return pq.peek().val;
    }
}