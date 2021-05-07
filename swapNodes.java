class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode left=head;
        ListNode right=head.next;
        ListNode curr=head;
        while(right!=null && left!=null)
        {
            int value=right.val;
        int value2=left.val;
        left.val=value;
            right.val=value2;
            if(right.next==null)
                right=null;
            else
            right=right.next.next;
            
            left=left.next.next;
        }
        
        return curr;
        
    }
}
////////////////////////////////////////////////////////////////////
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
            return head;
       
        
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode curr=dummy;
    while(curr.next!=null && curr.next.next!=null)
    {
        ListNode f=curr.next;
        ListNode s=curr.next.next;
        f.next=s.next;
        curr.next=s;
        curr.next.next=f;
        curr=curr.next.next;
        
    }
        
        
        return dummy.next;
        
    }
}