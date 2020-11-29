class Solution {
    HashMap<Integer,Integer> h=new HashMap<>();
    int max=0;
   // int d=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        dfs(root);
        ArrayList<Integer> a=new ArrayList<>();
        for(int i:h.keySet())
        {
            if(h.get(i)==max)
                a.add(i);
        }
        int arr[]=new int[a.size()];
        int d=0;
        for(int j:a)
            arr[d++]=j;
        return arr;
        
        
    }
   
    public int dfs(TreeNode root)
    {
        if(root==null)
        {
           
            return 0;
        }
            
          
        int d=root.val+dfs(root.left)+dfs(root.right);
         h.put(d,h.getOrDefault(d,0)+1);
        max=Math.max(max,h.get(d));
        
        return d;
       
    }
}