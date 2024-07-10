package Recursion;

public class Binarysearch {
    Binarysearch(int arr[],int target){
        System.out.println(binarySearch(arr,0,arr.length-1,target));
    }
   static int binarySearch(int arr[],int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(arr,start,mid-1,target);
        }
        return binarySearch(arr,mid+1,end,target);
    }
}
