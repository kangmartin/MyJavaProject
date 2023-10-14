
# Java Project: Stacks and Queues

This project provides implementations for stacks and queues using a doubly linked list.

## Project Structure

- `DLinkList<E>`: A generic doubly linked list.
- `MyQueue<E>`: An interface for a generic type queue.
- `MyStack<E>`: An interface for a generic type stack.
- `MyQueueDLLBImpl<E>`: An implementation of the `MyQueue<E>` interface using a doubly linked list.
- `MyStackDLLBImpl<E>`: An implementation of the `MyStack<E>` interface using a doubly linked list.

## Classes and Interfaces Details with Examples

### DLinkList<E>
```java
DLinkList<Integer> list = new DLinkList<>();
list.addFirst(5);
list.addLast(10);
System.out.println(list); // Expected output: 5 10
```
- Main methods: `addFirst(E e)`, `addLast(E e)`, `removeFirst()`, `removeLast()`

### MyQueue<E>
```java
MyQueue<Integer> queue = MyQueue.create();
queue.enqueue(5);
queue.enqueue(10);
System.out.println(queue.dequeue()); // Expected output: 5
```
- Main methods: `enqueue(E x)`, `dequeue()`, `isEmpty()`, `numOfElems()`, `peek()`

### MyStack<E>
```java
MyStack<Integer> stack = MyStack.create();
stack.push(5);
stack.push(10);
System.out.println(stack.pop()); // Expected output: 10
```
- Main methods: `push(E x)`, `pop()`, `isEmpty()`, `numOfElems()`, `peek()`

### MyQueueDLLBImpl<E>
```java
MyQueueDLLBImpl<Integer> queue = new MyQueueDLLBImpl<>();
queue.enqueue(5);
queue.enqueue(10);
System.out.println(queue.dequeue()); // Expected output: 5
```
- Main methods: `enqueue(E x)`, `dequeue()`, `numOfElems()`, `peek()`

### MyStackDLLBImpl<E>
```java
MyStackDLLBImpl<Integer> stack = new MyStackDLLBImpl<>();
stack.push(5);
stack.push(10);
System.out.println(stack.pop()); // Expected output: 10
```
- Main methods: `push(E x)`, `pop()`, `numOfElems()`, `peek()`

## Testing

Unit tests are provided for each implementation to ensure methods functionality.

## Contributors
- Martin KANG
- Julie MAHOT
- ***
