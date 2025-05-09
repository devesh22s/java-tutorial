

public class lecture_14_recursion {

    // printing number in decreasing order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;

        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    // printing number in increasing order
    public static void printInc(int m) {
        if (m == 1) { // this is base function           

            System.out.print(m + " ");
            return;

        }
        printInc(m - 1); // due to logic of callstack-LIFO (last in first out)         
        System.out.print(m + " ");

// Call Stack  Visualization (m = 10):
// | printInc(10) |
// | printInc(9)  |
// | printInc(8)  |
// | printInc(7)  |
// | printInc(6)  |
// | printInc(5)  |
// | printInc(4)  |
// | printInc(3)  |
// | printInc(2)  |
// | printInc(1)  | <-- Base Case


    }

    // printing factorial of a number n

    public static int fact(int n) {
        if(n == 0){
            return 1;

        }
        int fnm1 = fact(n-1);
        int fn = n *fact(n-1);
        return fn;
        
    }

    public static void main(String args[]) {

        int n = 10;
        int m = 10;
        printDec(n);
        printInc(m);
        System.out.println(fact(n));

        
    }
}
