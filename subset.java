class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
       subset(ans,nums,0,new ArrayList<Integer>());
        Comparator co=new Comparator<List<Integer>>(){
            public int compare(List<Integer> a1,List<Integer> a2){
                int n=Math.min(a1.size(),a2.size());
                for(int i=0;i<n;i++){
                    if(a1.get(i)==a2.get(i))
                        continue;
                    else
                        return a1.get(i)-a2.get(i);
                }
                return 1;
            }
        };
        Collections.sort(ans,co);
        return ans;
    }
     public  void subset(List<List<Integer>> ans,int nums[],int start,ArrayList<Integer> list){
        if(start>=nums.length)
        {
            ans.add(list);
            return;
        }
       subset(ans,nums,start+1,new ArrayList<Integer>(list));
       list.add(nums[start]);
       subset(ans,nums,start+1,new ArrayList<Integer>(list));
       return;
    }
}