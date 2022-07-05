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

    private static List<Integer> pathSum2(TreeNode root, int targetSum, ArrayList<Integer> integers) {
        integers.add( root.val);
        if( root == null){
            integers.remove( integers.size() - 1);
            return integers;
        }
        if( targetSum == root.val){
            list.add( integers);
            integers.remove( integers.size() - 1);
            return integers;
        }
        pathSum2( root.left, targetSum - root.val, integers);
        pathSum2( root.right, targetSum - root.val, integers);
        return integers;
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


