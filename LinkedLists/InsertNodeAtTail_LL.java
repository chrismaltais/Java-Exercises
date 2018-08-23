// You are given the pointer to the head node of a linked list and an integer to add to the list. 
// Create a new node with the given integer. 
// Insert this node at the tail of the linked list 
// and return the head node of the linked list formed after inserting this new node.
// The given head pointer may be null, meaning that the initial list is empty.


/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
 
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    if (head == null) {
        head = new SinglyLinkedListNode(data);
    } else if (head.next != null) {
        insertNodeAtTail(head.next, data);
    } else if (head.next == null) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        head.next = node;
    }
    return head;
}