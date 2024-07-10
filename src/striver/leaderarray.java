package striver;

import java.util.ArrayList;
import java.util.Arrays;

public class leaderarray {
    public static void main(String[] args) {
      // approach from back and store the max and then compare next if it is greater then it is leader;
      int arr[]={7,10,4,10,6,5,2};
      int n=arr.length;
      int max=arr[n-1];
      ArrayList<Integer> res=new ArrayList<>();
      res.add(max);
      for(int i=n-1;i>=0;i--){
          if(arr[i]>max){
              max=arr[i];
              res.add(max);
          }

      

    }
    System.out.println(Arrays.toString(res.toArray()));
    }
}
