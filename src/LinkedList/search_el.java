package LinkedList;

public class search_el {
    static Node head;  // Static head for the linked list

    public static boolean search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        // Initialize the linked list: 1 -> 2 -> 3
        int[] arr = {1, 2, 3};
        head = new Node(arr[0]);           // Set the static head
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int target = 2;
        boolean found = search(target);
        System.out.println("Target " + target + (found ? " found." : " not found."));
    }
}

// Definition of Node class


