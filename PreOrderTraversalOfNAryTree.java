class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> a=new ArrayList<>();
        dfs(root,a);
        return a;
        
        
    }
    public void dfs(Node root,List<Integer> a)
    {
        if(root==null)
            return;
        a.add(root.val);
        for(Node node:root.children)
            dfs(node,a);
    }
}