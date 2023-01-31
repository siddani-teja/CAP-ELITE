class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while( fast!=null && fast.next!=null)//even and odd no of nodes are differ
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
