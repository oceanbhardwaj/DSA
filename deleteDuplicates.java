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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
       ListNode ans=new ListNode(-101);
        //ListNode ans=head;
        ListNode dummy=ans;
        while(head!=null && head.next!=null){
            if(head.val !=head.next.val)
            {ans.next=head;
             ans=ans.next;}
            
            head=head.next;
                
        }
        if(ans.val!=head.val)
            ans.next=head;
        return dummy.next;
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
       ListNode ans=new ListNode(1);
        ans.next=head;
        
        ListNode dummy=ans;
        ans=ans.next;
         ListNode prev=head;
        head=head.next;
       
        while(head!=null){
            if(prev.val!=head.val){
                ans.next=head;
                ans=ans.next;
                prev=head;
            }
            
            head=head.next;
        }
        ans.next=null;
        return dummy.next;
    }
}