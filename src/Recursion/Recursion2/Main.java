package Recursion.Recursion2;

public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,25,68,14};
        
        // System.out.println(recursive(arr,0));
        // System.out.println(recursiveLinearsearch(arr,0,5));
         System.out.println(recursiveBinarySearch(arr,0,arr.length-1,14));
        
    }
    public static boolean recursive(int arr[],int index){
      if(index==arr.length-1 ){
        return true;
      }
      return arr[index]<arr[index+1]&&recursive(arr, index+1);

    }
    public static int recursiveLinearsearch(int arr[],int index,int target){
        if(index==arr.length-1){
          return -1;
        }
        return arr[index]==target?index: recursiveLinearsearch(arr, index+1,target);
  
      }
      public static int recursiveBinarySearch(int arr[],int start,int end,int target){
          if(start>=end){
            return-1;
          }
         int mid=start+(end-start)/2;
         if(target>arr[mid]){
            start=mid+1;
         }
         else{
            end=mid-1;
         }
         return arr[mid]==target?mid:recursiveBinarySearch(arr, start, end, target);
      }
   
}
