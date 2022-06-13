/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Stack<Node> s=new Stack<>();
        Node curr=head;
        Node next=null;
        Node prev=null;
        Node child=null;
      //  Node ans=new Node(0);
        Node dummy=curr;
        while(curr!=null){
            prev=curr;
            child=curr.child;
            next=curr.next;
            if(next!=null && child!=null){
                s.push(next);
                curr.next.prev=null;
            }
            if(child!=null)
            {curr.next=child;
            curr.next.prev=prev;
            curr.child=null;}
            //if(curr.next!=null)
            curr=curr.next;
            
        }
        curr=prev;
        while(!s.isEmpty()){
            prev=curr;
            Node temp=s.pop();
            curr.next=temp;
            curr.next.prev=prev;
            while(curr.next!=null)
                curr=curr.next;
        }
        return dummy;
    }
}