package LinkedList;

public class lenofloopll {
    Node head;
    public int detectCycle(Node head){
     Node slow = head;
     Node fast = head;
     while (fast!= null&& fast.next!= null){
         slow = slow.next;
         fast = fast.next.next;
         if(slow== fast){
             Node current = slow;
             int cnt=1;
             while (current.next != slow){

                 current = current.next;
                 cnt++;
             }
             return cnt;
         }
     }
     return 0;
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next= newNode;
    }
    public static void main(String[] args) {
        lenofloopll list = new lenofloopll();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Creating a cycle for testing: 5 -> 3 (creating a cycle back to node with value 3)
        list.head.next.next.next.next.next = list.head.next; // 5 points to 2

        // Detecting cycle length
        int cycleLength = list.detectCycle(list.head);
        if (cycleLength > 0) {
            System.out.println("Cycle detected! Length of the cycle is: " + cycleLength);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
