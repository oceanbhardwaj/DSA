class Solution {
    public int maxDistToClosest(int[] seats) {
        //method 1
        //bruteforce
        int n=seats.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(seats[i]==1)
                continue;
            //find left that has 1
            int min=Integer.MAX_VALUE;
            for(int j=i-1;j>=0;j--){
                if(seats[j]==1){
                    min=Math.min(min,i-j);
                    break;
                }
            }
            //find right one
            for(int j=i+1;j<n;j++){
                if(seats[j]==1)
                {
                    min=Math.min(min,j-i);
                    break;
                }
            }
            max=Math.max(max,min);
        }
        return max;
    }
}
------------------------------------------------------------------------------
class Solution {
    public int maxDistToClosest(int[] seats) {
        //method 2
        // o(n)
        int n=seats.length;
        int right[]=new int[n];
        right[n-1]=seats[n-1]==1?n-1:Integer.MAX_VALUE;
        for(int i=n-2;i>=0;i--){
            if(seats[i]==0)
            right[i]=right[i+1];
            else
                right[i]=i;
        }
        long left=Integer.MIN_VALUE;
        long max=Integer.MIN_VALUE;
        //System.out.println(Arrays.toString(right));
        for(int i=0;i<n;i++){
            if(seats[i]==1){
               left=i;
               continue;
            }
            //System.out.println(left+" "+right[i]+"  "+(i-left)); 
            long diff=Math.min(i-left,right[i]-i);
            max=Math.max(diff,max);
            
        }
        return (int)max;
    }
}