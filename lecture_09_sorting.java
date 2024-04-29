//          Bubble sort -->
// import java.util.*;
// public class lecture_09_sorting{
//     public static void sort(int arr[]){
//         for(int i =0; i< arr.length-1; i++){
//             for(int j =0; j < arr.length-1- i; j++ ){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }

//     }
        // public static void printarr(int arr[]){
        //     for(int k = 0; k < arr.length; k++){
        //         System.out.print(arr[k] + " ");

        //     }
        //     System.out.println();
        // }




//     public static void main(String args[]){
//         int arr[] = {5,4,1,3,2};
//         sort(arr);
//         printarr(arr);

//     }
// }

//  time complexicity for this --> O(n^2)

// ===================================================================================================

//       selection sort

// import java.util.*;
// public class lecture_09_sorting{

//     public static void selectionsort( int arr[]){
//         for(int i =0; i < arr.length-1; i++){
//             int minPosition = i;
//             for(int j = i+1; j < arr.length; j++){
//                 if(arr[minPosition] > arr[j]){   // when arr of minposition is greater than arr of j then the value of j store in minposition , but if we need decreasing order then change the symbol from > to <.
//                     minPosition = j;
//                 }


//             }
//             //  swap
//             int temp = arr[minPosition];
//             arr[minPosition] = arr[i];
//             arr[i] = temp;

            

//         }
//     }


//  here we are printing the sorted array -->
    // public static void printarr(int arr[]){
    //         for(int k = 0; k < arr.length; k++){
    //             System.out.print(arr[k] + " ");

    //         }
    //         System.out.println();
    //     }
    // public static void main(String args[]){
    //     int arrs[] = {1,5,4,2,3};
    //  here we first call sselectionsort due to which array will sort then we call printarr then in printarr, so sorted array will stored in arrs and then passed as argument in printarr.
    //     selectionsort(arrs);
    //     printarr(arrs);

    // }
// }


//  time complexicity --> O(n^2)

// ===========================================================================================
//          Insertion sort -->


// import java.util.*;
// public class lecture_09_sorting{

//     public static void Insertionsort(int arr[]){
//         for(int i =1; i < arr.length; i++){
//             int current = arr[i];  // for comparison between previous and current arr value.
//             int previous = i-1;

//             while(previous >=0 && arr[previous] > current){
//                 arr[previous +1] = arr[previous];
//                 previous--;
//             }

//             arr[previous +1] = current;

//         }
//     }
//         public static void printarr(int arr[]){
//             for(int k = 0; k < arr.length; k++){
//                 System.out.print(arr[k] + " ");

//             }
//             System.out.println();
//         }


//         public static void main(String args[]){
//             int arrs[] = {5,4,1,3,2};
//             Insertionsort(arrs);
//             printarr(arrs);
//         }

// }


//  all three have same time complexicity that is  --> O(n^2)


// ----------------------------------------------

//          Inbuild sort --->


//  for import inbuild sort pacakge -->  import java.util.Arrays; then Arrays.sort(arr)  

//  time complexicity for this code is O(n logn) which is less then O(n^2)


// import java.util.Arrays;
// public class lecture_09_sorting{

//     public static void printarr(int arr[]){
//         for(int k =0; k < arr.length; k++){
//             System.out.print(arr[k] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arrs[] = {5,4,1,3,2};
//         // Arrays.sort(arrs);
//         //  for particular sorting -->
//         //  Array.sort(arrs, starting_index, index where you go upto)
//         Arrays.sort(arrs, 0, 4);

//         printarr(arrs);
//     }
// }


// ----------------

//  for reverse order we need  --> import java.util.Collections, then
//  Arrays.sort(arr, Collections.reverseOrder())
//  Arrays.sort(arr,starting_index, index we go upto, Collections.reverseOrder())


// import java.util.Arrays;
// import java.util.Collections;
// public class lecture_09_sorting{

    // public static void printarr(Integer arr[]){
    //     for(int k =0; k < arr.length; k++){
    //         System.out.print(arr[k] + " ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String args[]){
    //     Integer arrs[] = {5,4,1,3,2};
       
    //     Arrays.sort(arrs, Collections.reverseOrder());
    //     printarr(arrs);
    // }
// }



// =========================================================================

//           counting sort -->


import java.util.*;

public class lecture_09_sorting {
    public static void countingsort(int arr[]) {
        // Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Initialize count array  --> for calculating frequency of the numbers present in old array
        int count[] = new int[largest + 1];  // here we add largest +1 because in largest,.  largest number will be stored from the old arr with fixed length but in new arr it start  from 0th index so we need one more length to cover all element of old array.  //// eg --> in largest = 5, will store so the length of count arr is 6, that's how all element of that array is covered --> 0,1,2,3,4,5  and the deafult value in count array is zero in every index.
// Yeh code snippet ek array count ko declare karta hai jo integers ki type mein hai. Is array ka size largest variable ke hisaab se decide hota hai. + 1 isliye hai kyunki Java mein (aur kai aur programming languages mein bhi) array indexing 0 se shuru hoti hai. Toh agar largest woh maximum value hai jo aap array mein store karna chahte hain, toh aapko largest + 1 size ka array chahiye hoga taaki sabhi possible values 0 se lekar largest tak ko accommodate kiya ja sake.

        // Count occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Sort the array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            } 
        }
    }

    public static void printarr(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arrs[] = {5, 4, 1, 3,1,3,4};
        countingsort(arrs);
        printarr(arrs);
    }
}


