package StacksAndQueue;

public class circularQueue {
    private int data[];
    private static final int DEFAULT_SIZE = 10;

    public circularQueue(){
        data = new int[DEFAULT_SIZE];
    }
    public circularQueue(int size){
        data = new int[size];
    }

 int end=0;
 int front=0;
 int size=0;


    public boolean enqueue(int item) throws QueueException{
        // if(isFull())
        //     throw new QueueException("Queue is Full");
        data[end++] = item;
        end=end % data.length;  // this maintain  the circular queue as end is 5 and length 5 then 5%5=0 0 is the next index
              
        size++;
        return true;
    }
    public int dequeue() throws QueueException{
        if (isEmpty()) {
            throw new QueueException("Queue is Empty");
        }
        int temp = data[front++];
        front=front%data.length;
        size--;
        return temp;
    }
    public int front() throws QueueException{
        if(isEmpty())
            throw new QueueException("Queue is Empty");

        return data[front];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == data.length;
    }
    public void display(){
        int i=front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i=i%data.length;

        }while(i!=end);
        System.out.println("END");
    }
}
