class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums1.length;i++){
            sum1+=nums1[i];
            sum2+=nums2[i];
        }
        int diff1[]=new int [nums1.length];
          int diff2[]=new int [nums1.length];
        for(int i=0;i<nums1.length;i++){
          diff1[i]=nums1[i]-nums2[i];
            diff2[i]=nums2[i]-nums1[i];
        }
      
     int ans1= kedanesAlgo(diff1);
        int ans2=kedanesAlgo(diff2);
        System.out.println(ans1);
        System.out.println(ans2);
        return Math.max(sum1+ans2,sum2+ans1);
        
    }
    public int kedanesAlgo(int nums1[]){
          //apply kadanes algo
        int msf=nums1[0];
        int meh=nums1[0];
        for(int i=1;i<nums1.length;i++){
            meh=meh+nums1[i];
            if(meh<nums1[i]){
                meh=nums1[i];
            }
            msf=Math.max(msf,meh);
        }
        //System.out.println(msf);
        return msf;
    }
}