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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        //finding middle
        ListNode ans=head;
        ListNode slow=head;
        ListNode fast=slow;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode sec=reverse(slow);
        while(sec!=null && ans!=null){
            if(sec.val!=ans.val)
                return false;
            
            sec=sec.next;
            ans=ans.next;
        }
        return true;
    }
    public ListNode reverse(ListNode Node){
        ListNode prev=null;
        ListNode next=null;
        while(Node !=null){
            next=Node.next;
            Node.next=prev;
            prev=Node;
            Node=next;
        }
        return prev;
    }
}