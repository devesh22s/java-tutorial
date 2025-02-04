//  bitwise operators -->

import java.util.*;
public class lecture_12_bit_manipulation {


    // checking if the number is odd or even through bit operations ->
    // public static void OddorEven(int n){
    //     int bitMask = 1;
    //     if(((n & bitMask) == 1)){
    //         System.out.println(" it is odd number");
    //     }else{
    //         System.out.println(" it is even number");
    //     }
    // }


    //  searching ith bit
    // public static int getithbit(int n, int i){
    //     int bitMask = 1<< i;
    //     if((n & bitMask)== 0){
    //         return 0;
    //     }else{
    //         return 1;
    //     }


    // }
    //  convert ith bit into 1
    public static int setithbit(int n, int i){
        int bitMask = 1<< i;
        return n | bitMask;
    }

    //  convert the ith bit into 0
    public static int clearithbit(int n, int i){
        int bitMask = ~(1<< i);
        return n & bitMask;
    }


    public static int updatebit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearithbit(n, i);

        // }else{
        //     return setithbit(n, i);
        // }

        n = clearithbit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }


    public static int clearlastIbit(int n, int i){
        int bitMask = ~0 << i;
        return n & bitMask;

    }



    public static int clearRangeIbit(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1 << i)-1;
        int bitMask = a | b;
        return n & bitMask ;

    }

    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }


    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){  // check our LSB
                count++;
            }
           n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans =1;
        while(n > 0){
        if((n & 1) != 0){
            ans = ans * a;
        }
        a = a * a;
        n = n >> 1;
        }
        return ans;
    }


    public static void main(String args[]){

        //  1. Binary And (&)
        // System.out.println((5 & 6));

        //  2. Binary OR (|)
        // System.out.println((5 | 6));

        //  3. Biinary XOR (^)
        // System.out.println((5 ^6));

        // 4. Binary One's Complement(~)  -->  we need to calaculate 2's complement which helps us to find the actual value if the number is negative in binary code,  MSB -> if first number is 1 then it is negative number in binary, or 0 then it is positive binary,, LSB -> the last number of binary code
        //  It is single bit operator and long process covered in notes.
        //  FORMULA for 2's = 1's + 1,,,,  ----------->>>>  (((~a = a  + 1)))

        // System.out.println((~5));

        //  5. Binary left shift (<<) ----------->  a<<b = a * 2 ki power b
        // System.out.println((5 << 2));

        //  6. Binary right shift (>>) ----------->  a>>b = a / 2 ki power b
        // System.out.println((5>>2));



        // checking the OddorEven
        // OddorEven(3);
        // OddorEven(30);


        //1. get ith bit 
        // System.out.println(getithbit(15, 2));

        // 2. set ith bit  --> convert any bit into one,, we get the final answer in decimal form which have the required ith = 1
        // System.out.println(setithbit(10, 3));

        // 3. clear the ith bit
        // System.out.println(clearithbit(10, 3));

        // 4. update ith bit
        // System.out.println(updatebit(10, 2, 1));


        // 5. clear last i bits
        // System.out.println(clearlastIbit(15, 2));


        // 6. Clear range of bits
        // System.out.println(clearRangeIbit(10, 2, 4));



        // check if a number is a power of 2 or not: **************
        // System.out.println(isPowerOfTwo(8));




        //  count set bit in a number **********
        // System.out.println(countSetBits(10));





        // Fast Exponentiation *************** --> is to find  a^n
        System.out.println(fastExpo(3, 5));






    }

}
                                                                                                                                                                
