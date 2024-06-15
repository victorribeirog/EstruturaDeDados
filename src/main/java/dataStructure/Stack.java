package dataStructure;

public class Stack {
    private Node top;
    private int height;

    public class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    public void getTop(){
        if(top == null){
            System.out.println("Stack is empty");
        }else {
            System.out.println("Top is " + top.value);
        }
    }
    public void getHeight(){
        System.out.println("Height is " + height);
    }

    public void print(){
        System.out.println("##################");
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("##################");
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public Node pop(){
        if(height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(2);
        myStack.push(1);
        System.out.println(myStack.pop().value);
        myStack.print();
        myStack.getTop();
        myStack.getHeight();
//        myStack.print();


//        myStack.print();
//        myStack.getTop();
//        myStack.getHeight();

    }
}

