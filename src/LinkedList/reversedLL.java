package LinkedList;

public class reversedLL {
    Node head;
    public Node reversedItretively(){
        Node  prev = head;
        Node curr = head.next;

        while( curr!= null){
            Node nextNode = curr.next;
            curr.next = prev;

//            update
             prev = curr;
             curr = nextNode;
        }
        head.next = null;
        head = prev;
       return  head ;
    }
    public static void main(String[] args) {

    }
}
