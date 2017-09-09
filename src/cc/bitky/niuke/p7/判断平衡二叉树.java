package cc.bitky.niuke.p7;


public class 判断平衡二叉树 {

    boolean result = true;

    public boolean check(TreeNode root) {
        judge(root, 1);
        return result;
    }

    private int judge(TreeNode root, int high) {
        if (!result) return -1;
        if (root == null) return high;
        high++;
        int left = judge(root.left, high);
        int right = judge(root.right, high);
        if (Math.abs(left - right) > 1) result = false;
        return Math.max(left, right);
    }

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
