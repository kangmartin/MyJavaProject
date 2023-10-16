package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue based on a doubly linked list.
 *
 * @param <E> the type of elements stored in this queue
 */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {

    private final DLinkList<E> elems = new DLinkList<>();
    private int size = 0;

    /**
     * Adds an element to the end of the queue.
     *
     * @param x the element to add
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
        size++;
    }

    /**
     * Removes and returns the element at the front of the queue.
     *
     * @return the element at the front of the queue
     */
    @Override
    public E dequeue() {
        size--;
        return elems.removeFirst();
    }

    /**
     * @return the number of elements in the queue.
     */
    @Override
    public int numOfElems() {
        return size;
    }

    /**
     * @return the element at the front of the queue without removing it.
     */
    @Override
    public E peek() {
        E firstElem = elems.removeFirst();
        elems.addFirst(firstElem);
        return firstElem;
    }

    /**
     * @return a string representation of the queue
     */
    @Override
    public String toString() {
        return elems.toString();
    }
}
