// Given a non-empty, singly linked list with head node head,
// return a middle node of linked list.
// If there are two middle nodes, return the second middle node.

// Fast/Slow Pointers [Time: O(n) Space: O(1)]
public ListNode midNode(ListNode head) {
    if (head == null) return 0;
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

// Brute Force [Time: O(n) Space: O(1)]
public ListNode midNode(ListNode head) {
    ListNode current = head;
    int count = 0;
    while (current != null) {
        current = current.next;
        count ++;
    }
    count /=2;
    current = head;
    while (count > 0) {
        current = current.next;
        count--;
    }
    return current;
}
