package trees.programs;

import com.sun.source.tree.Tree;

public class TiltBinaryTree {
    public static int treeTilt = 0;
    public static int findTilt(TreeNode root){

        if(root == null){
            return 0;
        }
        int ls = findTilt(root.left);
        int rs = findTilt(root.right);
        int ts = root.val + ls + rs;

        int nodeTilt = Math.abs(ls-rs);
        treeTilt += nodeTilt;

        return ts;
    }

    public static void main(String[] args) {
         TreeNode treeNode = new TreeNode();
         TreeNode tl = new TreeNode();
         TreeNode t2 = new TreeNode();
         treeNode.val = 1;
         treeNode.left = tl;
         treeNode.right = t2;
         tl.val = 2;
         t2.val = 3;
        findTilt( treeNode);
        System.out.println( treeTilt);
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

