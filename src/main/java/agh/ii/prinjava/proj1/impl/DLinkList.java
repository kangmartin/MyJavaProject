package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> first;
    private Node<E> last;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>();
        newNode.elem = e;
        newNode.next = first;
        if (first != null) first.prev = newNode;
        else last = newNode;
        first = newNode;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>();
        newNode.elem = e;
        newNode.prev = last;
        if (last != null) last.next = newNode;
        else first = newNode;
        last = newNode;
    }

    public E removeFirst() {
        if (first == null) throw new RuntimeException("Cannot remove from an empty list");
        E elem = first.elem;
        first = first.next;
        if (first != null) first.prev = null;
        else last = null;
        return elem;
    }

    public E removeLast() {
        if (last == null) throw new RuntimeException("Cannot remove from an empty list");
        E elem = last.elem;
        last = last.prev;
        if (last != null) last.next = null;
        else first = null;
        return elem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = first;
        while (current != null) {
            sb.append(current.elem).append(" ");
            current = current.next;
        }
        return sb.toString().trim();
    }
}
