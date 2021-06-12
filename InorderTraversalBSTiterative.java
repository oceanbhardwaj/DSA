class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	public Node inorderSuccessor(Node root,Node x)
         {
          return iterative(root,x);
         }
         
        public Node iterative(Node root,Node x)
     {
         Node temp=null;
         if(root==null)
         return temp;
         Stack<Node> s=new Stack<>();
         //s.push(root);
         while(!s.isEmpty() || root!=null)
         {
             while(root!=null)
             { s.push(root);
                 root=root.left;
             }
             Node curr=s.pop();
             if(curr.data>x.data)
             {
                 temp=curr;
                 break;
             }
             root=curr.right;
         }
         return temp;
     }
         
         
         
         
         
         
}