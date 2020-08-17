class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> h=new HashSet<Integer>();
        int ans=-1;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            h.add(arr[i]);
        }
        
        for(int i=1;i<=1000000;i++)
        {
            if(!h.contains(i))
                count++;
            if(count==k)
            {ans=i;
            break;}
        }
        return ans;
    }
}