class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h=new HashSet<>();
         HashSet<Integer> h1=new HashSet<>();
        for(int i:nums1)
            h.add(i);
        
        for(int i:nums2)
        {
            if(h.contains(i))
                h1.add(i);
        }
        int arr[]=new int[h1.size()];
        int index=0;
        for(int i:h1)
            arr[index++]=i;
        
        return arr;
    }
}