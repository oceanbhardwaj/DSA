class Solution {
    int xparent=-1;
    int yparent=-1;
    int d1=0;
    int d2=0;
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null)
            return false;
        dfs(root,0,x,y,-1);
        if(xparent!=yparent && d1==d2)
            return true;
        return false;
        
    }
    public void dfs(TreeNode root,int h,int x,int y,int parent)
    {
        if(root==null)
            return;
        if(root.val==x)
        {
            xparent=parent;
            d1=h;
        }
       else if(root.val==y)
        {
            yparent=parent;
            d2=h;
        }
        
        dfs(root.left,h+1,x,y,root.val);
        dfs(root.right,h+1,x,y,root.val);
    }
        
        
        
        
        
        
        
    
}