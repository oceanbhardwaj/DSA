/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revList1=l1;
        ListNode revList2=l2;
        if(revList1==null)
            return revList2;
        if(revList2==null)
            return revList1;
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        int first=0;
        int sec=0;
        int carry=0;
        while(revList1!=null || revList2!=null){
            if(revList1==null)
                first=0;
            else
                first=revList1.val;
            if(revList2==null)
                sec=0;
            else
                sec=revList2.val;
            int sum=first+sec+carry;
            if(sum>=10)
            {
                carry=sum/10;
                sum=sum%10;
            }else
                carry=0;
            ans.next=new ListNode(sum);
            ans=ans.next;
            if(revList1!=null)
                revList1=revList1.next;
            if(revList2!=null)
                revList2=revList2.next;
            
        }
        if(carry>0){
            ans.next=new ListNode(carry);
            ans=ans.next;
        }
        return dummy.next;
            
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}