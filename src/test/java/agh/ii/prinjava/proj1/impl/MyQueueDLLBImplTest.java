package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    /** Tests adding elements to the queue and verifying the front element and size. */
    @Test
    void testEnqueue() {
        queueOfInts.enqueue(1);
        assertEquals(1, queueOfInts.numOfElems());
        assertEquals(1, queueOfInts.peek());
    }

    /** Tests removing the front element from the queue and verifying the dequeued value and size. */
    @Test
    void testDequeue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        assertEquals(1, queueOfInts.dequeue());
        assertEquals(1, queueOfInts.numOfElems());
    }

    /** Tests the count of elements in the queue after enqueuing multiple elements. */
    @Test
    void testNumOfElems() {
        assertEquals(0, queueOfInts.numOfElems());
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        queueOfInts.enqueue(4);
        assertEquals(4, queueOfInts.numOfElems());
    }

    /** Tests peeking at the front element of the queue without removing it after enqueuing elements. */
    @Test
    void testPeek() {
        queueOfInts.enqueue(1);
        assertEquals(1, queueOfInts.peek());
        queueOfInts.enqueue(2);
        assertEquals(1, queueOfInts.peek());
    }
}
