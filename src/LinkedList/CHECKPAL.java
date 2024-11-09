package LinkedList;

public class CHECKPAL {
    Node head;

    // Node class definition
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node is a palindrome
        }

        Node slow = head;
        Node fast = head;

        // Step 1: Find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        // Step 3: Compare the two halves
        Node firstHalf = head;
        Node secondHalf = prev; // This is the head of the reversed second half

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false; // Not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true; // It is a palindrome
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, set the head
            return;
        }

        Node temp = head;
        // Traverse to the end of the list
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; // Add the new node at the end
    }

    public static void main(String[] args) {
        CHECKPAL list = new CHECKPAL();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);

        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
