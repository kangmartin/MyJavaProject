package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList;

    /** Sets up the test environment before each test. */
    @BeforeEach
    void setUp() {
        dLinkList = new DLinkList<>();
    }

    @AfterEach
    void tearDown() {
        dLinkList = null;
    }

    /** Tests adding elements at the beginning of the DLinkList using addFirst(). */
    @Test
    void testAddFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        assertEquals("2 1", dLinkList.toString());
    }

    /** Tests adding elements at the end of the DLinkList using addLast(). */
    @Test
    void testAddLast() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        assertEquals("1 2", dLinkList.toString());
    }

    /** Tests removing the first element from the DLinkList using removeFirst(). */
    @Test
    void testRemoveFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        assertEquals(2, dLinkList.removeFirst());
        assertEquals(1, dLinkList.removeFirst());
    }

    /** Tests removing the last element from the DLinkList using removeLast(). */
    @Test
    void testRemoveLast() {
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        assertEquals(2, dLinkList.removeLast());
        assertEquals(1, dLinkList.removeLast());
    }

    /** Tests the representation of the DLinkList as a string using toString(). */
    @Test
    void testToString() {
        dLinkList.addFirst(10);
        dLinkList.addFirst(20);
        dLinkList.addFirst(30);
        assertEquals("30 20 10", dLinkList.toString());
    }
}
