
 *//**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node.next!=null)
            
        {ListNode del=node.next;
        node.val=del.val;
        node.next=del.next;
        del.next=null;}


            
             
        
    }
}



            





            
             
        
    
