class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        ListNode n=new ListNode(0);
        ListNode n1=n;
        while(l1!=null || l2!=null)
        {
            int a=(l1!=null)?l1.val:0;
            int b=(l2!=null)?l2.val:0;
            
            sum=a+b+carry;
            carry=sum/10;
            sum=sum%10;
            n1.next=new ListNode(sum);
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            n1=n1.next;
            
            
            
        }
        if(carry>0)
            n1.next=new ListNode(carry);
        
        return n.next;
        
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack();
        while(l1!=null)
        {
            s1.push(l1.val);
            l1=l1.next;
        }
         while(l2!=null)
        {
            s2.push(l2.val);
            l2=l2.next;
        }
        ListNode n=null;
       ListNode head=null;
        int sum=0;
        int carry=0;
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            int a=(!s1.isEmpty())?s1.pop():0;
             int b=(!s2.isEmpty())?s2.pop():0;
             sum=a+b+carry;
            carry=sum/10;
            sum=sum%10;
             head=new ListNode(sum);
           head.next=n;
            n=head;
            
                
        }
        if(carry>0)
        {head=new ListNode(carry);
         head.next=n;
         n=head;}
        
        
        
        
        
        
        return n;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
