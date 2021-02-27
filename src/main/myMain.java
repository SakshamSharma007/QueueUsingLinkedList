package main;

import implementation.Node;
import implementation.myQueue;

public class myMain {
    public static void main(String[] args){
        myQueue queue = new myQueue();
        queue.enqueue(20);
        queue.enqueue(40);
        queue.enqueue(45);
        queue.enqueue(5);
        System.out.println("no. of elements = " + queue.size());

        Node deleted = queue.dequeue();

        if(deleted != null) {
            System.out.println("deleted element = " + deleted.getData());
        }

        queue.enqueue(45);
        queue.enqueue(5);
        queue.enqueue(20);
        queue.enqueue(40);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.traverse();
    }
}
