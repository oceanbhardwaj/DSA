class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode head1=l1;
         ListNode head2=l2;
     ListNode ans=new ListNode(1);
        ListNode dummy=ans;
        int carry=0;
       while(head1!=null || head2!=null)
       {
            if(head1==null)
                head1=new ListNode(0);
           else if(head2==null)
               head2=new ListNode(0);
           
           int sum=head1.val+head2.val+carry;
          carry=sum/10;
               sum=sum%10;
               ans.next=new ListNode(sum);
           ans=ans.next;
           
           head1=head1.next;
           head2=head2.next;
           
          
               
               
           
           
           
           
           
           
       }
        if(carry>0)
            ans.next=new ListNode(carry);
        return dummy.next;
        
        
        
        
        
        
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
             prev=curr;
            curr=next;
           
        }
        return prev;
    }
}