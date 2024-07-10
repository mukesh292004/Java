package StacksAndQueue;

public class Stack {
    protected int []data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public Stack(){
        data = new int[DEFAULT_SIZE];
    }
    public Stack(int size){
        data = new int[size];
    }
    public void push(int item) throws StackExeption{
        if(isFull())
            throw new StackExeption("Stack is Full");
        data[++ptr] = item;
    }
    public int pop() throws StackExeption{
        if (isEmpty()) {
            throw new StackExeption("Stack is Empty");
        }
        return data[ptr--];
    }
    public int peek() throws StackExeption{
        if(isEmpty())
            throw new StackExeption("Stack is Empty");

        return data[ptr];
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }
    public void display(){
        for(int i = 0; i <= ptr; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}
