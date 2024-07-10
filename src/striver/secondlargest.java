package striver;

public class secondlargest {
    public static void main(String[] args) {
        //  to find the largest element in an array use the single for loop it is optimized 
        // by sorting it is n log n
        
        //-------------------------------------------------
        // seconfd largest element also use one loop to fin it 
           int a[]={1,22,33,4,7,12,98,57,14};
        // System.out.println(slarge(a));

        //---------------------------------
        // remove the duplicates 
        int b[]={1,2,2,2,4,5,6,6,7};
        // int s =rmdup(b);
        
        //--------------------
        // k rotate
        int c[]={1,2,3,4,5,6,7,8,9};
        // krotation(c, 5, 9);
        // System.out.println(Arrays.toString(c));

        //---------------------------------
        // move all 0"s to last 
        int arr[]={1,2,5,0,0,1,7,0,10};
        // movezerostolast(arr);
        // System.out.println(Arrays.toString(arr));





        //--------------------------
        // longest subarray brute forece add length rom j to i then check the max len and sum ment then store it in the nax
        // class Solution{
    
   
        //     // Function for finding maximum and value pair
        //     public static int lenOfLongSubarr (int A[], int N, int K) {
        //         int right=0;
        //         int left=0;
        //         int sum=A[0];
        //         int max=0;
        //         while(right<N){
        //             while(left<=right && sum>K){
        //                 sum-=A[left];
        //                 left++;
        //             }
        //             if(sum==K){
        //                 max=Math.max(max,right-left+1);
        //             }
        //             right++;
        //             if(right<N){
        //                 sum+=A[right];
        //             }
        //         }
        //         return max;
        //     }
            
            
        // }




        //----------------------------------------------------------
        // two sum 
        // store it in hashmap all values 
           // a+b=c    then take a and subtract with c   then check the remainin exists in hashmap.
           // another approach is 
        //    arr[12,3,58,7,3] tag=15;
        //    int start=0;int end=len-1;
        //    while(start<end){
        //     int tot=arr[start]+[end];
        //     if(tot==tag){
        //     return "yes";
        //     }
        //     else if(tot <tag){
        //         start++;
        //     }
        //     else{
        //         end++;
        //     }

        //    }
        //    return; no;

 //----------------------------------------------
//  Sort 0s, 1s and 2s

//  class Solution
// {
//     public static void sort012(int arr[], int n)
//     {
//         int start=0,mid=0,end=n-1;
//         while(mid<=end){
//             switch(arr[mid]){
//                 case 0:
//                     swap(arr,start,mid);
//                     start++;
//                     mid++;
//                     break;
//                 case 1:
//                   mid++;
//                   break;
//                  case 2:
//                  swap(arr,mid,end);
//                  end--;
//                  break;
//             }
//         }
//     }
//      public static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }

 
// buy and sell stocks:

// //class Solution {
//     public int maxProfit(int[] prices) {
//         int min=0;
//         int maxprof=prices[0];
//         for(int i=1;i<prices.length;i++){
//             int cost=prices[i]-min;
//             maxprof=Math.max(maxprof,cost);
//             min=Math.min(min,prices[i]);
//         }
//         return maxprof;
//     }
}















    }
    public static int slarge(int a[]){
        int largest=a[0];
        int slarges=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                slarges=largest;
                largest=a[i];
            }
            else if(a[i]<largest&&a[i]>slarges){
             slarges=a[i];
            }
        }
        return slarges;
    }

    public static int rmdup(int[]a){
        int temp=0;
        System.out.print(a[temp]);
        for(int i=1;i<a.length;i++){
            if(a[i]!=a[temp]){
               a[temp+1]=a[i];
               temp++;
               System.out.print(a[temp]);
              
            }
        }
        return temp;
    }

public static void krotation(int a[],int d,int n){
      // brute force
      d=d%n;
      int temp[]= new int[d];
      for(int i=0;i<d;i++){
        temp[i]=a[i];
      }
      for(int j=d;j<n;j++){
        a[j-d]=a[j];
      }
      for(int k=n-d;k<n;k++){
        a[k]=temp[k-(n-d)];
      }
      // optimal use the reverse  for above log n+m space is 2n now it will take O(1)as it does not take the temp arr
      // first reverse the first d elements
      // next reverse the remaining elemnets
      // then reverse the total elements   
}

public static void movezerostolast(int a[]){
    int count=0;
    for(int i=0;i<a.length;i++){
        if(a[i]!=0){
            int temp=a[i];
            a[i]=a[count];
            a[count]=temp;
            count++;
        }
    }}

    

    
}
