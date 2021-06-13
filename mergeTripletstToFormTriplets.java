class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int max1=0;
        int max2=0;
        int max3=0;
        for(int a[]:triplets)
        {
            int x=target[0];
            int y=target[1];
            int z=target[2];
            if(x<a[0] || y<a[1] || z<a[2])
                continue;
            else
            {
              max1=Math.max(max1,a[0]);
                max2=Math.max(max2,a[1]);
                max3=Math.max(max3,a[2]);
            }
        }
        return max1==target[0] && max2==target[1] && target[2]==max3;
        
    }
}