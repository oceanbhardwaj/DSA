class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode curr=head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        curr=head;
        for(int i=0;i<count/2;i++)
        {
            curr=curr.next;
        }
        return curr;
    }
}
///////////////////////////////////////////////////////
class Solution {
    public ListNode middleNode(ListNode head) {
      if(head==null || head.next==null)
          return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}