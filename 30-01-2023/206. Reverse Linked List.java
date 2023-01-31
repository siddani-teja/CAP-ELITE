class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode p=null;
        ListNode c=head;
        ListNode n=null;
        while(c!=null)
        {
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        head=p;
        return head;
         
    }
}


