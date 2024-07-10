package StacksAndQueue;

public class explanation {
    // Stacks and Queues are both linear data structures.  
    //stack  
    // stack follows the LIFO (Last In First Out) principle.
    // add item to the top of the stack is called push
    // remove item from the top of the stack is called pop
    // ex : stack of plates
    // time complexity of push and pop is O(1)
    // space complexity is O(n)

     //     Stack<Integer> stack = new Stack<>();
    //     stack.push(1);
    //     stack.push(2);
    //     stack.push(3);
    //    System.out.println(stack.pop());


    // Queue
    // Queue follows the FIFO (First In First Out) principle.
    // add item to the end of the queue is called enqueue
    // remove item from the front of the queue is called dequeue
    // ex : line of people
    // time complexity of enqueue and dequeue is O(1)
    // space complexity is O(n)
    // we can use LinkedList to implement Queue

    // Queue<Integer> queue = new LinkedList<>();
    // queue.add(1);
    // queue.add(2);

    // another way to implement queue is using ArrayDeque
    // Deque<Integer> deque = new ArrayDeque<>();
    // deque.add(1);
    // deque.add(2);
    // deque.add(3);
    // deque.remove(); 
    // System.out.println(deque.remove());
    // System.out.println(deque.remove());
    // System.out.println(deque.remove());
}
