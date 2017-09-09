package cc.bitky.niuke.p7;

import java.util.LinkedList;

public class 判断完全二叉树 {
    boolean result = true;
    boolean leaf = false;
    TreeNode last = null;

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.left = new TreeNode();
        node.right = new TreeNode();
        System.out.println(new 判断完全二叉树().chk(node));
    }

    public boolean chk(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        last = root;
        list.offer(root);
        while (!list.isEmpty()) {
            judge(list);
        }
        return result;
    }

    private void judge(LinkedList<TreeNode> list) {
        TreeNode node = list.poll();
        if (!result) return;
        if (leaf && (node.left != null || node.right != null)) {
            result = false;
            return;
        }
        if (node.left == null && node.right != null) {
            result = false;
            return;
        }
        if (node.left == null || node.right == null) {
            leaf = true;
        }
        if (node.left != null) list.offer(node.left);
        if (node.right != null) list.offer(node.right);
    }

    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
