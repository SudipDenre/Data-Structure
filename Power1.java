import java.util.Scanner;
// Time Complexity = O(logb)
public class Power1 {
    // Function Definition
    public static long power(long a , long b){
        // Base Case Condition
        if(b==1){
            return a;
        }else{
            long mid = b/2;
            // Recursive Function Call
            long result = power(a , mid);
            long finalResult = result*result;
            if(b%2==0){
                return finalResult;
            }else{
                return a*finalResult;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b : ");
        long a = sc.nextLong();
        long b = sc.nextLong();
        // Function Calling...
        long result = power(a,b);
        System.out.println("The value of a to the power b is = "+result);
    }
}
