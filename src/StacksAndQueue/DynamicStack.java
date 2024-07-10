package StacksAndQueue;

public class DynamicStack extends Stack{
     int temp[]=new int[data.length*2];
        public DynamicStack(){
            super();
        }
        public DynamicStack(int size){
            super(size);
        }
        public void push(int item) throws StackExeption{
           if(isFull()){
               for(int i=0;i<data.length;i++){
                temp[i]=data[i];
               }
               data=temp;
        }
        super.push(item);

}
}