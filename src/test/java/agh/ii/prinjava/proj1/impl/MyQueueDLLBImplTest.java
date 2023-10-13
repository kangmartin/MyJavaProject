package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();
    /** Test the enqueue method. */
    @Test
    void testEnqueue() {
        queueOfInts.enqueue(1);
        assertEquals(1, queueOfInts.numOfElems());
        assertEquals(1, queueOfInts.peek());
    }

    /** Test the dequeue method. */
    @Test
    void testDequeue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        assertEquals(1, queueOfInts.dequeue());
        assertEquals(1, queueOfInts.numOfElems());
    }

    /** Test the numOfElems method. */
    @Test
    void testNumOfElems() {
        assertEquals(0, queueOfInts.numOfElems());
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        queueOfInts.enqueue(4);
        assertEquals(4, queueOfInts.numOfElems());
    }

    /** Test the peek method. */
    @Test
    void testPeek() {
        queueOfInts.enqueue(1);
        assertEquals(1, queueOfInts.peek());
        queueOfInts.enqueue(2);
        assertEquals(1, queueOfInts.peek());
    }
}
