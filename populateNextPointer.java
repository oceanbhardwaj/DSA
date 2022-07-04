/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
       if(root==null)
           return root;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Node popped=q.poll();
                if(i==size-1)
                    popped.next=null;
                else
                    popped.next=q.peek();
                if(popped.left!=null)
                    q.add(popped.left);
                if(popped.right!=null)
                    q.add(popped.right);
            }
        }
        return root;
        
        
        
        
        
        
        
        
    }
}