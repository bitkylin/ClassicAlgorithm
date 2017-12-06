package cc.bitky.niuke.p7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
//给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
public class 按层打印二叉树 {

    public int[][] printTree(TreeNode root) {
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        TreeNode last = root;
        List<int[]> lists = new ArrayList<>();
        int[] integers = new int[nodes.size()];
        int i = 0;
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            integers[i++] = node.val;
            if (node.left != null) nodes.offer(node.left);
            if (node.right != null) nodes.offer(node.right);
            if (node == last) {
                lists.add(integers);
                integers = new int[nodes.size()];
                i = 0;
                last = nodes.peekLast();
            }
        }
        int[][] ints = new int[lists.size()][];
        for (int j = 0; j < lists.size(); j++) {
            ints[j] = lists.get(j);
        }
        return ints;
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



