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
    public TreeNode reverseOddLevels(TreeNode root) {
        int count=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            TreeNode arr[]=new TreeNode[size];
            for(int i=0;i<size;i++){
                TreeNode popped=q.poll();
                arr[i]=popped;
                if(popped.left!=null)
                    q.add(popped.left);
                if(popped.right!=null)
                    q.add(popped.right);
            }
           if(count%2==1){
               //reverse array
              int low=0;
               int high=size-1;
               while(low<high)
               {
                   int temp=arr[low].val;
                   arr[low].val=arr[high].val;
                   arr[high].val=temp;
                   low++;
                   high--;
               }
               
            
           }
            count++;
        }
        return root;
    }
}