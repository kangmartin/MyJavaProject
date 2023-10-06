package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {

    /** Enqueues an integer onto the end of the queue. */
    void enqueue(E x);

    /** Dequeues the last element of the queue and returns it. */
    E dequeue();

    /** Checks if the queue is empty. */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /** Returns the number of elements in the queue. */
    int numOfElems();

    /** Returns the last element of the queue without removing it. */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
