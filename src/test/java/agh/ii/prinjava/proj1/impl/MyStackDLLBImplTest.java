package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    /** Tests pushing elements to the stack and verifying the top using peek(). */
    @Test
    void testPush() {
        stackOfInts.push(1);
        System.out.println("New element added !");
        System.out.println("My Stack: " + stackOfInts.toString());
        assertEquals("1", stackOfInts.toString());

        stackOfInts.push(2);
        System.out.println("New element added !");
        System.out.println("My Stack: " + stackOfInts.toString());
        assertEquals("2 1", stackOfInts.toString());

        stackOfInts.push(99);
        System.out.println("New element added !");
        System.out.println("My Stack: " + stackOfInts.toString());
        assertEquals("99 2 1", stackOfInts.toString());

    }

    /** Tests popping elements from the stack and verifying the popped values. */
    @Test
    void testPop() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        assertEquals("2 1", stackOfInts.toString());
        stackOfInts.pop();
        assertEquals("1", stackOfInts.toString());
        stackOfInts.pop();
        assertEquals("", stackOfInts.toString());
    }

    /** Tests the count of elements in the stack after pushing elements. */
    @Test
    void testNumOfElems() {
        assertEquals(0, stackOfInts.numOfElems());
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.numOfElems());
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.numOfElems());
    }

    /** Tests peeking at the top element of the stack without removing it. */
    @Test
    void testPeek() {
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.peek());
        System.out.println("My Stack: " + stackOfInts.toString());
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.peek());
        System.out.println("My Stack: " + stackOfInts.toString());
    }


    /** Tests the representation of the stack as a string using toString(). */
    @Test
    void testToString() {
        stackOfInts.push(10);
        stackOfInts.push(20);
        stackOfInts.push(30);
        assertEquals("30 20 10", stackOfInts.toString());
    }
}
