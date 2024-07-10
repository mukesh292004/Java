package StacksAndQueue;

public class Queue {
    private int data[];
    private static final int DEFAULT_SIZE = 10;
     int end = -1;
    public Queue(){
        data = new int[DEFAULT_SIZE];
    }
    public Queue(int size){
        data = new int[size];
    }
    public void enqueue(int item) throws QueueException{
        if(isFull())
            throw new QueueException("Queue is Full");
        data[++end] = item;
    }
    public int dequeue() throws QueueException{
        if (isEmpty()) {
            throw new QueueException("Queue is Empty");
        }
        int temp = data[0];
        for(int i = 0; i < end; i++){// removing is important the only difference is fifo 1st element is remove and copy the elements 
                                      // removing the element in a queue it take o(n) complexity as we copying the elements n times
            data[i] = data[i+1];
        }
        end--;
        return temp;
    }
    public int peek() throws QueueException{
        if(isEmpty())
            throw new QueueException("Queue is Empty");

        return data[0];
    }
    public boolean isEmpty(){
        return end == -1;
    }
    public boolean isFull(){
        return end == data.length-1;
    }
    public void display(){
        for(int i = 0; i <= end; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    

}
