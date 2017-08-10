package cc.bitky.niuke.one;

import java.util.ArrayList;
import java.util.LinkedList;

public class TreeMain {
    private LinkedList<TreeNode> linkedList = new LinkedList<>();
    private TreeNode list;
    private TreeNode nList;
    private ArrayList<ArrayList<TreeNode>> listss = new ArrayList<>();
    private ArrayList<TreeNode> lists = new ArrayList<>();

    public static void main(String[] args) {
        new TreeMain().run();
    }

    private int[][] run() {
        TreeNode root = init();
        list = root;
        linkedList.add(root);
        while (linkedList.size() > 0)
            printByRow();

        int[][] result = new int[listss.size()][];
        int i = 0;
        for (ArrayList<TreeNode> treeNodes : listss) {
            int[] ints = new int[treeNodes.size()];
            for (int j = 0; j < treeNodes.size(); j++) {
                ints[j] = treeNodes.get(j).val;
            }
            result[i] = ints;
            i++;
        }
        return result;
    }

    private TreeNode init() {
        TreeNode root = new TreeNode(1);
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
        TreeNode ll = new TreeNode(4);
        TreeNode lr = new TreeNode(5);
        TreeNode lll = new TreeNode(6);
        root.left = l;
        root.right = r;
        l.left = ll;
        l.right = lr;
        ll.left = lll;
        return root;
    }

    private void printByRow() {
        TreeNode treeNode = linkedList.poll();
        if (treeNode.left != null) {
            linkedList.add(treeNode.left);
            nList = treeNode.left;
        }
        if (treeNode.right != null) {
            linkedList.add(treeNode.right);
            nList = treeNode.right;
        }
        lists.add(treeNode);
        if (treeNode == list) {
            listss.add(lists);
            lists = new ArrayList<>();
            list = nList;
        }
    }
}
