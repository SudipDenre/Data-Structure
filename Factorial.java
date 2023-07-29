import java.util.Scanner;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class Factorial {
    // Function Definition
    public static int fact(int n){
        // 1. Base Case Condition
        if(n==0 || n==1){
            return 1;
        }
        // 2. Recursive Function Call
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        // Function calling...
        int result = fact(n);
        System.out.println("The factorial of "+n+" is = "+result);
    }
}
