package LinkedList;



    public class oddeven {

        Node head;

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
            // Add the new node at the end
            temp.next = newNode;
        }

        public Node optimise(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node odd = head; // Starting node for odd indexed nodes
            Node even = head.next; // Starting node for even indexed nodes
            Node evenHead = even; // Save the head of the even indexed nodes

            while (even != null && even.next != null) {
                odd.next = even.next; // Link the odd node to the next odd node
                odd = odd.next; // Move odd pointer forward
                even.next = odd.next; // Link the even node to the next even node
                even = even.next; // Move even pointer forward
            }

            odd.next = evenHead; // Link the last odd node to the head of even indexed nodes
            return head; // Return the new head of the list
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            oddeven list = new oddeven();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            System.out.println("Original List:");
            list.printList();

            list.optimise(list.head);

            System.out.println("Optimised List:");
            list.printList();
        }
    }

//    bruteforce
//    public  Node bruteforce(Node head, int[]arr){
//        Node temp = head;
//
//        while (temp!= null && temp.next != null ){
//            add(arr[temp.data]);
//            temp = temp.next.next;
//        }
//
//
//
//         temp  = head.next;
//        while ( temp != null && temp.next != null){
//            add(arr[temp.data]);
//            temp = temp.next.next;
//        }
//
//        int i = 0;
//        temp = head;
//        while (temp != null){
//            temp.data = arr[i];
//            i++;
//            temp = temp.next;
//        }
//        return head;
//
//    }
