class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        if(l1==null && l2==null)
            return null;
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                dummy.next=new ListNode(l1.val);
                l1=l1.next;
                dummy=dummy.next;
            }
            else
               
            {
                dummy.next=new ListNode(l2.val);
                l2=l2.next;
                dummy=dummy.next;
            }
                
            
        }
          while(l1!=null)
            {
                dummy.next=l1;
             l1=l1.next;
              dummy=dummy.next;
              
            }
               
          while(l2!=null)
            {
                 dummy.next=l2;
             l2=l2.next;
              dummy=dummy.next;
              
            }
        return ans.next;
        
        
    }
}