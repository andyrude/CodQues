package trees.programs;

import trees.BinaryTree;

public class SymmetricTrees {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }
    }
    public boolean SymmetricTrees(Node node1, Node node2){
        if ( node1 == null && node2 == null){
            return true;
        }
        if ( (node1 == null && node2 !=  null) || ( node2 == null && node1 != null)){
            return false;
        }
        boolean get =  SymmetricTrees( node1.left, node2.right) && SymmetricTrees( node2.left, node1.right);
        if ( (node1.data == node2.data) && get){
            return true;
        }
        return false;
    }
}
