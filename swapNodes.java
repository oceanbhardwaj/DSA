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
    public ListNode swapPairs(ListNode head) {
        ListNode ans=head;
        while(head!=null && head.next!=null){
            int first=head.val;
            int sec=head.next.val;
            head.val=sec;
            head.next.val=first;
            head=head.next.next;
        }
        return ans;
    }
}
--------------------------------
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
    public ListNode swapPairs(ListNode head) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode curr=temp;
        while(curr.next!=null && curr.next.next!=null){
            ListNode first=curr.next;
            ListNode sec=curr.next.next;
            first.next=sec.next;
            curr.next=sec;
            curr.next.next=first;
            curr=curr.next.next;
        }
        return temp.next;
    }
}