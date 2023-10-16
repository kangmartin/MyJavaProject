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
        System.out.println("New element added in queue !\n" + queueOfInts.toString());
        assertEquals("1", queueOfInts.toString());
        queueOfInts.enqueue(2);
        System.out.println("New element added in queue !\n" + queueOfInts.toString());
        assertEquals("1 2", queueOfInts.toString());
    }

    /** Tests removing the front element from the queue and verifying the dequeued value and size. */
    @Test
    void testDequeue() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        queueOfInts.enqueue(4);
        System.out.println("New elements added in queue !\n" + queueOfInts.toString());
        assertEquals("1 2 3 4", queueOfInts.toString());
        queueOfInts.dequeue();
        System.out.println("Element removed from queue !\n" + queueOfInts.toString());
        assertEquals("2 3 4", queueOfInts.toString());
    }

    /** Tests the count of elements in the queue after enqueuing multiple elements. */
    @Test
    void testNumOfElems() {
        assertEquals(0, queueOfInts.numOfElems());

        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        queueOfInts.enqueue(4);

        System.out.println(queueOfInts.toString());
        System.out.println("Number of elements in queue: " + queueOfInts.numOfElems());
        assertEquals(4, queueOfInts.numOfElems());

        System.out.println("Removing 2 elements from queue...");
        for (int i = 0; i < 2; i++) {
            queueOfInts.dequeue();
        }

        System.out.println(queueOfInts.toString());
        System.out.println("Number of elements in queue: " + queueOfInts.numOfElems());
        assertEquals(2, queueOfInts.numOfElems());
    }

    /** Tests peeking at the front element of the queue without removing it after enqueuing elements. */
    @Test
    void testPeek() {
        queueOfInts.enqueue(1);
        assertEquals(1, queueOfInts.peek());
        queueOfInts.enqueue(2);
        assertEquals(1, queueOfInts.peek());
    }


    /** Tests the representation of the queue as a string using toString(). */
    @Test
    void testToString(){
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        queueOfInts.enqueue(4);
        assertEquals("1 2 3 4", queueOfInts.toString());
    }
}
