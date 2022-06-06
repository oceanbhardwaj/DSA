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
        if(head.next==null && n==1)
            return null;
        int count=0;
        ListNode curr=head;
        while(head!=null){
            count++;
            head=head.next;
        }
        int nodeFromStart=count-n-1;
       // curr=head;
    ListNode ans=curr;
        if(nodeFromStart<0)
            return curr.next;
        while(curr!=null && nodeFromStart>0){
            curr=curr.next;
            nodeFromStart--;
        }
        if(curr.next!=null)
            curr.next=curr.next.next;
        else
        curr.next=null;
        return ans;
    }
}
------------------------------------------------------
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
        ListNode dummy=new ListNode(0);
        if(head.next==null && n==1)return null;
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=0;i<n+1;i++)
            fast=fast.next;
        while(fast!=null)
        {fast=fast.next;
         slow=slow.next;}
        slow.next=slow.next.next;
        return dummy.next;
    }
}