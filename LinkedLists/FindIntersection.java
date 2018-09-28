// Write a program to find the node at which the intersection of two singly linked lists begins.

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lengthA = length(headA);
        int lengthB = length(headB);
        while (lengthA > lengthB) {
            headA = headA.next;
            lengthA--;
        }
        while (lengthB > lengthA) {
            headB = headB.next;
            lengthB--;
        }
        while (headB != null && headA != null) {
            if (headB == headA) return headB;
            headB = headB.next;
            headA = headA.next;
        }
        return null;
    }
    
    private int length(ListNode head) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        return length;
    }
}
