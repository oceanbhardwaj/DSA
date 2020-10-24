.............................................................using level order traversal...........................................................................................

class Tree
{
    int countLeaves(Node node) 
    {
         int count=0;
         Queue<Node> q=new LinkedList<>();
         q.add(node);
         while(!q.isEmpty())
         {
             Node n=q.poll();
             if(n.left==null && n.right==null)
             count++;
             if(n.left!=null)
             q.add(n.left);
             if(n.right!=null)
             q.add(n.right);
         }
         return count;
          
    }
}
......................................................................................using Recusrion.........................................................................................
class Tree
{
    int countLeaves(Node node) 
    {
        if(node==null)
        return 0;
        if(node.left==null && node.right==null)
        return 1;
        return countLeaves(node.left)+countLeaves(node.right);
       
    }
}
