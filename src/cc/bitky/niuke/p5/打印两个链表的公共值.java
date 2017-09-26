package cc.bitky.niuke.p5;

import java.util.ArrayList;
import java.util.List;

public class 打印两个链表的公共值 {

    public int[] findCommonParts(ListNode headA, ListNode headB) {
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (headA == null || headB == null) break;
            if (headA.val < headB.val) {
                headA = headA.next;
                continue;
            }
            if (headA.val > headB.val) {
                headB = headB.next;
                continue;
            }
            list.add(headA.val);
            headA = headA.next;
            headB = headB.next;
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
