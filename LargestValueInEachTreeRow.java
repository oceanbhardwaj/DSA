 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>a =new ArrayList<>();
        if(root==null)
            return a;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty())
        { max=Integer.MIN_VALUE;
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                max=Math.max(max,curr.val);
                
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
                
                
                
                
            }
            a.add(max);
        }
        return a;
        
    }
}
//....................................................................................................
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>a =new ArrayList<>();
        int ans=0;
        helper(root,a,ans);
        return a;
        
    }
    public void helper(TreeNode root,List<Integer> a,int ans)
    {
        if(root==null)
            return;
        if(ans==a.size())
            a.add(root.val);
        else
            a.set(ans,Math.max(a.get(ans),root.val));
        helper(root.left,a,ans+1);
        helper(root.right,a,ans+1);
        
        
        
        
    }
        
        
        
        
        
        
        
        
        
        
    
}