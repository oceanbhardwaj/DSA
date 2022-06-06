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
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(list1!=null || list2!=null){
            while(list1!=null && list2!=null){
                if(list1.val<list2.val){
                    ans.next=new ListNode(list1.val);
                    list1=list1.next;
                }else{
                    ans.next=new ListNode(list2.val);
                    list2=list2.next;
                }
                ans=ans.next;
            }
            if(list1!=null)
            { ans.next=list1;
             list1=null;}
            if(list2!=null){
                ans.next=list2;
                list2=null;
            }
            
        }
        return dummy.next;
    }
}
-----------------------------------------------------
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
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
       while(list1!=null || list2!=null){
           while(list1!=null && list2!=null){
               if(list1.val<list2.val)
               {
                   ans.next=list1;
                   list1=list1.next;
               }else{
                   ans.next=list2;
                   list2=list2.next;
               }
               ans=ans.next;
           }
           if(list1!=null){
               ans.next=list1;
               list1=null;
           }
           if(list2!=null)
           {
               ans.next=list2;
               list2=null;
           }
       }
        return dummy.next;
    }
}
------------------------------------------------------------
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
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        if(list1.val<list2.val){
            list1.next= mergeTwoLists(list1.next,list2);
            return list1;
        }
        else{
            list2.next= mergeTwoLists(list1,list2.next);
            return list2;
        }
    }
}