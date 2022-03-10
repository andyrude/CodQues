package linkedList;

import linkedList.node.ListNode;

public class ListNodehasCycle {
    public boolean hasCylce(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while ( fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if ( slow == fast){
                return true;
            }
        }
        return false;
    }
}
