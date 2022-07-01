/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> a1=new ArrayList<>();
         ArrayList<TreeNode> a2=new ArrayList<>();
        if(root.val==p.val || root.val==q.val)
            return root;
        if(lca(root,a1,p)==false || lca(root,a2,q)==false)
            return null;
        for(TreeNode i:a1)
        System.out.println(i.val);
        for(TreeNode i:a2)
        System.out.println(i.val);
            TreeNode ans=null;
        for(int i=0;i<a1.size()-1 && i<a2.size()-1;i++){
            if(a1.get(i+1)!=a2.get(i+1))
                return a1.get(i);
            ans=a1.get(i+1);
        }
        return ans;
    }
    public boolean lca(TreeNode root,ArrayList<TreeNode>a1,TreeNode p){
        if(root==null)
            return false;
         a1.add(root);
        if(root.val==p.val)
            return true;
       
        if(lca(root.left,a1,p)|| lca(root.right,a1,p))
            return true;
        a1.remove(a1.size()-1);
        return false;
    }
}