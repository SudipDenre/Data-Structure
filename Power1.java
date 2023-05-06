import java.util.*;
import java.math.*;
// Time Complexity = O(logb)
public class Power1 {
    // Function Definition
    public static BigInteger power(BigInteger a , int b){
        // Base Case Condition
        if(b==1){
            return a;
        }else{
            int mid = b/2;
            // Recursive Function Call
            BigInteger result = power(a , mid);
            BigInteger finalResult = result.multiply(result);
            if(b%2==0){
                return finalResult;
            }else{
                return a.multiply(finalResult);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a and b : ");
        // BigInteger is used if the value of result is very very big
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        // Function Calling...
        BigInteger result = power(a,b);
        System.out.println("The value of a to the power b is = "+result);
    }
}
