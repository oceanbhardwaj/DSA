class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //method1 -TC(O(m+n)logn)  O(m+n)
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:nums1)
        {
            a.add(i);
        }
        for(int j:nums2){
            a.add(j);
        }
        Collections.sort(a);
        if(a.size()%2==0){
            return (double)((double)(a.get(a.size()/2)+a.get((a.size()/2)-1))/2);
                            
        }else
         return (double)(a.get(a.size()/2));
    }
}
-----------------------------------------------------------------------------
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //method 2 TC o(m+n) o(m+n)
        int arr[]=new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int index=0;
        while(i<nums1.length || j<nums2.length){
            while(i<nums1.length && j<nums2.length){
                if(nums1[i]<nums2[j]){
                  arr[index++]=nums1[i++];   
                }else{
                    arr[index++]=nums2[j++];
                }
            }
            while(i<nums1.length){
             arr[index++]=nums1[i++];   
            }
            while(j<nums2.length){
                arr[index++]=nums2[j++];
            }
            
        }
         if(arr.length%2==0){
            return (double)((double)(arr[(arr.length/2)]+arr[(arr.length/2)-1])/2);
                            
        }else
         return (double)(arr[arr.length/2]);
        
    }
}
