/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1=0;
        int count2=0;
        ListNode curr1=headA;
        ListNode curr2=headB;
        while(curr1!=null){
            count1++;
            curr1=curr1.next;
        }
        while(curr2!=null){
            count2++;
            curr2=curr2.next;
        }
        boolean flag=true;
        if(count1<count2){
            flag=false;
        }
        int d=Math.abs(count1-count2);
        if(flag){
            while(d>0){
                d--;
                headA=headA.next;
            }
        }else{
            while(d>0){
                d--;
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
        
    }
}