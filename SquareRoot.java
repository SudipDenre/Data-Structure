import java.util.Scanner;
// Time Complexity = O(logn)
// Space Complexity = O(1)

// Method to find out the square root of the given number
public class SquareRoot {
    public static int squareRoot(int x){
        int low = 0;
        int high = x-1;
        int val =0;
        int result =0;
        while(low<=high){
            int mid = low + (high-low)/2 ;
            val = mid*mid ;
            if(val == x){
                // store the value to get the floor value if the given number is not perfect square number
                result = mid ;
                break;
            }else if(val < x){
                result = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        // function calling...
        int result = squareRoot(x);
        System.out.println("The square root of the given number is : "+result);
        
    }
}
