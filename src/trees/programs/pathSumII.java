package trees.programs;

import java.util.ArrayList;
import java.util.List;

public class pathSumII {
    private static List<Integer> arrayList = new ArrayList<>();
    private static List<List<Integer>> list = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum){
        pathSum2( root, targetSum, new ArrayList<Integer>());
        return list;
    }

    private static void pathSum2(TreeNode root, int targetSum, ArrayList<Integer> integers) {
       if( root.left == null && root.right == null && targetSum  == -1){
           list.add( integers);
       }
       integers.add( root.val);
       pathSum2( root.left, targetSum - root.val, integers);
       pathSum2( root.right, targetSum - root.val, integers);
       integers.remove( integers.size() - 1);
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


