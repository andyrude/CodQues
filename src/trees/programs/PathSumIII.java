package trees.programs;


public class PathSumIII {
    public static int pathSum(TreeNode root, int targetSum){
            if( root == null){
                return 0;
            }
            return  pathSum( root.left , targetSum) + pathSum( root.right, targetSum) + pathSum_a( root, targetSum);
    }

    public static  int pathSum_a( TreeNode root, int targetSum){
        if( root == null){
            return 0;
        }
        int res = 0;
        if( root.val == 0){
            return 1;
        }
        res += pathSum_a( root.left, targetSum - root.val);
        res += pathSum_a( root.right, targetSum - root.val);
        return  res;
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

