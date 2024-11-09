package StackAndQueue;


class Stack{
    private  int maxSize;
    private int [] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }


//    push
    public  void push(int value){
        if (top == maxSize-1){
            System.out.println("Stack overflow");
        }else{
            stackArray[++top]= value;
            System.out.println("Pushed: "+value);
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }else {
            return stackArray[top--];
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // return a sentinel value indicating error
        } else {
            return stackArray[top];
        }
    }
    public boolean isEmpty(){
        return top== -1;
    }
    public boolean isFull(){
        return top == maxSize-1;
    }
}

public class impOfStUsingArr {

    public static void main(String[] args) {
        Stack  stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop is: " + stack.peek());
    }

}
