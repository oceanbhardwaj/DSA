class Solution {
    public int smallestRangeI(int[] A, int k) {
        int min=A[0];
        int max=A[0];
        for(int i=1;i<A.length;i++)
        {
            min=Math.min(A[i],min);
            max=Math.max(A[i],max);
            
        }
        return Math.max(0,(max-k)-(min+k));
        
    }
}