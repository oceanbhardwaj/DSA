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
       ListNode ans=null;
        
        if(lists.length==0)
            return ans;
        if(lists.length==1)
            return lists[0];
        ans=merge(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
            ans=merge(ans,lists[i]);
        }
        return ans;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(l1!=null || l2!=null){
            while(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    dummy.next=l1;
                    l1=l1.next;
                    dummy=dummy.next;
                }
                else{
                    dummy.next=l2;
                    l2=l2.next;
                    dummy=dummy.next;
                }
            }
            if(l1!=null){
                dummy.next=l1;
                l1=null;
            }
            if(l2!=null){
                dummy.next=l2;
                l2=null;
            }
        }
        return ans.next;
    }
    
}
-----------------------------------------------------------------------------------------------
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
       ListNode ans=null;
      for(int i=0;i<lists.length;i++){
          ans=merge(ans,lists[i]);
      }
        return ans;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(l1!=null || l2!=null){
            while(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    dummy.next=l1;
                    l1=l1.next;
                    dummy=dummy.next;
                }
                else{
                    dummy.next=l2;
                    l2=l2.next;
                    dummy=dummy.next;
                }
            }
            if(l1!=null){
                dummy.next=l1;
                l1=null;
            }
            if(l2!=null){
                dummy.next=l2;
                l2=null;
            }
        }
        return ans.next;
    }
    
}
---------------------------------------------------------------------------------------------
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
        PriorityQueue<ListNode>pq=new PriorityQueue<>((l1,l2)->l1.val-l2.val);
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
       for(int i=0;i<lists.length;i++){
           if(lists[i]!=null)
               pq.add(lists[i]);
       }
        while(!pq.isEmpty()){
            ListNode l=pq.poll();
            dummy.next=l;
            dummy=dummy.next;
            l=l.next;
            if(l!=null)
                pq.add(l);
        }
        return ans.next;
    }
}