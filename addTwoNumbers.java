/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 Method 1 TC-O(MAX(M,N))    SC-MAX(O(M,N))+1
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(1);
        ListNode dummyOne=dummy;
        int count=0;
        int first=0;
        int sec=0;
        int sum=0;
        int carry=0;
        
        while(l1!=null || l2!=null){
            first=(l1==null)?0:l1.val;
            sec=(l2==null)?0:l2.val;
           sum= first+sec+carry;
            dummy.next=new ListNode(sum%10);
            dummy=dummy.next;
            carry=sum/10;
            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
            
            
                
                 
        
        
        
        }
        if(carry!=0)
            dummy.next=new ListNode(carry); 
        return dummyOne.next;
        
    }
}