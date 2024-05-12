// import java.util.*;
// public class lecture_10_2d_array{

//     //  seraching of element of an array
//     public static boolean search(int matrix[][], int key){  // here we use boolean to come out of loop if condition satisfied.
//         for(int i =0; i <matrix.length; i++){
//             for(int j =0; j < matrix[0].length; j++){
//                 if(matrix[i][j] == key){

//                     System.out.print("key found at ("+ i + "," + j +")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("key not found");
//             return false;
//     }

    
//     public static void main(String args[]){
//         int matrix[][]= new int[3][3];  //here we created 2d array [][] in which there are 3 rows and 3 columns. it means it have 3 * 3 matrix.
//         int n = matrix.length, m = matrix[0].length; // n defines the rows, m  defines the columns elements of first row of matrix in  2d array.
//         Scanner sc = new Scanner(System.in);
//         for(int i =0; i <n; i++){  // i for rows  
//             for(int j =0; j < m; j++){ // j for columns
//                 matrix[i][j] = sc.nextInt();  //  here we store user input in matrix[i][j]
//             }
//         }

//         // output
//          for(int i =0; i <n; i++){
//             for(int j =0; j < m; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         search(matrix, 5);

       
//     }
// }


// --------------------------------------------------------------------------------------------------------------------                                 Interview special
//  spiral matrix quesion   ---> 

// import java.util.*;
// public class lecture_10_2d_array{

//     public static void printSpiral(int matrix[][]){
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;
//         while(startRow <= endRow && startCol <= endCol){

//             // top
//             for(int j = startCol; j <= endCol; j++){
//                 System.out.print(matrix[startCol][j] + " ");
//             }

//             // right 
//             for(int i = startRow +1; i <= endRow; i++){   // here we add +1 because the 0th value will covered in previous for loop 
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // bottom
//             for(int j = endCol-1; j >= startCol; j--){
//                 if( startRow == endRow){   //  here we apply condition because if there are only 1 row is present so loop break and same value not printed again.
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             // left
//             for(int i = endRow -1; i > startRow ; i--){
//                 if(startCol == endCol){      // here we apply condition because if there are only 1 column is present so loop break  
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }

//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;


//         }
//         System.out.println( );



//     }



//     public static void main(String args[]){
        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {8,10,11,12},
        //                   {13,14,15,16}};


//         printSpiral(matrix);


//     }
// }



// --------------------------------------------------------------------------------------------------------------------
//  Diagonal sum -->



// import java.util.*;
// public class lecture_10_2d_array{
//     public static int diagonalSum(int matrix[][]){
//         int sum = 0;

// //  time complexicity for this code is O(n^2)


//         // for(int i =0; i < matrix.length; i++){
//         //     for(int j =0; j < matrix[0].length; j ++){
//         //         if(i == j){
//         //             sum += matrix[i][j];   // for primary diagonal

//         //         }
//         //         else if(i + j == matrix.length-1){   //  when we modifie -> j = matrix.length-1-i
//         //             sum += matrix[i][j];    // for secondary diagonal
//         //         }
//         //     }
//         // }
//         // return sum;




//     // for optimised code


// //  time complexcity for this code is O(n)

//     for(int i =0; i < matrix.length; i++){
//         sum = sum + matrix[i][i];

//         if(i != matrix.length-1-i){   // here we apply condition because if there are odd diagonal matrix present then the middle component should not come twice
//             sum = sum + matrix[i][matrix.length-1-i];
//         }
//     }

//     return sum;



//     }

//     public static void main(String args[]){
//         int matrix[][] = {{1,2,3,4},
//                           {5,6,7,8},
//                           {8,10,11,12},
//                           {13,14,15,16}};

//         System.out.print("the sum of both diagonal is = "+ diagonalSum(matrix));


//     }
// }





// -------------------------------------------------------------------------------------------
// Search in sorted matrix.

import java.util.*;
public class lecture_10_2d_array{



        public static boolean staircaseSearch(int matrix[][], int key){
                int row =0, col = matrix[0].length-1;

                while(row <matrix.length && col>=0){
                        if(matrix[row][col] == key){
                           System.out.println("Key Found at ("+ row + "," + col + ") ");
                           return true;
                        }

                        else if(key < matrix[row][col]){
                                col--;
                        }
                        else{
                                row++;
                        }
                }
                System.out.println("key not found !!");
                return false;
        }
        public static void main(String args[]){
                int matrix[][] = {{10, 20, 30, 40},
                                  {15, 25, 35, 45},
                                  {27, 29, 37, 48},
                                  {32, 33, 39, 50}};

                int key = 33;

                staircaseSearch(matrix, key);
        }
}



