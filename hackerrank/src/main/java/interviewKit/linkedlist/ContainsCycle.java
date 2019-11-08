package interviewKit.linkedlist;

public class ContainsCycle {
    class Node {
        int data;
        Node next;
    }

    boolean hasCycle(Node head) {
        if (head == null) return false;

        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
}
