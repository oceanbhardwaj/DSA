class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       //using bits manipulation
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        int total=1<<n;
        for(int i=0;i<total;i++){
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
              if((i &(1<<j))!=0)
                  a.add(nums[j]);
            
            }
            res.add(a);
        }
        return res;
    }
}