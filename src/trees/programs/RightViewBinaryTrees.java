package trees.programs;

import java.util.LinkedList;
import java.util.Queue;

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
    int max_depth = 0;
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
}
