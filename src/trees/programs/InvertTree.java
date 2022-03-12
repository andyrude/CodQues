package trees.programs;

import trees.BinaryTree;

public class InvertTree {
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
    public Node invertTree(Node root){
        if ( root == null){
            return null;
        }
        Node left = invertTree( root.left);
        Node right = invertTree( root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
