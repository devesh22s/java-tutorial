                        //   Patterns (part - 1)]


import java.util.*;
public class lecture_05_pattern_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);





        // Printing star pattern


        // for (int line = 1; line <=4; line++){
        //     for(int star = 1; star<=line; star++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }




        // Print inverted star

        // int n = 4;
        // for (int line = 1; line <=n; line++){
        //      for(int star = 1; star <= n-line+1; star++){

        //         System.out.print("*");


        //      }
        //      System.out.println();


        // }

        // -------------------------------------------------------------------------------

        // for (int line = 1; line<= 4; line++){
        //     for (int number = 1; number<=line; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

// -----------------------------------------------------------------------

        // print the character


        // int n = 4;
        // char ch = 'A';
        // for (int line = 1; line<= n; line++){
        //     for (int j = 1; j<= line; j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }


// --------------------------------------------------------------------------


        //  hollow rectangle 
        // for (int line = 1; line<= 4; line++){


        // }



// ---------------------------------------------------------------------------------


            // floyd's triangle -->
        //     int n = 1;
        //  for (int line = 1; line<= 5; line++){
        //     for (int number = 1; number<=line; number++){
        //         System.out.print(n);
        //         n++;
        //     }
        //     System.out.println();
        //  }

// -----------------------------------------------------------------------------------

        //  0-1 triangle pattern
       
  
        int rows = 5; // Number of rows in the triangle
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print 0s and 1s
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2);
            }
            System.out.println(); // Move to the next line
       
        }



    }
}                        