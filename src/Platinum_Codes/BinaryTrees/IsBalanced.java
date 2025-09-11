package Platinum_Codes.BinaryTrees;

public class IsBalanced {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        IsBalanced obj = new IsBalanced();
        System.out.println(obj.isBalanced(root));
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
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root)!=-1;
    }
    static int checkHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=checkHeight(root.left);
        if(left==-1){
            return -1;
        }
        int right=checkHeight(root.right);
        if(right==-1){
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left,right)+1;
    }
}
