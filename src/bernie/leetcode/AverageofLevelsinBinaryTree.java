package bernie.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageofLevelsinBinaryTree {
    public static void main(String[] args) {
        TreeNode node7 = new TreeNode(7);
        TreeNode node15 = new TreeNode(15);
        TreeNode node20 = new TreeNode(20);
        TreeNode node9 = new TreeNode(9);
        TreeNode node3 = new TreeNode(3);
        node20.left = node15;
        node20.right = node7;
        node3.right = node20;
        node3.left = node9;

        List<Double> doubles = new Solution().averageOfLevels(node3);
        System.out.println(doubles);

        TreeNode a = new TreeNode(2147483647);
        TreeNode b = new TreeNode(2147483647);
        TreeNode c = new TreeNode(2147483647);
        a.left = b;
        a.right = c;
        doubles = new Solution().averageOfLevels(a);
        System.out.println(doubles);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    Map<Integer, LevelStatus> levelStatusMap = new HashMap<>();

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> nums = new ArrayList<>();
        traverseTree(root, 0);
        int i = 0;
        while (i < levelStatusMap.size()) {
            LevelStatus levelStatus = levelStatusMap.get(i);
            nums.add(1.0 * levelStatus.value / levelStatus.counter);
            i++;
        }
        return nums;
    }

    public void traverseTree(TreeNode root, int level) {
        if (root == null) return;
        LevelStatus ls = levelStatusMap.getOrDefault(level, new LevelStatus());
        levelStatusMap.put(level, ls.addValue(root.val));
        traverseTree(root.left, level + 1);
        traverseTree(root.right, level + 1);
    }

    class LevelStatus {
        int counter = 0;
        long value = 0;

        LevelStatus addValue(int value) {
            this.value += value;
            counter++;
            return this;
        }
    }
}