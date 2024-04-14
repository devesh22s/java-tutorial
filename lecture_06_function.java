                //  function -->

import java.util.*;

public class lecture_06_function{

public static void printinghello(){
    System.out.println("hello world");
}





    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         printinghello();
         printinghello();
         printinghello();
         

    }
}









//  parameter in functon -->


import java.util.*;

public class lecture_06_function{

    public static int calculateSum(int num1, int num2){     // here we take arguments from num1 and num2 parameter  in the form of int formate.(num1 and num2 are parameter or formal parameter)
        int sum = num1 + num2;                              // here the return type of the function is int.
        return sum;
        
        
    }

    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter the value of a = ");
         int a = sc.nextInt();
         System.out.print("enter the value of b = ");
         int b = sc.nextInt();
        //  int sumStore =  calculateSum(a,b);            // here we call the function and pass the argument a and b.(a and b are arguments or formal parameter)
         System.out.println("sum is = " + calculateSum(a,b));            // here we do all work in main function
        


    }
}









                        //  java always call by value -->
    
    //  q.1 --> find product of a and b (a = 3, b = 5)

import java.util.*;
public class lecture_06_function{
    public static int product(int a, int b){
         int multiply = a * b;
         return multiply;

    }




     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         int a = 3;
         int b = 5;
         int storemultiply = product(a, b);
         System.out.println("the multiplication of a and b is = " + storemultiply);

         storemultiply = product(20, 3);
         System.out.print("the multiplication of a and b is = " + storemultiply);
   
         

     }

}







//  q.2 --> factorial of number n where n is = 4
// q.3 --> binomial cofficient ( n = 5 and r = 2 )

// import java.util.*;
// public class lecture_06_function{
//     public static int factorial(int n){
//         int f = 1 ;
//         for(int i = 1; i<=n; i++){
//             f = f*i;
//         }
//         return f;

//     }

//     public static int binomial(int n , int r){
//         int n_factorial = factorial(n);
//         int r_factorial = factorial(r);
//         int n_r_factorial = factorial(n - r);

//         int final_val = n_factorial / (r_factorial * n_r_factorial);

//         return final_val;

//     }




//      public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);

//          int n = 5;
//          int r = 2;
        
//          System.out.println("the binomial of n = 5 and r = 2 is = " + binomial(n, r));

//         //  int store_factorial = factorial(n);
//         //  System.out.print("the factorial of 4 is = " + store_factorial);
         
         
   
         

//      }

// }




import java.util.*;

public class lecture_06_function{

    //                                          function overloading (basic)

    
    //  1. using parameter
    //  2. using data types

    //  function to calculate the sum of two numbers
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // // function to calculate sum of three number 
    // public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }





    // public static int sum(int a, int b){
    //     return a + b;
    // }
    // public static float sum(float a, float b){
    //     return a + b;
    // }


//  check a number is  a prime or not: -->
      public static boolean isprime(int n){

        for (int i = 2; i < n; i++ ){            // every number is divided by 1 so we iterate i from 2
            if(n % i == 0){
                return false;


            }

        }

        return true;
        
        } 



    
//  check a number is  a prime or not: --> optimisation code.
//  print all prime numbers in range -->


    //  public static boolean isprime(int n){

    //     if(n ==2){
    //         return true;
    //     }

    //     for (int i = 2; i <= Math.sqrt(n); i++ ){            
    //         if(n % i == 0){
    //             return false;


    //         }

    //     }

    //     return true;
        
    //     } 



    // public static void primeinrange(int n){
    //     for(int i = 2; i <= n; i++){
    //         if(isprime(i)){
    //             System.out.print(i+ " ");
    //         }
    //     }
    //     System.out.println("end of loop");
    // }





    public static void main(String args[]){
    //      Scanner sc = new Scanner(System.in);
    //     //  System.out.println(sum(3,5));
    //     //  System.out.println(sum(3,5,7));
    //     // System.out.println(sum(1.2f, 66.7f));
        System.out.println(isprime(19));
    //     primeinrange(20);


    
    }

    
}












// import java.util.*;
// public class lecture_06_function{

    // convert  from binary to decimal (n = 101) 

    // public static void bit_to_decimal(int bin_num){
    //     int mynum = bin_num;
    //     int power = 0;
    //     int decimal = 0;

    //     while(bin_num >= 0){
    //         int last_digit = bin_num % 10;
    //         decimal = decimal + (last_digit * (int)Math.pow(2, power));   // here  we first do typecasting then for taking any digit in power there is in-build function in java (Math.pow(digit, power of digit)) that return  and take the value in double data type
    //         power++;
    //         bin_num = bin_num/10;
    //     }

    //     System.out.println("decimal of  "+ mynum + " = " + decimal);
    // }




//     // convert from decial to bianry number (n = 7)
//     public static void dec_to_bit(int n){
//         int mynum = n;
//         int power = 0;
//         int decimal = 0;
//         int bin_num = 0; 

//         while (n > 0){
//             int remainder = n % 2;
//             bin_num = bin_num + (remainder*(int)Math.pow(10, power));

//             power++;
//             n = n/2;

              
//         }

//         System.out.println("binary form of " + mynum + " = " + bin_num);
//     }



//     public static void main(String args[]){
//         // bit_to_decimal(111);
//         dec_to_bit(398);
//     }

// }
