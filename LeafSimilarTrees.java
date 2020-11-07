class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        DFS(root1,a1);
        DFS(root2,a2);
        return a1.equals(a2);
    }
    public void DFS(TreeNode root,ArrayList<Integer> a)
    {
       
        if(root==null)
            return;
        DFS(root.left,a);
        if(root.left==null && root.right==null)
        a.add(root.val);
        DFS(root.right,a);
        
        
        
        
        
        
    }
}