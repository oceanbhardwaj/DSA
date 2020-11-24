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
}