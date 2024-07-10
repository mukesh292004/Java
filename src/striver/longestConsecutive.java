package striver;

import java.util.Arrays;
import java.util.HashSet;

public class longestConsecutive {
    public static void main(String[] args) {
        // consecutive mean continous 
        //[102,4,100,1,101,3,1,2,1]
        // some consecutive  for 102 is 102only
        // for 4=4,100,101,102is the sequence
        // no repeatation 
		int arr[] = {102,4,100,1,101,3,1,2,1,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119};
		int N = arr.length;
		System.out.println(findLongestConseqSubseq(arr, N));

		// optimal approach

		System.out.println(findLcs(arr, N));
		
    }
    	static int findLongestConseqSubseq(int arr[], int N)
	{
	  Arrays.sort(arr);  //n long n
	  int min=arr[0];
	  int count =1;
	  int max=1;
	  for(int i=1;i<N;i++){
	      if(arr[i]-1==min){
	          count++;
	          min=arr[i];
	      }
	      else if(min!=arr[i]){
	          count=1;
	          min=arr[i];
	      }
	      max=Math.max(max,count);
	  }
	  return max;
	}

	static int findLcs(int arr[], int N)
	{
	  HashSet<Integer> set = new HashSet<>();
	  for(int i=0;i<N;i++){
	      set.add(arr[i]);
	  }
	  int max=0;
	  int count=0;
	  for(int i=0;i<N;i++){
	      if(!set.contains(arr[i]-1)){
				          count=1;
	          while(set.contains(arr[i]+count)){
	              count++;
	          }
	          max=Math.max(max,count);
	      }
                
		  }
		  return max;
	  }
	}
