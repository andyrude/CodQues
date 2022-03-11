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

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void Display(){
        this.Display( root);
    }

    public void Display(Node node){
        if ( node != null) {
            String str = "<-" + node.data + "->";
            if (node.left != null) {
                str = node.left.data + str;
            } else {
                str = "." + str;
            }
            if (node.right != null) {
                str = str + node.right.data;
            } else {
                str = str + ".";
            }
            System.out.println(str);
            Display(node.left);
            Display(node.right);
        }else
            return;
    }

    public boolean find(int item){
        return find( item, this.root);
    }

    private boolean find( int item, Node node){
        if( node == null){
            return false;
        }

        if ( item == node.data){
            return true;
        }
        return find( item, node.left) || find( item, node.right);
    }

    public int min(){
        return min( root);
    }

    private int min( Node node){
        if ( node == null){
            return Integer.MAX_VALUE;
        }
        int self_min = node.data;
        int left_min = min( node.left);
        int right_min = min( node.right);
        return Math.min( self_min, ( Math.min( left_min, right_min)));
    }

    public int size(){
        return size( this.root);
    }

    private int size( Node node){
        if ( node == null){
            return 0;
        }
        int ls = size( node.left);
        int rs = size( node.right);
        return ls + rs + 1;
    }

    public int height(){
        return height( root);
    }

    private int height( Node node){
        if ( node == null){
            return -1;
        }
        int lh = height( node.left);
        int rh = height( node.right);
        return Math.max( lh, rh) + 1;
    }

    public void inOrder(){
        inOrder( this.root);
    }
    private void inOrder( Node node){
        if ( node == null){
            return;
        }
        inOrder( node.left);
        System.out.print( node.data + " -->");
        inOrder( node.right);
    }

    public void preOrder(){
        preOrder( root);
    }

    private void preOrder( Node node){
        if ( node == null){
            return;
        }
        System.out.print( node.data + "-->");
        preOrder( node.left);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder( root);
    }

    private void postOrder( Node node){
        if ( node == null){
            return;
        }
        postOrder( node.left);
        postOrder( node.right);
        System.out.print( node.data + "-->");
    }
}
