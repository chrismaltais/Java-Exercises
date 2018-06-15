// Given the pointer to the head node of a linked list and an integer to add to the list. 
// Create a new node with the given integer, 
// insert this node at the head of the linked list and return the new head node. 


/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */

static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
    SinglyLinkedListNode head = new SinglyLinkedListNode(data);
    if (llist == null) {
        return head;
    } else {
        head.next = llist;
        return head;
    }
}