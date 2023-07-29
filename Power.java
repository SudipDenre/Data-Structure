import java.util.Scanner;
// Time Complexity = O(b)
public class Power {
    // Function Definition
    public static int power(int a , int b){
        // Base case condition
        if(b==1){
            return a;
        }
        // Recursive function call
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Function calling...
        int result = power(a,b);
        System.out.println("The value of a to the power b is = "+result);
    }
}
