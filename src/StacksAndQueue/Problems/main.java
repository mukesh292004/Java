package StacksAndQueue.Problems;

import java.util.Arrays;

import StacksAndQueue.Stack;
import StacksAndQueue.StackExeption;

public class main {
    public static void main(String[] args) throws StackExeption {
        
        // int x=10;
        // int arr[]={4,2,4,5,1};
        // int arr2[]={2,1,8,5};
        // int sum=0;
        // int count=0;
        // System.out.println(towstack(x, arr, arr2, sum, count)-1);
      System.out.println(Histogram(new int[]{2,1,5,6,2,3}));


    }

   public static int Histogram(int height[]) throws StackExeption{
     Stack  stack=new Stack();
       int max=0;
       for(int i=1;i<height.length;i++){
        while(!stack.isEmpty()&& height[i]<height[stack.peek()]){
            max=getmax(height, stack,max,i);
        }
        stack.push(i);
       }
        
     return max;

   }
   public static int getmax(int arr[],Stack stack,int max,int i) throws StackExeption{
    int area;
    int popped=stack.pop();
    if(stack.isEmpty()){
        area=arr[popped]*i;
    }
    else{
        area=arr[popped]*(i-1-stack.peek());
    }
    return Math.max(area,max);
    
    
   }


     
    public static int  towstack(int x,int a[],int b[],int sum,int count){
              if(sum>x){
                return count;
              }
              if(a.length==0||b.length==0){
                return count;
              }
              int ans=towstack(x, Arrays.copyOfRange(a, 1,a.length), b, sum+a[0], count+1);
              int ans2=towstack(x,a, Arrays.copyOfRange(b, 1,b.length), sum+a[0], count+1);
                return Math.max(ans, ans2);
    }

  //  public void queueusingstack(){
         // 2 stack declare 
         // insert :use while stack1 is empty   {stack2.push(stack1.pop())
        //   after insert thr new item stack.push(item);
        //   then again copy the elemnts from stack2 
        //   remaining alll the procedure are same peek pop
        // }
        //  }
}
