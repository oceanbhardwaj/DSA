public class Solution {
    public boolean hasCycle(ListNode head) {
        //method-1 //hair and tortoise (floyd finding algo)
        /*ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;*/
        
        //method-2  recursion
        if(head==null || head.next==null)
            return false;
        if(head.next==head)
            return true;
        ListNode next=head.next;
        head.next=head;
        boolean isCycle=hasCycle(next);
        return isCycle;
        
    }
}