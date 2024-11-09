package LinkedList;


import java.util.LinkedList;

public class insertAtIndex {
    Node head;

    public void insertAtindex(int index, int data){
        Node newnode = new Node(data);


        if (index== 0){
            newnode.next = head;
            head = newnode;
            return;
        }
        Node current = head;
        int count = 0;

        while ( current != null && count <index -1){
            current = current.next;
            count++;
        }

        if (current == null){
            System.out.println("index out of bound");
            return;
        }
        newnode.next = current.next;
        current.next = newnode;
    }

    public void printList(){
        Node current = head;
        while ( current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insertAtIndex List = new insertAtIndex();
        List.insertAtindex(0,10);
        List.insertAtindex(1,10);
        List.insertAtindex(2,10);
        List.insertAtindex(3,10);
        List.insertAtindex(4,10);
        List.insertAtindex(5,10);
        List.insertAtindex(6,10);
        List.insertAtindex(3,4);
        List.printList();
    }
}
