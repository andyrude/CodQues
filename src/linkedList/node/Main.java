package linkedList.node;

import linkedList.LinkedListImpl;
import linkedList.Node;
import linkedList.programs.ListNodehasCycle;
import linkedList.programs.findMiddleNode;

public class Main {
    public static void main(String[] args) {
        LinkedListImpl list = new LinkedListImpl();
        list.createNodes();
        System.out.println();
        list.display();
        System.out.println("After Insertion at front");
        list.addNodeAtFront(22);
        list.deleteAtFront();
        System.out.println();
        findMiddleNode find = new findMiddleNode( );
        Node n = find.middleNode( list.getHead());
        int l = n.data;
        System.out.println( l);
    }
}
