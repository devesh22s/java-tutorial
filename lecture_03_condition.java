import java.util.*;
public class lecture_03{
    public static void main (String arg[]){


        // if -else statement.
        int age = 2;
        if (age>=18){                                           // we need to write if-else statement in pharathensis bracket
            System.out.println("vote, drive, adult");
        }
        else{
            System.out.println("not adult");


        }

        int age = 6;
        if(age>=18){
            System.out.println("adult");
        }

        if (age>=12 &&  age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("kids");
        }


        int a = 1;
        int b = 3;
        if(a>=b){               // always use pharnthesisis bracket.
            System.out.println("a is largest of 2");        // ; repersent that the line is end.

        }
        else{
            System.out.println("b is largest of 2");
        }





        //print if a number is odd or even



    }

}

// ---------------------------------------------------------------------------------------


import java.util.*;
public class lecture_03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("even");

        } else{
            System.out.println("odd");
        }

        int age = 45;

        if(age>=18){
            System.out.println("adult");

        }
        else if (age>=13 && age<18){
            System.out.println("teenager");
        }

        else{
            System.out.println("child");
        }


    }
}









// =====================================================================================================





import java.util.*;
public class lecture_03{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        


        // //income tax calculator
        // int income = sc.nextInt();
        // int tax;                // java will automatically take value that is zero.

        // if (income < 500000){
        //     tax = 0;
        // }
        // else if(income >= 500000 && income < 1000000){
        // tax = (int) (income * 0.2);            // here income is int and 0.2 is double so we do typecasting it into int
        // }
        // else{
        //     tax = (int)(income * 0.3);

        // }

     
     
        // System.out.println("your tax is : " + tax);





        // // print the largest of 3
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if ((a>=b) && (a>=c)){
        //      System.out.println("a is largest");

        // } else if((b>=a) && (b>=c)){
        //      System.out.println("b is the largest");
        // }
        // else{
        //      System.out.println("c is the largest");
        // }







        // ternary operator -->

        // int number = 4;

        // String type = ((number % 2) == 0 ? "even":"odd");   // here we give two statement to it that is even and odd out of which satisfied with condition that is print.
        // System.out.println(type);




        // check if a student will pass or fail









                                                     // switch statement-->

        // int number = 2;
        // switch(number){
        //     case 1 : System.out.println("samosa");

        //     case 2 : System.out.println("pizza");       // if one case is true than all remaining cases will print automatically. so we need  break switch by break keyword.
        //     break;

        //     case 3 : System.out.println("shake");
        //     break;

        //     default : System.out.println("banana");
        // }




        // char name = 'b';
        // switch(name){
        //     case 'a': System.out.println("samosa");
            
        //     case 'b': System.out.println("pizza");

        //     case 'd': System.out.println("shake");
           
        //     default : System.out.println("banana");
        // }




        // calculator-->
        System.out.println("enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("enter the value of b = ");
        int b = sc.nextInt();

        char operator = sc.next().charAt(0);        // we use  .charAt(0)  because of  it, input store in character.

        switch(operator){
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);     
                        break;
            case '/'  : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);

            default : System.out.println("wrong operator");
        }

    }

}