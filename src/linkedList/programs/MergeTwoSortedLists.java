package linkedList.programs;

import linkedList.node.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoSortedList( ListNode listNode1, ListNode list2){

        ListNode dummyNode = new ListNode( - 1);
        Node head = new Node();

        if ( listNode1.val >= list2.val){
            head.data = list2.val;

        }else {
            head.data = listNode1.val;
        }
        while ( listNode1 != null && list2 != null ){
            if ( listNode1.val <= list2.val){
                ListNode newNo = new ListNode( listNode1.val);
                dummyNode.next = newNo;
                listNode1 = listNode1.next;
            }else {
                ListNode newNo = new ListNode( list2.val);
                dummyNode.next = newNo;
                list2 = list2.next;
            }
        }
        if ( listNode1 == null){
            dummyNode.next = list2;
        }else {
            dummyNode.next = listNode1;
        }
        return dummyNode.next;
    }

}

class Node{
    public int data;
    public Node next;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
    }
}
