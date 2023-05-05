import java.util.Scanner;
// Time Complexity = O(2^n)
public class Staircase {
    // Function Definition
    public static int countWays(int n){
        // Base case condition
        if(n<=1){
            return n;
        }
        // Recursive function call
        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs : ");
        int n = sc.nextInt();
        // Function Calling...
        int result = countWays(n+1);
        System.out.println("The number of ways are = "+result);
    }
}
