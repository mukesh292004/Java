package Recursion.recursion3;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // triangle(4,0);
        int []arr={1,25,34,87,5,36,5,28,1};
        // bubblesort(arr, 0,arr.length-1);
        selectionsort(arr, 0, arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void triangle(int a,int b){
        if(a ==0){
            return;
        }
        if(b < a){
            triangle(a, b+1);
            System.out.print("*"+" ");
        }
        else{
            triangle(a-1, 0);
            System.out.println();
            
        }
    }

    static void bubblesort(int arr[],int a,int b){
        if(b==0){
            return;
        }
        if(a<b){
            if(arr[a]>arr[a+1]){
                int temp=arr[a];
                arr[a]=arr[a+1];
                arr[a+1]=temp;
            }
            bubblesort(arr, a+1, b);
        }
        else{
            bubblesort(arr, 0, b-1);
        }
    }
   
    static void selectionsort(int arr[],int a,int b,int max){
        if(b==0){
            return;
        }
        if (a < b) {
            if (arr[a] > arr[max]) {
                max = a; // Update the index of the maximum element found so far
            }
            selectionsort(arr, a + 1, b, max); // Continue finding the maximum element
        } else {
            // Swap the found maximum element with the last element of the unsorted portion
            int temp = arr[max];
            arr[max] = arr[b];
            arr[b] = temp;
            
            // Move to the next position in the array and reset max to the start of the unsorted portion
            selectionsort(arr, 0, b - 1, 0);
        }
    }
}
