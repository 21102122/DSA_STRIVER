package LinkedList;

class Node {
    int data;
    Node next; // Use 'next' instead of 'Value' for consistency

    public Node(int data) { // Constructor should only take one parameter
        this.data = data;
        this.next = null; // Initialize 'next' to null
    }
}

public class InsertAtTheEnd {
    Node head;

    public void insertAtEnd(int data) {
        head = insertRecursively(head, data);
    }

    private Node insertRecursively(Node current, int data) {
        // Base case: If current is null, create a new node
        if (current == null) {
            return new Node(data); // Missing semicolon added here
        }
        // Recur for the next node
        current.next = insertRecursively(current.next, data);
        return current; // Return the unchanged current node
    }

    private void printRecursively(Node current) {
        // Print the linked list recursively
        if (current != null) {
            System.out.print(current.data + " ");
            printRecursively(current.next);
        }
    }

    // Method to initiate the printing of the linked list
    public void printList() {
        printRecursively(head);
    }

    public static void main(String[] args) {
        InsertAtTheEnd linkedList = new InsertAtTheEnd();
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(4);

        System.out.println("Linked List:");
        linkedList.printList(); // Output: 1 2 3 4
    }
}
