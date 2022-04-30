class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        subsetsUsingRecursion(nums, 0,new ArrayList<Integer>(),res);
        return res;
    }
    public void subsetsUsingRecursion(int nums[],int i,ArrayList<Integer> a, List<List<Integer>> res){
   if(i>=nums.length){
       res.add(a);
       return;
   } 
        ArrayList<Integer> newList=new ArrayList<>(a);
        //taking
        a.add(nums[i]);
        subsetsUsingRecursion(nums,i+1,newList,res);
        
        
        //not taking
        subsetsUsingRecursion(nums,i+1,a,res);
    
    
    
    }
}