package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList;

    @BeforeEach
    void setUp() {
        dLinkList = new DLinkList<>();
    }

    @AfterEach
    void tearDown() {
        dLinkList = null;
    }

    @Test
    void testAddFirst() {
        System.out.println("Test addFirst method:");
        dLinkList.addFirst(1);
        System.out.println("Add first: 1 -> " + dLinkList.toString());
        dLinkList.addFirst(2);
        System.out.println("Add first: 2 -> " + dLinkList.toString());
        assertEquals("2 1", dLinkList.toString());
    }

    @Test
    void testAddLast() {
        System.out.println("Test addLast method:");
        dLinkList.addLast(1);
        System.out.println("Add last: 1 -> " + dLinkList.toString());
        dLinkList.addLast(2);
        System.out.println("Add last: 2 -> " + dLinkList.toString());
        assertEquals("1 2", dLinkList.toString());
    }

    @Test
    void testRemoveFirst() {
        System.out.println("Test removeFirst method:");
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        System.out.println("List after adding elements: " + dLinkList.toString());
        int removedElement = dLinkList.removeFirst();
        System.out.println("Removed first element: " + removedElement + " -> " + dLinkList.toString());
        assertEquals(1, dLinkList.removeFirst());
    }

    @Test
    void testRemoveLast() {
        System.out.println("Test removeLast method:");
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        System.out.println("List after adding elements: " + dLinkList.toString());
        int removedElement = dLinkList.removeLast();
        System.out.println("Removed last element: " + removedElement + " -> " + dLinkList.toString());
        assertEquals(1, dLinkList.removeLast());
    }
}
