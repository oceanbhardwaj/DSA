class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)
            return head;
        ListNode prev=null;
        ListNode curr=head;
        while(left>1)
        {
            prev=curr;
            curr=curr.next;
            left--;
            right--;
        }
        ListNode connection=prev;
    ListNode tail=curr;
        while(right>0)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            right--;
        }
        if(connection!=null)
            connection.next=prev;
        else
            head=prev;
        
        tail.next=curr;
        
        return head;
        
    }
}