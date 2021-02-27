package implementation;

import mtInterface.QueueADT;

public class myQueue implements QueueADT {
    //head
    private Node front;
    //tail
    private Node rear;

    private int size;

    public myQueue(){
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(int element) {
        Node node = new Node(element);
        if(!isEmpty()) {
            rear.setNext(node);
            rear = node;
        }
        else{
            front = node;
            rear = node;
        }
        size++;
    }

    @Override
    public Node dequeue() {
        Node response = null;
        if(isEmpty()){
            response = new Node(front.getData());
            if(size == 1){
                front = null;
                rear = null;
            }
            else{
                    front = front.getNext();
            }
            size--;
        }
        return response;
    }

    @Override
    public Node peek() {
        Node response = null;
        if(!isEmpty()){
            response = new Node(front.getData());
        }
        return  response;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void traverse(){
        Node temp = front;
        System.out.println("Front <---");
        while(temp != null){
            System.out.println(temp.getData() + "<----");
            temp = temp.getNext();
        }
        System.out.println("Rear");
    }
}
