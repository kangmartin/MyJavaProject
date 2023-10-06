package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {

    /** * Pops the top element off the stack and returns it. * */
    E pop();


    /**
     * **Pushes** an integer onto the top of the stack.
     *
     */
    void push(E x);


    /**
     * **Checks if the stack is empty.**
     *
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }



    /**
     * **Returns the number of elements in the stack.**
     */



    int numOfElems();


    /**
     * **Returns the top element of the stack without removing it.**
     *
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
