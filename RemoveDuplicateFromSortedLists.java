class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        ListNode prev=head;
        ListNode curr=head.next;
        ListNode dummy=prev;
        ListNode ans=dummy;
        while(curr!=null)
        {
            if(prev.val!=curr.val)
            {
                prev.next=curr;
                prev=prev.next;
                prev=curr;
                curr=prev.next;
            }
            else
            {
                curr=curr.next;
            }
        }
        prev.next=curr;
        
      
        
        return dummy;
        
        
        
        
        
        
        
    }
}