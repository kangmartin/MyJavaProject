package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> first; // Reference to the first node
    private Node<E> last; // Reference to the last node


    // Node definition
    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;
    }

    /** Adds an element to the beginning of the list. */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>();
        newNode.element = e;
        newNode.next = first;
        if (first != null) first.prev = newNode; // If the list is not empty, set the previous of the first node to the new node
        else last = newNode;
        first = newNode;
    }

    /** Adds an element to the end of the list. */
    public void addLast(E e) {
        Node<E> newNode = new Node<>();
        newNode.element = e;
        newNode.prev = last;
        if (last != null) last.next = newNode; // If the list is not empty, set the next of the last node to the new node
        else first = newNode;
        last = newNode;
    }

    /** Removes and returns the first element of the list. */
    public E removeFirst() {
        E element = first.element;
        first = first.next;
        if (first != null) first.prev = null; // If the list is not empty, set the previous of the first node to null
        else last = null;
        return element;
    }

    /** Removes and returns the last element of the list. */
    public E removeLast() {
        E element = last.element;
        last = last.prev;
        if (last != null) last.next = null; // If the list is not empty, set the next of the last node to null
        else first = null;
        return element;
    }

    /** Returns a string representation of the list. */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<E> current = first;
        while (current != null) { // Iterate through the list and append the elements to the string
            sb.append(current.element).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}
