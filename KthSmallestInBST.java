class Solution {
    public int kthSmallest(TreeNode root, int k) {
    ArrayList<Integer> a=new ArrayList<>();
        dfs(root,a);
        return a.get(k-1);
    }
    public void dfs(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null)
            return;
        dfs(root.left,a);
        a.add(root.val);
        dfs(root.right,a);
        
    }
    
    
}
//////////////////////////////////////////////////////
class Solution {
    TreeNode c=null;
    public int kthSmallest(TreeNode root, int k) {
   Stack<TreeNode> s=new Stack<>();
        //s.add(root);
        int ans=0;
        while(!s.isEmpty() || root!=null)
        {
            while(root!=null)
            {
             s.push(root);
                root=root.left;
            
            }
            TreeNode c=s.pop();
            k--;
            if(k==0)
            {
                ans= c.val;
                break;
            }
            if(k==0)
                break;
            root=c.right;
        }
        return ans;
    
    
}
}