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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return list1;
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode newSortedList =new ListNode(1);
        ListNode dummy=newSortedList;
        while(list1!=null || list2!=null){
        while(list1!=null && list2!=null){
            if(list1.val<list2.val)
            {
                dummy.next=list1;
                list1=list1.next;
                dummy=dummy.next;
            }else {
                dummy.next=list2;
                list2=list2.next;
                dummy=dummy.next;
            }
            
        }
            if(list1!=null){
                dummy.next=list1;
                list1=null;
            }
            if(list2!=null){
                dummy.next=list2;
                list2=null;
            }
              
                
        }
        return newSortedList.next;
    }
}