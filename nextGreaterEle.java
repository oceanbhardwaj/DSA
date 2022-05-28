class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[nums2.length];
        Arrays.fill(ans,-1);
        int n=nums2.length;
        s.push(nums2[n-1]);
        for(int i=n-2;i>=0;i--){
            if(!s.isEmpty() ){
                while(!s.isEmpty() && s.peek()<nums2[i]){
                    s.pop();
                }
               
            }
            if(s.isEmpty())
                ans[i]=-1;
            else
                ans[i]=s.peek();
            
            s.push(nums2[i]);
        }
        int res[]=new int[nums1.length];
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            int index=h.get(nums1[i]);
            res[i]=ans[index];
        }
        return res;
    }
}