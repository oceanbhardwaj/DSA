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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((l1,l2)->l1.val-l2.val);
        for(ListNode l:lists){
            if(l!=null)
            pq.add(l);
        }
        ListNode n=new ListNode(0);
        ListNode dummy=n;
        while(!pq.isEmpty()){
           ListNode popped=pq.poll();
            n.next=popped;
            n=n.next;
            if(popped.next!=null)
                pq.add(popped.next);
                
            
}
        n.next=null;
        return dummy.next;
    }
}