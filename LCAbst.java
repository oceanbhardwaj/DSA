 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        ArrayList<TreeNode> path1=new ArrayList<>();
        ArrayList<TreeNode> path2=new ArrayList<>();
        if(!path(root,path1,p) || !path(root,path2,q))
            return null;
        TreeNode ans=null;
        for(int i=0;i<path1.size() && i<path2.size() ;i++)
        {
            if(path1.get(i)==path2.get(i))
                ans=path1.get(i);
        }
        return ans; 
        
    }
    public boolean path(TreeNode root,ArrayList<TreeNode> a,TreeNode n1)
    {
        if(root==null)
            return false;
        a.add(root);
        if(root.val==n1.val)
            return true;
        if(path(root.left,a,n1) || path(root.right,a,n1))
            return true;
        a.remove(a.size()-1);
        return false;
        
        
        
        
        
    }
}
////////////////////////////////////////////////////
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;
        if(root.val==p.val || root.val==q.val)
            return root;
        
        TreeNode lca1=lowestCommonAncestor(root.left,p,q);
        TreeNode lca2=lowestCommonAncestor(root.right,p,q);
        if(lca1!=null && lca2!=null)
            return root;
        if(lca1!=null)
            return lca1;
        else
            return lca2;
            
    }
}