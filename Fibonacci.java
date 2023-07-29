import java.util.Scanner;
// Fibonacci Series --> 0 1 1 2 3 5 8 13 .....
// Time Complexity = O(2^n)
// Space Complexity = O(n)
public class Fibonacci {
    // Function Definition
    public static int fibo(int n){
        // Base case condition
        if(n==0 || n==1){
            return n;
        }
        // Recursive function call
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        // Function calling...
        int result = fibo(n);
        System.out.println("The number of the fibonacci series is at "+n+"th index is "+result);
    }
}
