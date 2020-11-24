...............................................................................................................................BFS..........................................................................................................
class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Node curr=root;
        
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
             Node c=q.poll();
                if(i==size-1)
                    c.next=null;
                else
                    c.next=q.peek();
                if(c.left!=null)
                    q.add(c.left);
                if(c.right!=null)
                    q.add(c.right);
            
            
            }
            
            
            
        }
        return curr;
        
    }
}*/



..........................................................................................o(1)space......................................................................................................................................
class Solution {
    public Node connect(Node root) {
        Node c=root;
   while(root!=null)
   {
       Node n=new Node(0);
       Node curr=n;
       while(root!=null)
       {
           if(root.left!=null)
           {curr.next=root.left;
            curr=curr.next;}
           if(root.right!=null)
           {
               curr.next=root.right;
               curr=curr.next;
           }
           root=root.next;
           
       }
       root=n.next;
   }
     return  c;  
            
    }
}

