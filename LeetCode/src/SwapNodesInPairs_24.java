public class SwapNodesInPairs_24 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode current = pre;
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;

        }
        return pre.next;
    }

    public ListNode swapPairsReverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode t = head.next;
        ListNode n = swapPairsReverse(t.next);
        t.next = head;
        head.next = n;
        return t;
    }

}
