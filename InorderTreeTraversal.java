
 Method -1 : Recursive  timeC=o(n)
 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<Integer>();
        if(root==null)
            return a;
        PreOrder(root,a);
        return a;
    }
    public void PreOrder(TreeNode root,List<Integer> a){
        if(root==null)
            return;
        a.add(root.val);
        PreOrder(root.left,a);
        PreOrder(root.right,a);
    }
}
----------------------------------------------------
Method 2 :iterative o(N)  o(N) space
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<>();
        if(root==null)
            return a;
        Stack<TreeNode> s=new Stack<>();
        while(!s.isEmpty() || root!=null){
            while(root!=null){
              s.push(root);
                a.add(root.val);
                root=root.left;
            }
            TreeNode poppedEle=s.pop();
            root=poppedEle.right;
        }
        return a;
    }
}