//BRUTE FORCE
O(M+N)TIME O(M+N)SPACE

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        int arr[]=new int[n+m];
        int count=0;
        int i=0;
        int j=0;
        while(i<m || j<n){
            while(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    arr[count++]=nums1[i++];
                }else{
                    arr[count++]=nums2[j++];
                }
            }
            while(i<m){
                arr[count++]=nums1[i++];
            }
            while(j<n){
                arr[count++]=nums2[j++];
            }
        }
         i=0; j=0;
        count=0;
        for( i=0;i<nums1.length;i++){
            nums1[i]=arr[count++];
        }
        
        
    }
}