package linkedList.programs;

import linkedList.node.ListNode;

public class DeleteDuplicatesInSortedList {
    public ListNode deleteDuplicates( ListNode head){

        ListNode current = head;
       ListNode dummyNode = new ListNode(-1);
       dummyNode.next = head;

       while ( current.next!= null ){
           if ( current.val == current.next.val){
               ListNode temp = current.next.next;
               current.next = temp;
           }
       }
        return dummyNode.next;
    }
}
