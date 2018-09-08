// Given a singly linked list, determine if it is a palindrome.

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        ListNode reversedList = reverse(s);
        s = head;
        while (reversedList != null) {
            if (s.val != reversedList.val) return false;
            s = s.next;
            reversedList = reversedList.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

