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
        int first=0;
        int actFirst=0;
        int sec=0;
        int max=0;
        int second=0;
        while(!q.isEmpty()){
            first=q.peek().getValue();
            actFirst=first;
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer> pair=q.poll();
                TreeNode node=pair.getKey();
                second=pair.getValue();
                 sec=pair.getValue()-actFirst;
                if(node.left!=null){
                    q.add(new Pair(node.left,2*sec+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,2*sec+2));
                }
                
            }
            max=Math.max(second-first+1,max);
        }
        return max;
    }
}