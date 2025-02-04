import java.util.*;

public class simple_practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//  1.st question
        // int[] arr = new int[5];
        // System.out.println("Enter 5 integers:");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();  
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = arr[i] * 2;  
        //     System.out.println("The updated arr[" + i + "] is = " + arr[i]);
        // }





// 2nd question

        //  int[] arr = new int[5];
        // System.out.println("Enter 5 integers:");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();  
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = 1;  
        //     System.out.println("The updated arr[" + i + "] is = " + arr[i]);
        // }



// 3rd. question -->

         int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();  
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j =1; j <arr.length; j++){
                if(arr[i]== arr[j]){
                    System.out.println("Element"+ arr[i]+" found in the array!!");
                    
                }
                else{
                    break;
                }
            
          }
           
        }

        



        
    }
}




// import java.util.*;
// public class simple_practise {
//     public static void main(String[] args) {
//         int[] array = {5, 1, 3, 5, 8, 1, 5, 8, 8, 3};

//         Map<Integer, Integer> frequencyMap = new HashMap<>();

//         for (int number : array) {
//             if (frequencyMap.containsKey(number)) {
//                 frequencyMap.put(number, frequencyMap.get(number) + 1);
//             } else {
//                 frequencyMap.put(number, 1);
//             }
//         }

//         System.out.println("Element frequencies in the array:");
//         for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//             System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times");
//         }
//     }
// }
