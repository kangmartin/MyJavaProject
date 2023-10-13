
package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

import java.util.ArrayList;
import java.util.List;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems = new DLinkList<>();

    /** Pop an element from the top of the stack. */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /** Push an element to the top of the stack. */
    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    /** Get the number of elements in the stack. */
    @Override
    public int numOfElems() {
        int count = 0;
        List<E> temp = new ArrayList<>();
        while (true) {
            try {
                E elem = elems.removeFirst();
                temp.add(elem);
                count++;
            } catch (Exception e) {
                break;
            }
        }

        for (E e : temp) {
            elems.addFirst(e);
        }
        return count;
    }

    /** Peek at the top element without removing it. */
    @Override
    public E peek() {
        E elem = elems.removeFirst();
        elems.addFirst(elem);
        return elem;
    }
}
