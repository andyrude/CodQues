package trees.programs;

import trees.BinaryTree;

public class FlipEquiTrees {
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
    public boolean FlipEquivalentTrees(Node node1, Node node2){
                if ( node1 == null && node2 == null){
                    return true;
                }
                if ( node1 == null || node2 == null){
                    return false;
                }
                if ( node1.data != node2.data){
                    return false;
                }
                boolean noFlip = FlipEquivalentTrees( node1.left, node2.left) && FlipEquivalentTrees( node1.right, node2.right);
                boolean Flip = FlipEquivalentTrees( node1.left, node2.right) && FlipEquivalentTrees( node1.right, node2.left);
                return noFlip || Flip;
    }
}
