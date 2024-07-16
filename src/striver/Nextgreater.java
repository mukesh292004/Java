package striver;

import java.util.Arrays;
import java.util.Stack;

public class Nextgreater {
    public static void main(String[] args) {
        long arr[]={1,3,2,4};
        int n=4;
       System.out.println( Arrays.toString(nextLargerElement(arr, n)));
    }
   
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long>stack=new Stack<>();
      long[]a=new long[n];
      
      for(int i=n-1;i>=0;i--){
          while(!stack.isEmpty()&&stack.peek()<=arr[i]){
              stack.pop();
          }
         if(stack.isEmpty()){
             a[i]=-1;
         }
         else{
             a[i]=stack.peek();
         }
         stack.push(arr[i]);
      }
      return a;
    } 

}
