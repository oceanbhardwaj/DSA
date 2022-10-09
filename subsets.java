class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
         
        helper(nums,0,new ArrayList<Integer>(),res);
        return res;
    }
    public void helper(int nums[],int start,ArrayList<Integer> ans,List<List<Integer>> res){
        if(start>=nums.length)
        {
            res.add(ans);
            return;
        }
        helper(nums,start+1,new ArrayList<Integer>(ans),res);
        ans.add(nums[start]);
        helper(nums,start+1,new ArrayList<Integer>(ans),res);
        
        
        
    }
}
------------------------------------------------------------------------------------------------------------
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int d=1<<(nums.length);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<d;i++){
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i&(1<<j))!=0)
                   // if(((i>>j)&1)!=0)
                    a.add(nums[j]);
            }
            res.add(a);
        }
        return res;
    }
}