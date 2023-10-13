package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {

    private final DLinkList<E> elems;
    private int size = 0;

    /** Constructor to initialize the queue. */
    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /** Enqueue an element to the end of the queue. */
    @Override
    public void enqueue(E x) {

        elems.addLast(x);
        size++;
    }

    /** Dequeue and return the first element from the queue. */
    @Override
    public E dequeue() {

        size--;
        return elems.removeFirst();
    }

    /** Return the number of elements in the queue. */
    @Override
    public int numOfElems() {

        return size;
    }

    /** Peek and return the first element without removing it. */
    @Override
    public E peek() {

        E firstElem = elems.removeFirst();
        elems.addFirst(firstElem);
        return firstElem;
    }
}
