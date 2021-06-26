class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n1 && j<n2)
        {
            if(nums1[i]==nums2[j])
            {
                if(!a.contains(nums1[i])){
                    a.add(nums1[i]);
                    
                }
                i++;
                    j++;
            }
            else if(nums1[i]<nums2[j])
                i++;
            else 
                j++;
        }
        
        int arr[]=new int[a.size()];
        int index=0;
        for(int j1:a)
            arr[index++]=j1;
        
        return arr;
    }
}