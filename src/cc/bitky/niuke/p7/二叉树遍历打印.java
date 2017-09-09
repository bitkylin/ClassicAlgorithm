package cc.bitky.niuke.p7;

import java.util.ArrayList;
import java.util.List;


public class 二叉树遍历打印 {
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
        if (root == null) return;
        list.add(root.val);
        pre(root.left, list);
        pre(root.right, list);
    }

    private void mid(TreeNode root, List<Integer> list) {
        if (root == null) return;
        mid(root.left, list);
        list.add(root.val);
        mid(root.right, list);
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

