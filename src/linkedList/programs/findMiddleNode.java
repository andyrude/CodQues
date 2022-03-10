package linkedList.programs;

import linkedList.Node;
import linkedList.node.ListNode;

public class findMiddleNode {
    public ListNode middleNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while ( fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next!=null){
            return slow.next;
        }
        return slow;
    }
}
