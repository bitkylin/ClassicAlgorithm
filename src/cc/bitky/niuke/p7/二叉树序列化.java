package cc.bitky.niuke.p7;

public class 二叉树序列化 {
    StringBuilder builder;

    public String toString(TreeNode root) {
        builder = new StringBuilder();
        getStr(root);
        return builder.toString();
    }

    private void getStr(TreeNode node) {
        builder.append(node.val + "!");
        if (node.left == null) builder.append("#!");
        else getStr(node.left);
        if (node.right == null) builder.append("#!");
        else getStr(node.right);
    }

    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
