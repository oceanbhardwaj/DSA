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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        ListNode curr=head;
        int count=0;
        while(curr!=null)
        {
            count++;
            curr=curr.next;
        }
        if(count==1 && n==1)
            return null;
        
        int nodeFromStart=count-n+1;
        if(nodeFromStart==1)
            return head.next;
        curr=head;
        int c=0;
        ListNode prev=null;
        ListNode nextNode=null;
        curr=head;
        while(curr!=null){
           c++;
            prev=curr;
            if(curr.next==null){
            nextNode=null;
                break;
            }
            nextNode=curr.next.next;
            curr=curr.next;
            if(c==nodeFromStart-1)
                break;
        }
        prev.next=nextNode;
        return head;
    }
}