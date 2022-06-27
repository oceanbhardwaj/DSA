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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        boolean flag=false;//left
        if(root==null)
            return res;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> a=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode popped=q.poll();
              
                if(flag){ //right
                      
                      a.add(0,popped.val);
                }else{
                  
                    a.add(popped.val);
                }
                if(popped.left!=null)
                        q.add(popped.left);
                if(popped.right!=null)
                        q.add(popped.right);
            }
            res.add(a);
            flag=!flag;
        }
        return res;
    }
}