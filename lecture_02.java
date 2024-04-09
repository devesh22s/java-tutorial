
import java .util.*;
public class lecture_02{
        {
        int A = 10;
        int B = 5;
        System.out.println("ADD = " + (A+B));
        System.out.println("SUBTRACT = " + (A-B));          // ALL are arithemetic operators.(binary)
        System.out.println("MULTIPLY = " + (A*B));
        System.out.println("DIVIDE = " + (A/B));
        System.out.println("REMINDER = " + (A%B));








// unary 

        int a = 20;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);    // both value are 21 because a is updated and b use the updated value of a.

        int a = 20;
        int b = a++;
        System.out.println(a);   // here the value of a is 21 in output because it is updated.( in a++ line.)
        System.out.println(b);   // here the value of b is 20 because it use the first value of a then a will be updated.


        int a = 20;
        int b = -=a;
        System.out.println(a);
        System.out.println(b);
        
        int a = 20;
        int b = a--;
        System.out.println(a);
        System.out.println(b); // b = 20 because first it use then a is updated
    }
}













                                // OPERATORS.//

public class lecture_02{

    public static void main(String arg[]){

        // int a = 10;
        // int b = 10;
        // System.out.println(a ==b);
        // System.out.println(a !=b);
        // System.out.println(a > b);       // ALL are rational oprators
        // System.out.println(a < b);
        // System.out.println(a >= b);
        // System.out.println(a <= b);

        // System.out.println( (3>2) && (5<0));
        // System.out.println( (3>2) || (5<0));        // ALL are Logical operators                     || --> OR
        // System.out.println( !(0>5));
        // System.out.println( !(3>2));,


        int a = 12;
        //a = a + 12;
        a += 12;
        System.out.println(a);
        //a = a-10
        a -= 10;                            // this statement gives faster execuation.
        System.out.println(a);



        int b = 56;
        a += 6+b;
        System.out.println(a);


        int c = 4;
        //c = c*5
        c *= 5;
        System.out.println(c);





    }
}


/*

there are 5 types of operators;;
1. arithemetic operators( binary / unary)
        a. binary-->  +, - , * , / , %
        b. unary-->  ++ ,--
        there are two types of unary
        1 increment Operator --> two types.
        1. pre increment --> ++A
        2. post increment --> A++
    
        2 decrement Operator --> two types.
        1. pre decrement --> --A
        2. pre decrement --> A--

2. Rational operators ;
         == , != , > , < , >= ,<=


        
  */        
 



                                    //   3.  Logical operators.                      //

//  1. && (Logical AND) --> WHEN BOTH STATEMENT are true then answer is true.

// 2. || (Logical OR) ---> when any one statement is true then ans. is true.

// 3. ! (Logical NOT) ---> it convert true into false  and false into true.





                                    //   4. Assingement Operator //

//      = , += , -= , 
// eg --> a +=10  is equal to a = a+10.




                                // OPERATOR Precedence.//

// operator predence determine the order in which the operators in an expression are evaluated.
// for eg -        int x = 3*4-1;
// here the value of x is 11 not 9. this happen because the Precedence of * oprator is higher than - operator. that is why the expreesion is evaluated as (3*4)-1 and not 3*(4-1).




