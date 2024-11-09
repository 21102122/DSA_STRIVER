package DoubleLinkedList;

public class insertAtNode {
    Node head;

    public void insertAtBeig(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        // Traverse to the last node
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        newNode.prev = prevNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }

    public void insertBefore(Node nextNode, int data) {
        if (nextNode == null) {
            System.out.println("The given next node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = nextNode;
        newNode.prev = nextNode.prev;

        if (nextNode.prev != null) {
            nextNode.prev.next = newNode;
        } else {
            head = newNode; // Update head if inserting before the first node
        }
        nextNode.prev = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertAtNode dll = new insertAtNode();

        // Insert nodes at the beginning
        dll.insertAtBeig(3);
        dll.insertAtBeig(2);
        dll.insertAtBeig(1);

        // Insert nodes at the end
        dll.insertAtEnd(4);
        dll.insertAtEnd(5);

        // Display the list
        System.out.print("Doubly Linked List: ");
        dll.display();

        // Insert after the node with value 2
        dll.insertAfter(dll.head.next, 6); // Inserts 6 after node with value 2
        System.out.print("After inserting 6 after 2: ");
        dll.display();

        // Insert before the node with value 4
        dll.insertBefore(dll.head.next.next.next, 7); // Inserts 7 before node with value 4
        System.out.print("After inserting 7 before 4: ");
        dll.display();
    }
}


