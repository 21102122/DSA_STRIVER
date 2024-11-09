package LinkedList;

public class leetcode141 {
    Node head;
    public boolean hasCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
