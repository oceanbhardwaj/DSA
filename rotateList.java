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
    public ListNode rotateRight(ListNode head, int k) {
        int count=0;
        if(head==null || head.next==null)
            return head;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        k=k%count;
        if(k==0)
            return head;
        int d=(count-k)%count;
        ListNode prev=null;
        curr=head;
        ListNode temp=curr;
        while(curr!=null && d>0){
            prev=curr;
            curr=curr.next;
            d--;
            
        }
        prev.next=null;
        ListNode ans=curr;
        while(curr.next!=null)
            curr=curr.next;
        curr.next=temp;
        return ans;
        
    }
}
-----------------------------------------
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
    public ListNode rotateRight(ListNode head, int k) {
        //making circular linked list
        if(head==null || head.next==null)
            return head;
        ListNode curr=head;
        int count=1;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }
        curr.next=head;
        int d=count-(k%count);
        while(d>0){
            d--;
            curr=curr.next;
        }
        ListNode ans=curr.next;
        curr.next=null;
        return ans;
    }
}