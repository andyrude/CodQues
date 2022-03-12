package trees.programs;

import trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BuildTreeUsingLevelOrdertraversal {
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
