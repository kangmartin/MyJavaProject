package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems = new DLinkList<>();
    private int size = 0;

    /** Pop an element from the top of the stack. */
    @Override
    public E pop() {
        size--;
        return elems.removeFirst();
    }

    /** Push an element to the top of the stack. */
    @Override
    public void push(E x) {
        elems.addFirst(x);
        size++;
    }

    /** Get the number of elements in the stack. */
    @Override
    public int numOfElems() {
        return size;
    }


    /** Peek at the top element without removing it. */
    @Override
    public E peek() {
        E firstElem = elems.removeFirst();
        elems.addFirst(firstElem);
        return firstElem;
    }

    /** Return a string representation of the stack. */
    @Override
    public String toString() {
        return elems.toString();
    }
}
