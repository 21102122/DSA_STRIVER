package LinkedList;

public class reverseLLrec {
    Node head;

    // Define the Node class inside reverseLLrec
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Recursive method to reverse the linked list
    public Node reverserec(Node head) {
        // Base case: if head is null or it's the last node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call to reverse the rest of the list
        Node newHead = reverserec(head.next);

        // Reverse the pointers
        head.next.next = head;
        head.next = null;

        return newHead; // Return new head after full reversal
    }

    // Add method to insert a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        // Traverse to the end of the list
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        reverseLLrec list = new reverseLLrec();

        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        // Display original list
        System.out.println("Original List:");
        list.display();

        // Reverse the list and update head
        list.head = list.reverserec(list.head);

        // Display reversed list
        System.out.println("Reversed List:");
        list.display();
    }
}
