class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null)
            return head;
        int count=0;
        ListNode curr=head;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        if(k==count || k%count==0)
            return head;
        k=k%count;
        int diff=count-k;
       
        curr=head;
        ListNode ans=curr;
        ListNode con=null;
        ListNode prev=null;
        while(diff>0)
        {
            prev=curr;
            curr=curr.next;
            diff--;
        }
        prev.next=null;
        head=curr;
        con=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=ans;
        return head;
        
        
    }
}