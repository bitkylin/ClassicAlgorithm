package cc.bitky.niuke.p7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
//给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存，所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500。
public class 按层打印二叉树 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(11);
        node.right.left = new TreeNode(21);
        printTree(node);
    }

    public static void printTree(TreeNode root) {
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.offer(root);
        TreeNode last = root;
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            integers.add(node.val);
            if (node.left != null) nodes.offer(node.left);
            if (node.right != null) nodes.offer(node.right);
            if (node == last) {
                lists.add(integers);
                integers = new ArrayList<>();
                last = nodes.peekLast();
            }
        }
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
//        int[][] ints = new int[lists.size()][];
//        for (int j = 0; j < lists.size(); j++) {
//            List<Integer> list = lists.get(j);
//            int[] ints1 = new int[list.size()];
//            for (int i = 0; i < list.size(); i++) {
//                ints1[i] = list.get(i);
//            }
//            ints[j] = ints1;
//        }
//        return ints;
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



