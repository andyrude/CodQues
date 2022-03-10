package trees.binarysearchTree;

import trees.TreeNode;

public class MinimumAbsoluteDifference {

    public int getMinimumDifference(TreeNode root){
        TreeNode[] prev = new TreeNode[1];
        int[] min  = {Integer.MAX_VALUE};
        inorder(root,prev,min);

        return min[0];
    }

    private void inorder(TreeNode root, TreeNode[] prev, int[] min){

        if(root==null){
            return;
        }

        inorder(root.left,prev,min);

        if(prev[0]!=null){
            min[0] = Math.min(min[0],Math.abs(root.val-prev[0].val));
        }
        prev[0] = root;
        inorder(root.right,prev,min);

        return;
    }
}
