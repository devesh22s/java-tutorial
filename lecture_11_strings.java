// //  Strings in java -->
// //  - strings are immutable
// //  - we use length() function to find the length of string , it also include spaces between words.

// import java.util.*;
// public class lecture_11_strings{
//      // q.1  -> check the string are palindrome(same meaning of word from front and back )
//         //  "racecar" , "madam" , "noon"
//         // time complexcity for this is O(n) --> linear time complexicity.

//     public static boolean isPalindrome(String str){
//         for(int i =0; i < str.length()/2; i++){
//             int n = str.length();

//             if(str.charAt(i) != str.charAt(n-1-i)){
//                 return false;
//             }
//         }
//         return true;
//     }

// // --------------------------------------------------------------------------------------------------




//     //  q.2 -> given a route containing 4 direstion (E, W, N ,S) , find the shortest path to reach destination
//     // "WNEENESENNN"
//     // time complexcity for this is O(n)

//     public static float getShortestPath(String path){
//         int x =0, y =0;
//         for(int i =0; i < path.length(); i++){
//             char dir = path.charAt(i);

//             // south
//             if(dir == 'S'){         // we can't take "" because char is always in ''
//                 y--;
//             }
//             // north
//             else if(dir == 'N'){
//                 y++;
//             }
//             // east
//             else if(dir == 'E'){
//                 x++;
//             }
//             // west
//             else{
//                 x--;
//             }
//         }

//         int x2 = (x-0)*(x-0);
//         int y2 = (y-0)*(y-0);
//         return (float)Math.sqrt(x2 + y2);  // here we do typecasting into float because Math.sqrt return value in double type.


//     }




//     public static void main(String args[]){
//         // //  defining a string
//         // String name = "devesh";
//         // //       or
//         // String name2 = new String("Vijay");
//         // System.out.println(name+" and "+name2);

//         // //  concination of java ->
//         // System.out.println(name+name2);
    
//     // ---------------------------------------------------------------------------------------------------------
//     // questions -->
//         // String name = "madam";
//         // System.out.println(isPalindrome(name));



//         // String path = "WNEENESENNN";
//         // System.out.println(getShortestPath(path));


//     // -----------------------------------------------------------------------------------------------

//     //  comparision of strings -->

//     String s1 = "sam";
//     String s2 = "sam";
//     String s3 = new String("sam");

//     if(s1 == s2){
//         System.out.println("Strings are equal");
//     }
//     else{
//         System.out.println("Strings are not equal");
//     }
//     if(s1 == s3){       // here it give not equal
//         System.out.println("Strings are equal");
//     }
//     else{
//         System.out.println("Strings are not equal");
//     }


//     //  so for comparison we have a function called .equal that only check the value of the string, not that how string was created.
//     if(s1.equals(s3)){  
//         System.out.println("Strings are equal");
//     }
//     else{
//         System.out.println("Strings are not equal");

//     }








        
//     }
// }






// ---------------------------------------------------------------------
//   substring of strings -->

// import java.util.*;
// public class lecture_11_strings{


//     public static String substring(String str, int si, int ei){
//         String substr = "";
//         for(int i =si; i <ei; i++ ){
//             substr += str.charAt(i);
//         }
//         return substr;

//     }









//     public static void main(String args[]){

//         // String str = "hello world";
//         // System.out.println(str.substring( 0, 5));
//         // //  or
//         // // System.out.print(substring(str, 5, 10));


//     //   q.1 --> for a given set of string , print the largest string.
//     //  "apple", "mango", "banana";

//     String fruits[] = {"apple", "mango", "banana"};
//     String largest = fruits[0];
//     for(int i =0; i < fruits.length; i++){
//         if(largest.compareTo(fruits[i]) < 0){
//             largest = fruits[i];

//         }
//     }
//     System.out.println("The largest string is = "+largest);
//     //  answer is mango due to dexicographic order in which m alphabet come after a and b so , according to alphabetical order m is highest dexicographical , so it is largest string.
//     // compareTo function compares every letters (let it is x) of strings on basics of dexicographic so the time complexicity for it is  O(n*x).








//     }
// }


// ----------------------------------------------------------------------------------
//  string builder --> we can use every location where a string used.
// import java.util.*;
// public class lecture_11_strings{



//     //  upppercase ->
//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         //  now spaces 

//         for(int i =1; i < str.length(); i++){
//             if(str.charAt(i) == ' ' &&  i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));

//             }
//             else{
//                 sb.append(str.charAt(i));
//             }

//         }
//         return sb.toString();
//     }






//     public static void main(String args[]){
//         // StringBuilder sb = new StringBuilder("");
//         // for(char ch = 'a'; ch <= 'z'; ch++){
//         //     sb.append(ch);
//         // }
//         // System.out.println(sb);


//         //  time compleexicity for this code is O(26) because the loop run 26 times , but when we use strings then the time complexicity for this code is O(26 * n^2) it also calculate the length of the strings.
 


//         // uppercase in java -->

//         String str = "hi, i am devesh";
//         System.out.println(toUpperCase(str));

        


//     }
// }




// --------------------------------------------------------------------------------------

import java.util.*;
public class lecture_11_strings{
    public static String compress(String str){
        String newStr = "";

        for(int i =0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i +1)){
                count++;
                i++;
            }
            newStr +=str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }

        }
        return newStr;

    }



    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(compress(str));

    }
}


//  time complexicity for this code is O(n)