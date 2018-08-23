// Given a linked list, remove the n-th node from the end of list and return its head.
// n will always be valid

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        while (n > 0) {
            fast = fast.next; // Setting equal to elements
            n--;
        }
        while (fast.next != null) {
            slow = slow.next; // Setting equal to elements
            fast = fast.next; // Setting equal to elements
        }
        slow.next = slow.next.next;
        return start.next; // Elements have changed, can return pointer
    }
}
