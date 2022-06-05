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
    public ListNode middleNode(ListNode head) {
        //BruteForce
        if(head==null || head.next==null)
            return head;
        ListNode mid=head.next;
        int count=0;
        ListNode curr=head;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        System.out.println(count);
        int m=1;
         count=count/2;
        while(m<count && curr!=null){
            m++;
          
            curr=curr.next;
              mid=curr.next;
            
        }
        return mid;
    }
}
--------------------------------------------
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
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}