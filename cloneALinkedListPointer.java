/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return head;
        Node curr=head;
        Node ans=head;
        Node next=null;
        //making new Node copy
        while(curr!=null){
            next=curr.next;
            curr.next=new Node(curr.val);
            curr=curr.next;
            curr.next=next;
            curr=next;
            
        }
        curr=head;
        //making random pointers
        while(curr!=null){
            if(curr.next!=null){
            Node r=curr.random;
            curr.next.random=((r)!= null)?r.next:null;
                
            }
            curr=curr.next.next;
            
        }
        
        //seperating nodes 
        curr=head;
        Node org=curr;
        ans=head.next;
        Node newList=ans;
        while(curr!=null){
          curr.next=curr.next.next;
            ans.next=(ans.next!=null)?ans.next.next:ans.next;
             curr=curr.next;
            ans=ans.next;
        }
        return newList;
        
    }
}