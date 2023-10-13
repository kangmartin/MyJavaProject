package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    /** Test the push() method. */
    @Test
    void testPush() {
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.peek());
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.peek());
    }

    /** Test the pop() method. */
    @Test
    void testPop() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.pop());
        assertEquals(1, stackOfInts.pop());
    }

    /** Test the numOfElems() method. */
    @Test
    void testNumOfElems() {
        assertEquals(0, stackOfInts.numOfElems());
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.numOfElems());
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.numOfElems());
    }

    /** Test the peek() method. */
    @Test
    void testPeek() {
        stackOfInts.push(1);
        assertEquals(1, stackOfInts.peek());
        stackOfInts.push(2);
        assertEquals(2, stackOfInts.peek());
    }
}
