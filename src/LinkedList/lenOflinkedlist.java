package LinkedList;

public class lenOflinkedlist {
 static    Node head;
    public static int len(Node Head){
        int cnt = 0;
        Node temp = head;
        while (temp != null)
        {

            temp = temp.next;
            cnt++;
        }
        return cnt;

    }
    public static void main(String[] args) {
        System.out.println(len(head));

    }
}
