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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
        call(root,p,k);
        return p.peek();
    }
    public void call(TreeNode root,PriorityQueue<Integer> p,int k){
        if(root==null)
            return ;
       p.add(root.val);
        if(p.size()>k)
            p.poll();
        call(root.left,p,k);
        call(root.right,p,k);
        
        
    }
}

----------------------------------------------
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
    public int kthSmallest(TreeNode root, int k) {
       //inorder traversal
        int count=0;
        Stack<TreeNode> s=new Stack<>();
      
        while(!s.isEmpty() || root!=null){
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            TreeNode popped=s.pop();
            count++;
            if(count==k)
                return popped.val;
            root=popped.right;
        }
        return -1;
    }
}