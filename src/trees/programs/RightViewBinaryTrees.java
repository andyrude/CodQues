package trees.programs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RightViewBinaryTrees {
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
    int max_depth = -1;
    public void rightViewBinaryWOQueue( Node node, int current_level){
        if ( node == null){
            return;
        }
        if ( max_depth < current_level){
            System.out.println( node.data);
            max_depth = current_level;
        }
        rightViewBinaryWOQueue( node.right, current_level + 1);
        rightViewBinaryWOQueue( node.left, current_level + 1);
    }

    public void rightViewwithQueue( Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        Queue<Node> helper = new LinkedList<>();
        while ( !queue.isEmpty()){
            Node rem = queue.remove();
            if ( rem.left != null){
                helper.add(rem.left);
            }
            if ( rem.right != null){
                helper.add(rem.right);
            }
            if( queue.isEmpty()){
                System.out.println( rem.data);
                queue = helper;
                helper = new LinkedList<>();
            }
        }
    }

    public void leftSideView( Node node, int current_level){
        if ( node == null){
            return;
        }
        if ( max_depth < current_level){
            System.out.println( node.data);
            max_depth = current_level;
        }
        leftSideView(node.left, current_level + 1 );
        leftSideView( node.right, current_level + 1);
    }

    public Node buildTreeUsingLevelOrderTraversal(){
        Scanner sc = new Scanner(System.in);
        Queue<Node> queue = new LinkedList<>();
        Queue<Node> helper = new LinkedList<>();
        int k = sc.nextInt();
        Node root = new Node(k);
        queue.add( root);
        while ( !queue.isEmpty()){
            Node rem = queue.remove();
            int leftD = sc.nextInt();
            int rightD = sc.nextInt();
            if ( leftD != -1){
                Node left = new Node( leftD);
                rem.left = left;
                queue.add( left);
            }
            if ( rightD != -1){
                Node right = new Node( rightD);
                rem.right = right;
                queue.add( right);
            }
        }
        return root;
    }
}
