package cc.bitky.niuke.p7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class 二叉树遍历打印非递归 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
        new 二叉树遍历打印非递归().convert(node);
    }

    public int[][] convert(TreeNode root) {
        List<Integer> listPre = new ArrayList<>();
        List<Integer> listMid = new ArrayList<>();
        List<Integer> listPost = new ArrayList<>();
        pre(root, listPre);
        mid(root, listMid);
        post(root, listPost);
        int[][] ints = new int[3][listMid.size()];
        for (int i = 0; i < listMid.size(); i++) {
            ints[0][i] = listPre.get(i);
            ints[1][i] = listMid.get(i);
            ints[2][i] = listPost.get(i);
        }
        return ints;
    }

    private void pre(TreeNode root, List<Integer> list) {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            list.add(node.val);
            if (node.right != null)
                nodes.push(node.right);
            if (node.left != null)
                nodes.push(node.left);
        }
    }

    private void mid(TreeNode root, List<Integer> list) {
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !nodes.isEmpty()) {
            if (cur != null) {
                nodes.push(cur);
                cur = cur.left;
            } else {
                TreeNode parent = nodes.pop();
                list.add(parent.val);
                cur = parent.right;
            }
        }
    }

    private void post(TreeNode root, List<Integer> list) {
        if (root == null) return;
        post(root.left, list);
        post(root.right, list);
        list.add(root.val);
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

