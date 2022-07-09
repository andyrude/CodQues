package trees.programs;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeUsingTraversal {
    public TreeNode buildTree( int[] postOrder, int[] inOrder){
            HashMap< Integer, Integer> inMap = new HashMap<>( );
            for( int i = 0; i < inOrder.length; i++) {
                inMap.put(inOrder[i], i);
            }
            return buiTree2( postOrder, 0,  postOrder.length - 1, inOrder, 0, inOrder.length - 1, inMap);
    }

    public TreeNode buiTree( int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int end,  HashMap< Integer, Integer> map){
        if( preStart > preEnd || inStart > end) return null;
        TreeNode root = new TreeNode( preOrder[ preStart]);
        int inRoot = map.get( root.val);
        int numsLeft = inRoot - inStart;
        root.left = buiTree( preOrder, preStart + 1, preStart  + numsLeft, inOrder, inStart, inRoot - 1, map);
        root.right = buiTree( preOrder, preStart + 1, preStart + numsLeft, inOrder, inStart, inRoot - 1, map);
        return  root;
    }

    public TreeNode  buiTree2( int[] postOrder, int postStart, int postEnd, int[] inOrder, int inStart, int end, HashMap< Integer, Integer> map){
        if( postEnd < postStart || inStart > end) return null;
        TreeNode root = new TreeNode( postOrder[postEnd]);
        int inRoot = map.get( root.val);
        int numsLeft = inRoot - inStart;
        root.left = buiTree2( postOrder, postStart , postStart + numsLeft - 1 , inOrder,inStart, inRoot - 1, map );
        root.right = buiTree2( postOrder, postStart + numsLeft, postEnd + numsLeft - 1, inOrder, inStart + numsLeft + 1, end, map);
        return  root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

