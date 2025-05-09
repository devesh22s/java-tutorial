/*public class lecture_01{
    public static void main(String args[]){               // THIS ALL formate is complusary and it's name is boilerplate code

        System.out.print("12,4656\n hello world");                     // here we type code that we need to run
        System.out.print("12,4656\n");
        System.out.println("12,4656");   // here we write ln with print due to proper spacing and next line ,, we can also wrie \n after 4656



        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*"); 


        int a = 4;
        int b = 6;
        System.out.println(a);
        System.out.println(b);

        a = b;                                 // here we  replace a by b
        System.out.println(a);


        byte u = 67;
        System.out.println(u);



        //code to calculate sum

        int t = 10;
        int y = 456;
        int sum = t + y;
        System.out.print(sum);



    }
}*/

//   input in java.//

import java.util.*;

public class lecture_01{
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);          // for taking input we need to write this line.
        //String input = sc.next();
        //System.out.println(input);


        //String name = sc.nextLine();
        //System.out.println(name);
        
        //int value = sc.nextInt();
        //System.out.println(value);


        //float  number = sc.nextFloat();
        //System.out.println(number);

       // int a = sc.nextInt();
       // int b  = sc.nextInt();
        //int sum = a+b;
       // int product = a*b;
        //System.out.println(product);                   // we are doing addition and multiplication



        float a = sc.nextFloat();
        float area = 3.24f * a * a;              // here we add f after the value because java understand it double( type) value  withot f
        System.out.println(area); 
    }
}

// type conversion in java //.

import java.util.*;

public class lecture_01{

    public static void main (String args[]){

        int a = 34;       // but vise versa is not possible.
        long b = a;


        long a = 56;
        int b = a;
        Scanner sc = new Scanner  (System.in);
        float number = sc.nextInt();
        System.out.println(number);
        



// type casting
        float a = 35.99f;
        int b = (int) a;
        System.out.println(b);




// type casting of character into number
       char c = 'd';
       int b = (int) c;                  // or int b = c;
       System.out.println(b);
        

    }
}

// TYPE PROMOTION IN EXPRESSION \\
// -------------------------------------------------------------------------------------------------------------------\\
import java.util.*;

public class lecture_01 {

    public static void main(String args[]) {

        // 1. java automatically promotes each byte , short , or char operand to int
        // when evaluating an expreesion.

        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a);

        // but if print only a or b then

        // System.out.println(a);
        // System.out.println((int)(a));

        // char c = b-a; // here we do subtract then b-a become int that can't store in
        // a char so error occur.

        // short a = 25;
        // byte b = 4;
        // char c = 'v';
        // byte n = (byte)(a +b +c); // heree a + b + c become int that can't store in
        // byte so we do type casting in byte.
        // System.out.println(n);

        //// 2. if one operand is long , float , or double the whole exprresion is
        //// promoted to long , float, or double respectively.

        int a = 10;
        float b = 40.77f;
        double d = 30;
        // int ans = a + b+ d; // error generate because all are converted into double.
        double ans = a + b + d;

        System.out.print(ans);

    }

}
