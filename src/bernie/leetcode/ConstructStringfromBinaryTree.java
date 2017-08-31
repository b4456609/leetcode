package bernie.leetcode;

public class ConstructStringfromBinaryTree {
    public String tree2str(TreeNode t) {
        if (t == null) return "";
        if (t.right == null && t.left == null) return "" + t.val;
        if (t.right == null) return String.format("%d(%s)", t.val, tree2str(t.left));
        if (t.left == null) return String.format("%d()(%s)", t.val, tree2str(t.right));
        return String.format("%d(%s)(%s)", t.val, tree2str(t.left), tree2str(t.right));
    }
}
