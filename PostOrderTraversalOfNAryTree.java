class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> a=new ArrayList<>();
        dfs(root,a);
        return a;
        
    }
    public void dfs(Node root,List<Integer> a)
    {
        if(root==null)
            return;
        for(Node node:root.children)
            dfs(node,a);
        a.add(root.val);
    }
}