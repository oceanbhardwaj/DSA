/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null && q!=null) ||(q==null && p!=null))
            return false;
           if(p==null && q==null)
           return true;
           if(p.val!=q.val)
           return false;
           return isSameTree(p.left,q.left)  && isSameTree(p.right,q.right);
    }
}
--------------------------------------------------------------------------------
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        //Iterative
        Queue<TreeNode> q1=new LinkedList<>();
         Queue<TreeNode> q2=new LinkedList<>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode pop1=q1.poll();
            TreeNode pop2=q2.poll();
            if(pop1.val!=pop2.val)
                return false;
            
            if(pop1.left!=null && pop2.left!=null )
            {q1.add(pop1.left);
             q2.add(pop2.left);
            }
         else if((pop1.left==null  && pop2.left!=null) ||(pop1.left!=null && pop2.left==null))
              return false;
           
        
        if(pop2.right!=null && pop1.right!=null) 
        { q1.add(pop1.right);
       
            q2.add(pop2.right);
        }
         else   if((pop1.right==null && pop2.right!=null) ||(pop1.right!=null && pop2.right==null))
              return false;
            
            
        
        
    }
        return q1.isEmpty() && q2.isEmpty()?true:false;
}
}
