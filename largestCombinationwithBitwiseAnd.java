class Solution {
    public int largestCombination(int[] a) {
        int maxsetbit[]=new int[32];
        for(int i=0;i<a.length;i++)
        {
            int lastbit=31;
            while(a[i]>0){
                if((a[i]&1)!=0)//set
                {
                    maxsetbit[lastbit]++;
                }
                lastbit--;
                a[i]=a[i]>>1;
            }
        }
        int max=0;
        for(int i=0;i<maxsetbit.length;i++){
            max=Math.max(maxsetbit[i],max);
        }
        return max;
    }
}