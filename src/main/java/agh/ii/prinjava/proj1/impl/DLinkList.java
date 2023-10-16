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

    /** Adds an element to the beginning of the list.
     *  If the list is empty, the new node is both the first and the last node.
     *  Otherwise, the new node is the first node and the previous of the first node is set to the new node.
     * */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>();
        newNode.element = e;
        newNode.next = first;
        if (first != null) first.prev = newNode;
        else last = newNode;
        first = newNode;
    }

    /** Adds an element to the end of the list.
     * If the list is empty, the new node is both the first and the last node.
     * Otherwise, the new node is the last node and the next of the last node is set to the new node.
     */
    public void addLast(E e) {
        Node<E> newNode = new Node<>();
        newNode.element = e;
        newNode.prev = last;
        if (last != null) last.next = newNode;
        else first = newNode;
        last = newNode;
    }

    /** Removes and returns the first element of the list.
     * If the list is not empty, set the previous of the first node to null
     * */
    public E removeFirst() {
        E element = first.element;
        first = first.next;
        if (first != null) first.prev = null;
        else last = null;
        return element;
    }

    /** Removes and returns the last element of the list.
     * If the list is not empty, set the next of the last node to null
     * */
    public E removeLast() {
        E element = last.element;
        last = last.prev;
        if (last != null) last.next = null;
        else first = null;
        return element;
    }

    /** Returns a string representation of the list.
     * Iterate through the list and append the elements to the string builder
     * */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node<E> current = first;
        while (current != null) {
            sb.append(current.element).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}
