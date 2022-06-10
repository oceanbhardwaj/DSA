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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null)
        {
            a.add(head.val);
            head=head.next;
        }
        Collections.sort(a);
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        for(int i:a){
            ans.next=new ListNode(i);
            ans=ans.next;
        }
        return dummy.next;
    }
}
-------------------------------------------------
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        //find mid
        ListNode slow=head;
        ListNode fast=head;
        ListNode ans=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode left=sortList(ans);
        ListNode right=sortList(slow);
        return merge(left,right);
    }
    
    public ListNode merge(ListNode first,ListNode sec){
        if(first==null)
            return sec;
        if(sec==null)
            return first;
        ListNode n=new ListNode(0);
        ListNode dummy=n;
       while(first!=null || sec!=null){
           while(first!=null && sec!=null){
               if(first.val<sec.val){
                   n.next=first;
                   first=first.next;
               }else{
                   n.next=sec;
                   sec=sec.next;
               }
               n=n.next;
           }
           if(first!=null){
               n.next=first;
               first=null;
           }
           if(sec!=null){
               n.next=sec;
               sec=null;
           }
       }
        return dummy.next;
    }
}