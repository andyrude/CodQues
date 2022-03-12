package trees;

import trees.programs.BuildTreeUsingLevelOrdertraversal;
import trees.programs.RightViewBinaryTrees;

public class BinaryTreeClient{
    public static void main(String[] args) {

        RightViewBinaryTrees rightView = new RightViewBinaryTrees();
        rightView.rightViewBinaryWOQueue( rightView.buildTreeUsingLevelOrderTraversal(), 0);
    }
}
// 10 true 20 True 30 false true 50 false false true 60 false false true 70 true 90 false false true 110 false false