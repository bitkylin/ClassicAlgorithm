package cc.bitky.niuke.p5;

public class 链表的分化 {
    public static void main(String[] args) {
        ListNode node = new ListNode(10);
        ListNode head = node;
        node.next = new ListNode(5);
        node = node.next;
        node.next = new ListNode(4);
        node = node.next;
        node.next = new ListNode(4);
        ListNode ret = new 链表的分化().listDivide(head, 4);
        System.out.println(ret);
    }

    public ListNode listDivide(ListNode head, int val) {
        ListNode leftList = new ListNode(-1);
        ListNode rightList = new ListNode(-1);

        while (head != null) {
            if (head.val <= val) {
                head = addList(leftList, head);
                continue;
            }
            if (head.val > val) {
                head = addList(rightList, head);
            }
        }
        ListNode ret = new ListNode(-1);
        link(ret, leftList);
        link(ret, rightList);
        return ret.next;
    }

    private void link(ListNode leftList, ListNode rightList) {
        while (leftList.next != null) {
            leftList = leftList.next;
        }
        leftList.next = rightList.next;
    }

    private ListNode addList(ListNode list, ListNode node) {
        ListNode next = node.next;
        while (list.next != null) {
            list = list.next;
        }
        list.next = node;
        node.next = null;
        return next;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}