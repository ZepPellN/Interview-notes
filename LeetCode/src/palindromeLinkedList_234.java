public class palindromeLinkedList_234 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode first = head, second = head.next;
        while(second.next != null && second.next.next != null) {
            first = first.next;
            second = second.next.next;
        }
        ListNode mid = first.next;
        first.next = null;
        ListNode head2 = reverse(mid);
        while (head != null && head2 != null) {
            if (head.val != head2.val) {
                return false;
            }
            head = head.next;
            head2 = head2.next;
        }
        return true;
    }


    public ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null, next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
