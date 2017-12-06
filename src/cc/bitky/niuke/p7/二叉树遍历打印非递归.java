package cc.bitky.niuke.p7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


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
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
    }

    private void mid(TreeNode root, List<Integer> list) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode parent = stack.pop();
                list.add(parent.val);
                cur = parent.right;
            }
        }
    }

    private void post(TreeNode root, List<Integer> list) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<TreeNode> res = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.push(node);
            if (node.left != null)
                stack.push(node.left);
            if (node.right != null)
                stack.push(node.right);
        }
        while (!res.isEmpty())
            list.add(res.pop().val);
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

