class BSTIterator {
  PriorityQueue<Integer> pq;
    public BSTIterator(TreeNode root) {
        pq=new PriorityQueue<>();
        dfs(root,pq);
        
    }
    
   //  @return the next smallest number 
    public int next() {
        return pq.poll();
        
    }
    
    // @return whether we have a next smallest number 
    public boolean hasNext() {
        if(!pq.isEmpty())
            return true;
        return false;
        
    }
    public void dfs(TreeNode root,PriorityQueue<Integer>pq)
    {
        if(root==null)
            return;
        pq.add(root.val);
        dfs(root.left,pq);
        dfs(root.right,pq);
    }
}*/

//...............................................................
/*class bstiterator{
  ArrayList<Integer> pq;
    int index=0;
    public BSTIterator(TreeNode root) {
        pq=new ArrayList<>();
        dfs(root,pq);
        
    }
    
   
    public int next() {
        return pq.get(index++);
        
    }
    
    //* @return whether we have a next smallest number 
    public boolean hasNext() {
        if(pq.size()>index)
            return true;
        return false;
        
    }
    public void dfs(TreeNode root,ArrayList<Integer>pq)
    {
        if(root==null)
            return;
         dfs(root.left,pq);
        pq.add(root.val);
       
        dfs(root.right,pq);
    }
}*/

 //................................................................................
class BSTIterator {
  Stack<TreeNode> s;
    public BSTIterator(TreeNode root) {
        s=new Stack<>();
       pushAll(root);
        
    }
    
   //  @return the next smallest number 
    public int next() {
      TreeNode d=s.pop();
       pushAll(d.right);
        return d.val;
        
    }
    
    // @return whether we have a next smallest number 
    public boolean hasNext() {
        if(!s.isEmpty())
            return true;
        return false;
        
    }
    public void pushAll(TreeNode root)
    {
        while(root!=null)
        {  s.push(root);
        root=root.left;}
    }
    
}














