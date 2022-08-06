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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
          if(root==null)
            return ans;
       // ans.add(root.val);
      Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             int size=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                 TreeNode p=q.poll();
                max=Math.max(p.val,max);
                if(p.left!=null)
                    q.add(p.left);
                if(p.right!=null)
                    q.add(p.right);
            }
            ans.add(max);
           
           
        }
        return ans;
    }
}