package LinkedList;

public class findMidofLL {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            Node temp = head;
            while (temp.next!= null){
                temp=  temp.next;
            }
            temp.next = newNode;
        }
    }
    public Node findMiddle(){
        Node slow = head;
         Node fast = head;

         while (fast!= null && fast.next!= null){
             slow = slow.next;
             fast= fast.next.next;
         }
         return slow;
    }
    public void display(){
        Node temp = head;
        while (temp!= null ){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        findMidofLL list =  new  findMidofLL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.display();
        Node middle = list.findMiddle();
        if (middle!= null){
            System.out.println("middle element: "+ middle.data);
        }


    }
}
