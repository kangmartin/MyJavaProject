
# Java Project: Stacks and Queues

This project provides implementations for stacks and queues using a doubly linked list.

## Project Structure

- `DLinkList<E>`: A generic doubly linked list.
- `MyQueue<E>`: An interface for a generic type queue.
- `MyStack<E>`: An interface for a generic type stack.
- `MyQueueDLLBImpl<E>`: An implementation of the `MyQueue<E>` interface using a doubly linked list.
- `MyStackDLLBImpl<E>`: An implementation of the `MyStack<E>` interface using a doubly linked list.

# How to use ?
## **Examples**

### MyQueue<E>
```java
MyQueue<Integer> queue = MyQueue.create();
queue.enqueue(5);
queue.enqueue(22);
queue.enqueue(10);
queue.enqueue(7);
queue.enqueue(3);
queue.enqueue(1);
System.out.println(queue.toString()); // Expected output: 5 22 10 7 3 1
queue.dequeue(); // Dequeue 2 elements
queue.dequeue();
System.out.println(queue.toString()); // Expected output: 10 7 3 1
```
- Methods: `enqueue(E x)`, `dequeue()`, `numOfElems()`, `peek()`, `toString()`

### MyStack<E>
```java
MyStack<Integer> stack = MyStack.create();
stack.push(5);
stack.push(10);
stack.push(15);
stack.push(20);
stack.push(25);
System.out.println(stack.toString()); // Expected output: 25 20 15 10 5
stack.pop(); // Pop 2 elements
stack.pop();
System.out.println(stack.toString()); // Expected output: 15 10 5
```
- Methods: `push(E x)`, `pop()`, `numOfElems()`, `peek()`,`toString()`

## Testing

Unit tests are provided for each implementation to ensure methods functionality.

## Contributors
- Martin KANG
- Julie MAHOT
- Théo THACH--DELACROIX
