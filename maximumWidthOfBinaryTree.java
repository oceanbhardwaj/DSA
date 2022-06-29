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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        Queue<Pair<TreeNode,Integer>> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int max=1;
        int first=0;
        int sec=0;
        while(!q.isEmpty()){
            
             first=q.peek().getValue();
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer> popped=q.poll();
                TreeNode node=popped.getKey();
                 sec=popped.getValue();
                if(node.left!=null){
                    q.add(new Pair(node.left,2*(sec)+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,2*(sec)+2));
                }
            }
            max=Math.max(max,sec-first+1);
        }
        return max;
    }
}