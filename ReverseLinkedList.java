public class LinkedList {
    static class ListNode {
        int data;
        ListNode next;
        ListNode(int x) {
            data = x;
            next = null;
        }
    }

    // Method to reverse the linked list
    public ListNode reverseLinkedList(ListNode head) {
        ListNode curr = head;
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Method to display the linked list
    public void display(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main method to test the reverseLinkedList and display methods
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        list.display(head);

        head = list.reverseLinkedList(head);

        System.out.println("Reversed Linked List:");
        list.display(head);
    }
}
