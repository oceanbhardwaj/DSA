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
    public boolean isCousins(TreeNode root, int x, int y) {
        HashMap<Integer,Integer> level=new HashMap<>();
         HashMap<Integer,Integer> parent=new HashMap<>();
        helper(level,parent,root,1,new TreeNode(-1));
       
        return parent.get(x)!=parent.get(y) && level.get(x)==level.get(y);
        
    }
    public void helper( HashMap<Integer,Integer> level,HashMap<Integer,Integer> parent,TreeNode root,int count,TreeNode p){
        if(root==null)
            return;
        level.put(root.val,count);
        parent.put(root.val,p.val);
        helper(level,parent,root.left,count+1,root);
        helper(level,parent,root.right,count+1,root);
        
    }
}
------------------------------------------------------------------------------------------------------
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
    
    int parentX=-1;
    int parentY=-1;
    int heightX=0;
    int heightY=0;
    public boolean isCousins(TreeNode root, int x, int y) {
       dfs(root,x,y,0,-1);
        if(parentX!=parentY && heightX==heightY)//same level but different parent
        {
            return true;
        }
        return false;
    }
    public void dfs(TreeNode root,int x,int y,int count,int parent){
        if(root==null)
            return;
        if(root.val==x){
            parentX=parent;
            heightX=count;
        }
        if(root.val==y)
        {
            parentY=parent;
            heightY=count;
        }
        dfs(root.left,x,y,count+1,root.val);
        dfs(root.right,x,y,count+1,root.val);
      
    }
}
---------------------------------------------------------------------------------------------------
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
    class Pair{
        int height;
        int parent;
        public Pair(int height,int parent){
            this.height=height;
            this.parent=parent;
        }
    }
    HashMap<Integer,Pair> h=new HashMap<>();
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,x,y,-1,0);
        if(h.get(x).height==h.get(y).height && h.get(x).parent!=h.get(y).parent)
            return true;
        return false;
    }
    
    public void dfs(TreeNode root,int x,int y,int parent,int count){
        if(root==null)
            return;
        
        h.put(root.val,new Pair(count,parent));
        dfs(root.left,x,y,root.val,count+1);
        dfs(root.right,x,y,root.val,count+1);
        
        
    }
}