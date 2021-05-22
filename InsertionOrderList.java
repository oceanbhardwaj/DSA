class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        //find middle
        ListNode slow=head;
        ListNode prev=null;
        ListNode fast=head;
        while(fast!=null  && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        //slow is middle
        prev.next=null;
        ListNode left=insertionSortList(head);
        ListNode right=insertionSortList(slow);
        return Merge(left,right);
        
        
    }
    public ListNode Merge(ListNode left ,ListNode right)
    {
        if(left==null && right==null)
            return null;
        if(left==null)
            return right;
        if(right==null)
            return left;
        
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(left!=null || right!=null)
        {
            while(left!=null && right!=null)
            {
                if(left.val<right.val)
                {
                    ans.next=left;
                   left=left.next;
                }
                else
                {
                    ans.next=right;
                    right=right.next;
                }
                ans=ans.next;
            }
            if(left!=null)
            {
                ans.next=left;
                left=null;
            }
             if(right!=null)
            {
                ans.next=right;
                right=null;
            }
           
        }
        return dummy.next;
        
    }
    
}