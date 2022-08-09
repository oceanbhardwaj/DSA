class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int d=nums.length;
        int n=1<<d;
        for(int i=0;i<n;i++){
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j))!=0)
                    a.add(nums[j]);
            }
            ans.add(a);
        }
        return ans;
    }
}