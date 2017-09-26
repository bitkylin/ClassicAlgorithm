package cc.bitky.niuke.p5;

import java.util.LinkedList;

public class 链表的k逆序 {

    public ListNode inverse(ListNode head, int k) {
        ListNode last = head;
        ListNode sec = new ListNode(-1);
        ListNode ret = sec;

        for (int i = 0; i < k - 1; i++) {
            if (last == null) return head;
            last = last.next;
        }
        LinkedList<ListNode> stack = new LinkedList<>();
        while (true) {
            for (int i = 0; i < k; i++) {
                stack.push(head);
                head = head.next;
                if (last != null)
                    last = last.next;
            }
            while (!stack.isEmpty()) {
                sec.next = stack.pop();
                sec = sec.next;
            }
            if (last == null) {
                sec.next = head;
                return ret.next;
            }
        }
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
