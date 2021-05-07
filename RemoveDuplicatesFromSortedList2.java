class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode l=dummy;
        while(head!=null)
        {
            if(head.next!=null && head.val==head.next.val)
            {
                while(head.next!=null && head.val==head.next.val)
                {
                    head=head.next;
                }
                dummy.next=head.next;
            }
            else
                dummy=dummy.next;
            head=head.next;
        }
        return l.next;
    }
}