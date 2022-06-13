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
    public ListNode swapNodes(ListNode head, int k) {
        int count=0;
        int first=0;
        int sec=0;
        ListNode curr=head;
        while(curr!=null){
           count++;
            curr=curr.next;
            
        }
        curr=head;
        //first sec
        int k1=1;
        while(curr!=null){
            if(k1==k)
                first=curr.val;
            if(count-k+1==k1)
                sec=curr.val;
            k1++;
            curr=curr.next;
        }
        System.out.println("first :"+first + "sec :"+sec);
        curr=head;
        k1=1;
        while(curr!=null){
            if(k1==k){
                curr.val=sec;
            }
            else if(k1==count-k+1)
                curr.val=first;
            k1++;
            curr=curr.next;
        }
        return head;
        
    }
}
-----------------------------------------------------------------------------------------------------------------
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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode slow=head;
        ListNode fast=head;
        ListNode ans=null;
        int first=0;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
       first=fast.val;
        ans=fast;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            
        }
         int sec=slow.val;
        slow.val=ans.val;
        ans.val=sec;
       
       return head; 
    }
}