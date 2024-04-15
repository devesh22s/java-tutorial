                // Loops -->   while loop, for loop, do wile loop.

// 1. While Loop -->

import java.util.*;
public class lecture_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //  printing "hello" 100 times 

        // int counter = 0;
        // while (counter< 10){                      // we can also use true ,but it can run infinte time.
        //     System.out.println("hello");
        //     counter = counter+1;
        // }
        // System.out.println("HELLO is printed 100 times");





        //  print number  from 1 to 10 
        // int counter = 1;
        // while (counter<=10){
            
        //     System.out.println(counter);
        //     counter++;              // or counter = counter + 1
        // }



        //  to make it in same line

        // int counter = 1;
        //  while (counter<=100){
            
        //     System.out.print(counter + " ");
        //     counter++;
        // }

        


        //  print number from 1 to n 

        // System.out.print("enter the value = ");
        // int range = sc.nextInt();
        // int counter = 1;

        // while (counter <= range){
        //     System.out.print(counter + " ");
        //     counter++;
        // }






        //  print the sum of first n natural numbers (n = 5)
        int i = 1;
        int n = 5;
        int sum = 0;

        while (i <= n){
            
            
            sum += i;           // value of sum is updated as i updated.
            i++ ;

        }
        System.out.println(sum);


    }
}

// --------------------------------------------------------------------------------------------------

// 2. for loop -->
//  for( initialisation; condition ; updation){
    //  code that we write here.

// }




/*
import java.util.*;
public class lecture_04{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        // for (int i = 1; i<= 10; i++){
        //     System.out.println("hello world");
        // }





        //  print square pattern-->

        // for (int line = 1; line<=4; line++){
        //     System.out.println("****");
        // }




        //  print reverse of a number --> n = 10899       ********

        // int n = 10899;
        // while ( n > 0){
        //     int lastdigit = n % 10;
        //     System.out.print(lastdigit);
        //     n = n/10;  // or  n/= 10

        // }
                                        // or
        // int n = 10899;
        // int rev = 0;
        // while  (n>0) {
        //      int lastdigit = n % 10;
        //      rev = (rev * 10) + lastdigit;
        //      n = n/10 ;

        // }   

        // System.out.println(rev);                          
       



    }
}
*/

// ---------------------------------------------------------------------------------------------------------

// 3. DO WHILE LOOP --->

import java.util.*;
public class lecture_04{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);

        // int counter = 1 ;
        // do{
        //     System.out.println("hello world");
        //     counter++;
        // }while(counter <= 10);






                      //           Break statement               \\
        // for (int i = 1; i<= 5 ; i++ ){
        //     if(i == 3){
        //         break;                      // it is used to execute from the loop
        //     }
        //     System.out.println(i);
        // }

        // System.out.println("i am out of loop");






        //  keep entering numbers till user enters a multiple of 10

        // do {
        //     System.out.print("enter the number = ");
        //     int n = sc.nextInt();
        //     if (n % 10 == 0){
        //         break;

        //     }
        //     System.out.println(n);

                

        // } while(true);




                                    // Continue statement \\ --> to skip the iteration


        // for (int i = 1; i<=5; i++){
        //     if (i == 3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }





        //  display all numbers entered by the user except multiples of 10 -->

//         do{
//             System.out.print("enter the number = ");
//             int n = sc.nextInt();

//             if(n % 10 == 0){
//                 continue;
//             }
//             System.out.println("the number is = "+ n);
//         } while(true);





// ------------------------------------------------------------------------------------------------------------
                              //  Checking if a number is prime or not \\
// ------------------------------------------------------------------------------------------------------------

int n = sc.nextInt();
if(n ==2 ){
    System.out.println("n is prime number");

}else{
    boolean isprime = true;
    for(int i = 2; i < n-1; i++){                       // we can also use ( i < math.sqrt(n))
        if (n % i == 0){                // n is multiple of i (i is not equal to 1 or n)
            isprime = false;
        }
    }
    if (isprime == true){
        System.out.println("n is prime ");
    }else{
        System.out.println("n is not prime");
    } 
}                   
    }
}

