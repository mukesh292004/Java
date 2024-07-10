package StacksAndQueue;
public class main {
    public static void main(String[] args) throws QueueException{
    //  StackQueue stack = new StackQueue(5);
     DynamicStack stack = new DynamicStack(5);
    //   stack.push(1);
    //     stack.push(2);
    //     stack.push(3);
    //     stack.push(4);
    //     stack.push(5);
    //     stack.push(5);
    //     stack.push(5);
    //     stack.push(5);
    //     stack.push(5);
    //     stack.push(5);
        
    //     stack.display();
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
  

    // Queue queue = new Queue(5);
    // queue.enqueue(5);
    // queue.enqueue(4);
    // queue.enqueue(3);
    // queue.enqueue(2);
    // queue.enqueue(1);
    // queue.dequeue();
    // queue.display();


    circularQueue cQueue=new circularQueue(5);
    cQueue.enqueue(10);
    cQueue.enqueue(9);
    cQueue.enqueue(8);
    cQueue.enqueue(7);
    cQueue.enqueue(6);
    cQueue.dequeue();
    cQueue.dequeue();
    cQueue.enqueue(200);
    cQueue.enqueue(200);
    cQueue.display();

       
   
    

            
    }
}
