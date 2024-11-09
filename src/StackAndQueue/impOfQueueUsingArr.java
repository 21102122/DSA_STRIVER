package StackAndQueue;


import java.util.Queue;

class queue{
    private int maxSize ;    // max size of the queue
    private  int[] QueueArr;  // arr to store the queue element
    private int front;  // index of front element
    private  int rare; // index of rare element;
     private  int currentSize;  // current number of element in the queue

    public  queue (int size){
        maxSize = size;
        QueueArr = new int [maxSize];
        front = 0;
         rare = -1;
          currentSize = 0;
    }
    public void enqueue(int value){
        if(ifFull()){
            System.out.println(" overflow");
        }else{
            rare  = ( rare+1)%maxSize;
            QueueArr[rare]= value;
            currentSize++;
            System.out.println("enqueued" +  value);
        }
    }



    public int dequeue(){
        if (isEmpty()){
            System.out.println(" queue underflow");
            return -1;
        }else{
            int dequeuedValued = QueueArr[front];
            front = (front +1)% maxSize;
            currentSize --;
            return  dequeuedValued;


        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        else {
            return  QueueArr[front];
        }
    }
    public  boolean isEmpty(){
        return  currentSize == 0;
    }
    public boolean ifFull() {
        return  currentSize == maxSize;
    }

}

public class impOfQueueUsingArr {
    public static void main(String[] args) {
        queue queue = new queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: " + queue.peek());
        queue.dequeue();
        System.out.println("Front element after dequeue is: " + queue.peek());
    }
}
