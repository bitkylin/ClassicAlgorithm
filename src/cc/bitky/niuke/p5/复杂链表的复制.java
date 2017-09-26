package cc.bitky.niuke.p5;

public class 复杂链表的复制 {

//    public  RandomListNode Clone(RandomListNode pHead) {
//
//
//        RandomListNode old = pHead;
//        RandomListNode node = new RandomListNode(old.label);
//        RandomListNode ret = node;
//        while (old.next != null) {
//            old = old.next;
//            node.next = new RandomListNode(old.label);
//            node = node.next;
//        }
//        node = ret;
//        while (node != null) {
//
//        }
//    }

    static  class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

}
