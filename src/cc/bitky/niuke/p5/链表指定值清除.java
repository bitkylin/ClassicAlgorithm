package cc.bitky.niuke.p5;

public class 链表指定值清除 {

    public ListNode clear(ListNode head, int val) {
        ListNode node = new ListNode(-1);
        node.next = head;
        ListNode ret = node;
        while (node.next != null) {
            ListNode next = node.next;
            if (next.val == val) node.next = next.next;
            else node = node.next;
        }
        return ret.next;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}