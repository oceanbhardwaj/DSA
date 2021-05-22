 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(head!=null)
        {
            if(head.val!=val)
            {
                dummy.next=head;
                dummy=dummy.next;
            }
            head=head.next;
        }
        dummy.next=null;
        return ans.next;
    }
}