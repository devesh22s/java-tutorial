//  *****
//  *   *
//  *   *
//  *****

import java.util.*;
public class lecture_07_advancepattern{

    public static void hollow_rectangle(int total_rows, int toatl_colums){
        //  outer loop 
        for(int i = 1; i <= total_rows; i++){
            // innner columns 
            for(int j = 1; j <= toatl_colums; j++){
                //  cell - (i, j)
                if(i == 1 || i == total_rows || j == 1 || j == toatl_colums){
                    // boundary cells 
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();


        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        hollow_rectangle(7,6);

    }
}


// =================================================================================================================


// import java.util.*;
// public class lecture_07_advancepattern{
// //  inverted and rotated half pyramid.

// //    *
// //   **
// //  ***
// // ****
//     // public static void inverted_rotated_half_pyramid(int n){
//     //     // outer
//     //     for(int i = 1; i <=n; i++){
//     //         // spaces
//     //         for(int j = 1; j <= n-i; j++){
//     //             System.out.print(" ");

//     //         }
//     //         // stars
//     //         for(int j = 1; j<=i; j++){
//     //             System.out.print("*");
//     //         }
//     //      System.out.println();
//     //     }
//     // }







// //  inverted half pyramid with numbers.
// // 12345
// // 1234
// // 123
// // 12
// // 1

// public static void inverted_half_pyramid_with_numbers(int n){
//     // outer
//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j <= n-i+1; j++){
//             System.out.print(j+ " ");
//         }
//         System.out.println();
//     }
// }







//     public static void main(String args[]){
//         // inverted_rotated_half_pyramid(4);
//         inverted_half_pyramid_with_numbers(5);
//     }


// }

// =======================================================================================================================

//1.  Floyd's triangle -->
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

import java.util.*;
public class lecture_07_advancepattern{
    // public static void flyod_triangle(int n){
    //     // outer
    //     int counter = 1;
    //     for(int i = 1; i <= n; i++){
    //         // inner - how many times the counter will print
    //         for(int j =1; j<= i; j++){
    //             System.out.print(counter + " ");
    //             counter++;
    //         }
    //         System.out.println();
    //     }

    // }




 // 2.      0-1 traingle pattern
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1


    // public static void triangle_number(int n){
    //     // outer
    //     int counter = 1;
    //     for(int i =1; i <= n; i++){
    //         // inner
    //         for(int j =1; j <=i; j++){
    //             if((i+j) % 2 == 0){
    //                 System.out.print("1 ");
    //             }else{
    //                 System.out.print("0 ");
    //             }

    //         }
    //         System.out.println();         
    //     }


    // }





// 3. butterfly pattern

//  *             *
//  * *         * *
//  * * *     * * *   
//  * * * * * * * *
//  * * * * * * * *
//  * * *     * * *
//  * *         * *
//  *             *
//  


// public static void butterfly(int n){
//     // 1st half
//     for(int i =1; i <= n; i++){
//         // stars --> i
//         for(int j =1; j <=i; j++){
//             System.out.print("*");
//         }


//         // spaces --> 2(n-i)
//         for(int j =1; j <= 2*(n-i); j++){
//             System.out.print(" ");
//         }

//         // stars --> i
//          for(int j =1; j <=i; j++){
//             System.out.print("*");
//         }

//         System.out.println();

//     }


//     // 2nd half
//     for(int i = n; i>=1; i--){
//           // stars --> i
//         for(int j =1; j <=i; j++){
//             System.out.print("*");
//         }


//         // spaces --> 2(n-i)
//         for(int j =1; j <= 2*(n-i); j++){
//             System.out.print(" ");
//         }

//         // stars --> i
//          for(int j =1; j <=i; j++){
//             System.out.print("*");
//         }


//         System.out.println();
//     }
// }







// 4. solid rhombus 

//         * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *



// public static void rhombus(int n){
//     for(int i =1; i <= n; i++){
//         // spaces
//         for(int j =1; j <=(n-i); j++){
//             System.out.print(" ");
//         }

//         // stars 
//         for(int j =1; j <= n; j++){
//             System.out.print("*");

//         }

//         System.out.println();


//     }
// }





// 5. hollow rhombus 


//         * * * * *   
//       *       *
//     *       *
//   *       *
// * * * * *




// public static void hollow_rhombus(int n){
//     for(int i = 1; i <= n; i++){
//         // spaces 
//         for(int j =1; j <= (n-i); j++){
//             System.out.print(" ");
//         }

//         //  hollow rectangle - stars

//         for(int j = 1; j <= n; j++){
//             if(i == 1 || i ==  n || j == 1 || j ==n){
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }

// }





// 6. diamond pattern

//             *
//           * * *
//         * * * * *
//       * * * * * * *
//       * * * * * * *
//         * * * * *
//           * * *
//             *




public static void diamond(int n){
    // first half
    for(int i = 1; i <= n; i++){
        // spaces
        for(int j =1; j <= n-i; j++){
            System.out.print(" ");
        }

        // stars
        for(int j =1; j <= ((2*i) - 1); j++){
            System.out.print("*");
        }

        System.out.println();
    }


    // second half
    for(int i =n; i >= 1; i--){
        // spaces
        for(int j =1; j <= n-i; j++){
            System.out.print(" ");
        }

        // stars
        for(int j =1; j <= ((2*i) - 1); j++){
            System.out.print("*");
        }

        System.out.println();

    }
}




    public static void main(String args[]){
        // flyod_triangle(5);
        // triangle_number(5);
        // butterfly(4);
        // rhombus(9);
        // hollow_rhombus(5);
        diamond(8);
    }
}







