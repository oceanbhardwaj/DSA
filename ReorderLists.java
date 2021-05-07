class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return;
        int count=0;
        ListNode curr=head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        int d=count/2;
        curr=head;
        ListNode left=curr;
        ListNode right=head;
        ListNode p=null;
        for(int i=1;i<=d;i++)
        {
            p=curr;
            curr=curr.next;
        }
        p.next=null;
        
        right=curr;
        right=reverse(right);
        boolean flag=true;
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(left!=null || right!=null)
        {
            while(left!=null && right!=null)
            {
                if(flag)
                {
                    dummy.next=left;
                    left=left.next;
                    flag=false;
                }
                else
                {
                    flag=true;
                    dummy.next=right;
                    right=right.next;
                }
                dummy=dummy.next;
            }
            if(right!=null)
            {
                dummy.next=right;
                right=null;
            }
        }
        
        
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode c=head;
        ListNode next=null;
        while(head!=null)
        {
            next=head.next;
            head.next=prev;
            prev=head;
           head=next;
        }
        return prev;
    }
}