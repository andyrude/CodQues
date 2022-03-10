package linkedList.node;

import linkedList.LinkedListImpl;
import linkedList.programs.ListNodehasCycle;

public class Main {
    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        list.createNodes();
        System.out.println();
        System.out.println("After Insertion at front");
        list.addNodeAtFront(22);
        list.deleteAtFront();
        System.out.println();
        ListNodehasCycle check = new ListNodehasCycle();
        System.out.println(check.hasCylce(list.getHead()));
    }
}
