.............................................................................................recursion................................................................................................
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
       if(s==null)
           return false;
        else if(isSameTree(s,t))
            return true;
        else 
            return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    public boolean isSameTree(TreeNode s,TreeNode t)
    {
        if(s==null && t==null)
            return true;
        if(s==null || t==null)
            return false;
        return s.val==t.val && isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
    }
        
}       
 ...................................................................................preorder................................................................................................................     
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        StringBuffer sb=new StringBuffer();
        String s1=PreOrder(s,sb);
        StringBuffer sb1=new StringBuffer();
        String s2=PreOrder(t,sb1);
        if(s1.contains(s2))
            return true;
        return false;
        
    }
    public String PreOrder(TreeNode s1,StringBuffer sb)
    {
        Stack<TreeNode> s=new Stack<>();
        s.add(s1);
        while(!s.isEmpty())
        {
            TreeNode curr=s.pop();
            if(curr==null)
                sb.append("#");
            else
                sb.append(","+curr.val);
            if(curr!=null)
            {
                s.add(curr.right);
                s.add(curr.left);
            }
        }   
            
          return sb.toString();  
            
            
            
        
        
    }
        
        
        
        
        
        
    
}
        
        
        
        
    
