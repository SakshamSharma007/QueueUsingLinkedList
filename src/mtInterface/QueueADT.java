package mtInterface;

import implementation.Node;

public interface QueueADT {
    void enqueue(int element);
    Node dequeue();
    Node peek();
    int size();
    boolean isEmpty();
}
