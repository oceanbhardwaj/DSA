class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode curr=head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        int p=count-n;
        curr=head;
        ListNode dummy=new ListNode(0);
      dummy.next=head;
        ListNode ans=head;
    
     curr=dummy;
        while(p>0)
        {
            curr=curr.next;
            p--;
            
        }
       
       curr.next=curr.next.next;
        
        return dummy.next;
        
    }
}
/////////////////////////////////////////////////////////
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<n+1;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
        
    }
}