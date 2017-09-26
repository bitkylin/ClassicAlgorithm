package cc.bitky.niuke.p5;

import java.util.LinkedList;

public class 链表的回文结构 {
    public boolean isPalindrome(ListNode pHead) {
        ListNode fast = pHead;
        ListNode low = pHead;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        if (fast != null) low = low.next;
        LinkedList<ListNode> stack = new LinkedList<>();
        while (low != null) {
            stack.push(low);
            low = low.next;
        }
        while (!stack.isEmpty()) {
            ListNode c = stack.pop();
            if (pHead.val != c.val) return false;
            pHead = pHead.next;
        }
        return true;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
