class Solution
{
    
    ArrayList<Integer> a=new ArrayList<>();
    int count=0;
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
            dfsInorder(root,x);
            int index=a.indexOf(x.data);
            if(index==a.size()-1)
            return null;
            return new Node(a.get(index+1));
         }
         public void dfsInorder(Node root,Node x)
         {
             if(root==null)
             return ;
             
             
             dfsInorder(root.left,x);
             a.add(root.data);
             dfsInorder(root.right,x);
             
             
             
         }
         
          
          
          
          
          
          
          
          
          
          
         
}