// import java.util.*;
// public class lecture_08_array{

//     public static void update(int marks[], int nonChangable){                // here ints marks[]  is an array which is used as a parameter.

//         nonChangable = 10;
//         for (int i = 0; i < marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }


//     }


//     public static void main(String args[]){

//         // creating an array

//         // int marks[] = new int[90]; // we don't store any number in this array so it's default size is zero but we specify the size of this array is 90.
        
//         // int numbers[] = {1,2,3};        // here  we defined the size of tyhe array that is 3

//         // int moreNumbers[] = {4,5,6};

//         // String fruits[] = {"apple", "mango", "orange"};   // this is string array whose size is 3



// // ------------------------------------------------------------------------------------------------------------ 

//         // input and output

//         // Scanner sc = new Scanner(System.in);
//         // int marks[] = new int [100];     // here the length of an array is 100 and we insert only three array on it.
//         // marks[0] = sc.nextInt();        // physics
//         // marks[1] = sc.nextInt();        // maths
//         // marks[2] = sc.nextInt();        // chemistry

//         // System.out.println("the marks of physics = "+ marks[0]);
//         // System.out.println("the marks of maths = "+ marks[1]);
//         // System.out.println("the marks of chemistry = " + marks[2]);

//         // System.out.println("the length of marks = " + marks.length);

// // --------------------------------------------------------------------------------------------------------------------
//         int marks[] = {97,98,99};
//         int nonChangable = 5;
//         update(marks, nonChangable);
//         System.out.println(nonChangable);

        
//         for(int i = 0; i <marks.length; i++) {
//             System.out.println( "marks is =" + marks[i]);
//         }
// //   arrray is pass by reference so that the value can be changed  but when we pass nonchangeable variable that is pass by value can;t be changed.




//     }
// }




// // // // // ============================================================================================================


// //                                            Linear search -->




// import java.util.*;
// public class lecture_08_array{

//     public static int linearSearch(int numbers[], int keys){
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i] == keys){
//                 return i;
//             }
//         }
//         return -1;
                                                                                                                
//     }
//     public static void main(String args[]){
        
//         int numbers[] = {2,4,6,8,10,12,14,15,16};
//         int keys = 12;
//         int index = linearSearch(numbers, keys);    
//         if(index == -1){
//             System.out.println("Not found");
//         }
//         else{
//             System.out.println("keys is at index: " + index);
//         }

//     }
    
// }


// here in linear search the time complexity is O(n),, in this the loops will run n times

// --------------------------------------------------------------------------------------------------------------

// import java.util.*;
// public class lecture_08_array{


// find the largest number in agiven array -->  1,2,6,3,5


// public static int getlargest(int numbers[]){
//      int largest = Integer.MIN_VALUE  ;      // - infinty
//      int smallest = Integer.MAX_VALUE  ;     // in smallest varialble we store the largest value , remaining value are small from this value so we apply the condition
//     //  System.out.println(largest);
//      for(int i =0; i < numbers.length; i++){
//         if(largest < numbers[i]){
//             largest = numbers[i];
//         }
//         if(smallest > numbers[i]){
//             smallest = numbers[i];
            
//         }
//      }

//      System.out.println("the smallest number is = "+ smallest);
//      return largest;

// }


//     public static void main(String args[]){
//         int numbers[] = {1,2,6,3,5};
//         System.out.println("the largest number is = " + getlargest(numbers));
        
//     }
// }


// ===============================================================================================================
//                                          Binary Search


// import java.util.*;
// public class lecture_08_array{


//     public static int binaryserch(int numbers[], int keys){
//         int start =  0;
//         int end = numbers.length -1;
//         while(start <= end){
//             int mid = (start + end)/2;          // we find the mid index from the elements

//             if( numbers[mid] == keys){
//                 return mid;
//             }
//             if(numbers[mid] > keys){     // then the value is in first half (in left side)
//                 end = mid - 1;

//             }
//             else{
//                 start = mid + 1;
//             }
//         }
//         return -1;

//     }
//     public static void main(String args[]){
//         int numbers[] =  {2, 3, 4, 6, 8, 10, 12};
//         int keys = 10;
//         System.out.println("The value of index is at : " + binaryserch(numbers, keys));



//     }
// }



// ========================================================================================================
//  reverse an arrray

// import java.util.*;
// public class lecture_08_array{
//     public static int reverse(int numbers[]){
//         int start =0;
//         int end = numbers.length-1;

//         while(start < end){

//             // swap without using any other space
//             int temp = numbers[end];
//             numbers[end] = numbers[start];
//             numbers[start] = temp;

//             start++;
//             end--;
//         }
//         return-1;

//     } 
//     public static void main(String args[]){
//         int numbers[] = {1,2,3,4,5};
//         reverse(numbers);

//         for(int i =0; i<numbers.length; i++){
            
//             System.out.print(numbers[i] + " ");
//         }


// // time complexity for this is = O(n)
// // space complexity for this is = O(1)


//     }
// }



// ==================================================================================================================


//        pairs in an array -->


// import java.util.*;
// public class lecture_08_array{
//     public static void array_pairs(int numbers[]){
//         int tp =0;
//         for(int i =0; i < numbers.length; i++){
//             int current = numbers[i]; // 2, 3, 4, 5, 6

//             for(int j = i+1; j < numbers.length; j++){
//                 int next = numbers[j];
//                 System.out.print("(" +  current + ", " + next + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("The total numbers of pairs is = "+ tp);
//     }

//     public static void main(String args[]){
//         int arr[] = {2,3,4,5,6};
//         array_pairs(arr);
//     }
// }




// // the time complexity of this code is O(n^2) because in this nested loop is used.


// ============================================================================================================


//                              printing continuous subarrays 

// import java.util.*;
// public class lecture_08_array{

//     public static void printsubarray(int numbers[]){
//         //  we use nested loop in this because i print itself and other of its component print its subarray.
//         for(int i =0; i <numbers.length; i++){
//             int start = i;
//             for(int j =i; j <numbers.length; j++){
//                 int end = j;
//                 for(int k = i; k<=end; k++){
//                     System.out.print(numbers[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,3,4,5,6};
//         printsubarray(numbers);

//     }
// }


// =================================================================
//  now we are printing the sum of each sub array and find that which sub array has maximun and minimum value.

// import java.util.*;
// public class lecture_08_array{

//     public static void printsubarray(int numbers[]){
//         //  we use nested loop in this because i print itself and other of its component print its subarray.
//         int tp = 0;
//         int maximun_sub_array_value = Integer.MIN_VALUE;
//         int minimum_sub_array_value = Integer.MAX_VALUE;
//         int sum_of_each_subarray = 0;
//         int total_sum =0;


//         for(int i =0; i <numbers.length; i++){
//             int start = i;
//             for(int j =i; j <numbers.length; j++){
//                 int end = j;
//                 for(int k = i; k<=end; k++){
//                     System.out.print(numbers[k] + " ");
//                     sum_of_each_subarray = sum_of_each_subarray+numbers[k];

//                     if(maximun_sub_array_value < sum_of_each_subarray){
//                         maximun_sub_array_value = sum_of_each_subarray;
//                     }
//                     if(minimum_sub_array_value > sum_of_each_subarray){
//                         minimum_sub_array_value = sum_of_each_subarray;
//                     }                    
//                 }
//                 tp++;
//                 total_sum = sum_of_each_subarray + total_sum;
//                 System.out.println("the sum of each subarray is = "+ sum_of_each_subarray);
//                 sum_of_each_subarray =0;             
//             }
//             System.out.println("The sum of subarray that start from "+numbers[i]+ " number is = "+ total_sum);
        
//             total_sum = 0;

            

//         }
//         System.out.println("the total number of sub array is : " + tp);
//         System.out.println("the maximum number of a all sub array value is  : " + maximun_sub_array_value);
//             System.out.println("the minimum sum of a particular sub array value is  : " + minimum_sub_array_value);
     


//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4, 6, 8,10};
//         printsubarray(numbers);
        

//     }
// }


// =====================================================================================================================
//  the time complexity for this code is O(n^3) which is the wrost time complexity and to reduce this we can use prefix array.


// import java.util.*;
// public class lecture_08_array{
//     public static void printsubarray(int numbers[]){
               
//         int maximun_sub_array_value = Integer.MIN_VALUE;
//         int sum_of_each_subarray =0;
//         int prefix[] = new int [numbers.length];

//         prefix[0] = numbers[0];
//         // calculate prefix  array;
//         for(int i =1; i <prefix.length; i++ ){
//             prefix[i] = prefix[i-1] + numbers[i];

//         }
        
//         for(int i =0; i <numbers.length; i++){
//             int start = i;
//             for(int j =i; j <numbers.length; j++){
//                 int end = j;

//                 sum_of_each_subarray = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];

                

//                 if(maximun_sub_array_value < sum_of_each_subarray){
//                     maximun_sub_array_value = sum_of_each_subarray;

//                 }
                                        
//             }
                
                
//         }
        

//         System.out.println("the maximum number of a all sub array value is  : " + maximun_sub_array_value);
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4, 6, 8,10};
//         printsubarray(numbers);

//     }
// }

//  the time complexity for this prefix array is O(n^2) because there are two loops used in this code.


// =================================================================================================


//  we can reduce more time complexity by kadane's rule.

// import java.util.*;
// public class lecture_08_array{
//     public static void kadane(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i = 0; i < numbers.length; i++){
//             cs = cs + numbers[i];
//             if(cs < 0){
//                 cs = 0;

//             } 
//             ms = Math.max(cs, ms);

//         }
//         System.out.println("our maximum sub array sum is = "+ ms);
//     }



//     public static void main(String args[]){
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadane(numbers);
//     }
// }

// ===================================================================================================================
//  trapping rainwater queation from DSA sheet ---> For Interviews

// Given n non- negative integer representing an elevation map where the width of each bar is 1 , compute how much water it can. trap after raining.
//  heights = [4, 2, 0, 6, 3, 2, 5]


//  we use auxiliary arrays --> 

// import java.util.*;
// public class lecture_08_array{
//     public static int trappedRainWater(int height[]){
//         // calculate left max boundary - array
//         int n = height.length;

//         int leftmax[] = new int[n];
//         leftmax[0] = height[0];
//         for(int i = 1; i < n; i++){
//             leftmax[i] = Math.max(height[i], leftmax[i - 1]);
            
//         }
//         // calculate right max boundary - array

//         int rightmax[] = new int[n];
//         rightmax[n-1] = height[n-1];
//         for(int i = n-2; i>=0; i--){
//             rightmax[i] = Math.max(height[i], rightmax[i + 1]);

//         }

//         int trappedWater = 0;

//         // loop 
//         for(int i = 0; i < n; i++){
//             int waterlevel = Math.min(leftmax[i], rightmax[i]);
//             trappedWater += waterlevel - height[i];

//         }

//         return trappedWater;
//         // waterlevel = min(leftmax bound, rightmax bound )
//     }

//     public static void main(String args[]){
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(trappedRainWater(height));
     

//     }
// }

// ==============================================================================
//                 Best Time to Buy Stocks -->
//  you are given an array prices where prices[i] is the price of given stock on the ith day. You what to maximize your profit by choosing a single day to buy one stock and chossing different day in the future to sell that stocks. return the maximum profit you can acheive from this transaction. If you cannot achieve any profit, return 0.
//  prices = [7, 1, 5, 3, 6, 4]


import java.util.*;
public class lecture_08_array{
    public static  int buyandSellStocks(int prices []){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices.length){  // profit
                int profit = prices[i] - buyPrice;   // today's profit
                maxProfit = Math.max(maxProfit, profit);



            }else{
                buyPrice = prices[i];

            }
        }

        return maxProfit;
    }


    public static void main(String args[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyandSellStocks(prices));

    }
}

//  time complexicity for this code is O(n)