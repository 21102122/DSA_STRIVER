package LinkedList;


import java.awt.event.ItemEvent;

public class InsertNewNode {
    static Node head;


    public void insertAtBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!= null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertAtPos(int data, int position){
        Node newNode = new Node(data);
        if (position ==0){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 0; i <position-1&& temp!=null ; i++) {
            temp= temp.next;
        }
        if (temp == null){
            System.out.println("positon out of index");
        return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public void deleteFirst(){
        if (head== null){
            System.out.println("List is empty");
            return;
        }
         head = head.next;
    }
    public void deleteAtEnd(){
        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if (head.next==null)
        {
            head= null;
            return;
        }
        Node temp = head;
        while (temp.next.next!= null){
            temp = temp.next;
        }
        temp.next= null;
    }


    public  static  void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void  deleteAtPosition(int position){
        if (head== null){
            System.out.println("List is empty");

        return;
        }
        if (position == 0){
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i <position-1&&temp!=null ; i++) {
            temp = temp.next;
        }
        if (temp==null|| temp.next== null){
            System.out.println("Position out of bound");
        }
        temp .next = temp.next.next;

    }
    public static void main(String[] args) {
        lenOflinkedlist len = new lenOflinkedlist();
        InsertNewNode List = new InsertNewNode();
        List.insertAtEnd(10);
        List.insertAtEnd(20);
        List.insertAtEnd(30);
        List.insertAtEnd(40);
        System.out.println("Initial List:");
        List.display();  // Output: 10 -> 20 -> 30 -> 40 -> null
        System.out.println("length of the linkedlist: "+len);

        // Delete the first node
        List.deleteFirst();
        System.out.println("After deleting the first node:");
        List.display();  // Output: 20 -> 30 -> 40 -> null
        System.out.println("length of the linkedlist: "+len);

        // Delete the last node
        List.deleteAtEnd();
        System.out.println("After deleting the last node:");
        List.display();  // Output: 20 -> 30 -> null
        System.out.println("length of the linkedlist: "+len);

        // Delete at a specific position
        List.deleteAtPosition(1);
        System.out.println("After deleting node at position 1:");
        List.display();  // Output: 20 -> null
        System.out.println("length of the linkedlist: "+len);

    }
}
