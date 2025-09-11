package Platinum_Codes.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

// 199 - Binary Tree Right Side View
public class RightView {
    static int max_level;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);

        RightView obj = new RightView();
        List<Integer> result = obj.rightSideView(root);
        System.out.println("Right View: " + result);
    }

    static class TreeNode {
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

    public List<Integer> rightSideView(TreeNode root) {
        int max_level = 0;
        ArrayList<Integer> res = new ArrayList<>();
        rightView(root, 1, res);
        return res;
    }

    static void rightView(TreeNode root, int level, ArrayList<Integer> res) {
        if (root == null) return;

        if (res.size() < level) {
            res.add(root.val);
        }

        rightView(root.right, level + 1, res);
        rightView(root.left, level + 1, res);
    }
}
