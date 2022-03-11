package trees;

import java.util.Scanner;

public class BinaryTree {

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

    Scanner sc = new Scanner( System.in);

       private Node root;

    public BinaryTree() {
        root = create_Tree();
    }

    private Node create_Tree() {
        int item = sc.nextInt();
        Node nn = new Node( item);
        boolean hlc = sc.nextBoolean();
        if( hlc == true) {
            nn.left = create_Tree();
        }
        boolean hrc = sc.nextBoolean();
        if ( hrc == true) {
            nn.right = create_Tree();
        }
        return nn;
        }

    public void Display(){
        this.Display( root);
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    private void Display(Node node){
        String str = "<-" + String.valueOf(node.data ) + "->";
        if ( node.left != null){
            str = node.left.data + str;
        }else {
            str = "." + str;
        }
        if ( node.right != null){
            str = node.right.data + str;
        }else {
            str = str + ".";
        }
        Display( node.left);
        Display( node.right);
    }

}
