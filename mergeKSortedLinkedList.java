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
        if( lists.length==1)
            return lists[0];
        if(lists.length==0)
            return null;
        ListNode ans=Merge(lists[0],lists[1]);
       
          for(int i=2;i<lists.length;i++){
              ans=Merge(ans,lists[i]);
          }
        return ans;
        
    }
    public ListNode Merge(ListNode first,ListNode sec){
        ListNode ans=new ListNode(1);
        ListNode dummy=ans;
        while(first!=null || sec!=null){
            while(first!=null && sec!=null){
                if(first.val<sec.val){
                    ans.next=first;
                    first=first.next;
                    
                }else
                {
                    ans.next=sec;
                    sec=sec.next;
                }
                ans=ans.next;
            }
            if(first!=null){
                ans.next=first;
                first=null;
            }
            if(sec!=null){
                ans.next=sec;
                sec=null;
            }
        }
        return dummy.next;
    }
}
------------------------------
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
       PriorityQueue<ListNode> pq=new PriorityQueue<>((o1,o2)->(o1.val-o2.val));
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(!pq.isEmpty()){
            ListNode popped=pq.poll();
            ans.next=popped;
            ans=ans.next;
            if(popped.next!=null)
                pq.add(popped.next);
        }
        return dummy.next;
    }
}