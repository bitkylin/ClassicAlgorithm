package cc.bitky.niuke.p3;
//对于两棵彼此独立的二叉树A和B，请编写一个高效算法，检查A中是否存在一棵子树与B树的拓扑结构完全相同。
//给定两棵二叉树的头结点A和B，请返回一个bool值，代表A中是否存在一棵同构于B的子树。
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class IdenticalTree {
    public boolean chkIdentical(TreeNode A, TreeNode B) {
        String strA = kyPrint(A);
        String strB = kyPrint(B);
        return strA.contains(strB);
    }

    private String kyPrint(TreeNode treeNode) {
        String ret = treeNode.val + "!";
        if (treeNode.left != null) ret += kyPrint(treeNode.left);
        else ret += "#!";
        if (treeNode.right != null) ret += kyPrint(treeNode.right);
        else ret += "#!";
        return ret;
    }
}
