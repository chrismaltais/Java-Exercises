// Merge two sorted linked lists and return it as a new list.
// The new list should be made by splicing together the nodes of the first two lists.

class Solution {
    public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode dummyHead = new ListNode(0);
        ListNode runner = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                runner.next = l1;
                l1 = l1.next;
            } else {
                runner.next = l2;
                l2 = l2.next;
            }
            runner = runner.next;
        }
        runner.next = l1 == null ? l2 : l1;
        return dummyHead.next;
    }
}
