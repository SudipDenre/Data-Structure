import java.util.Scanner;
// Binary Search Using Recursion
public class BinarySearchRecur {
    // Function Definition
    public static int binarySearch(int[] arr , int low , int high , int target){
        int result = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                // Recursive Call
                return binarySearch(arr, mid+1, high, target);
            }else{
                // Recursive Call
                return binarySearch(arr, low, mid-1, target);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,8,10,12};
        System.out.print("Enter the value of target : ");
        int target = sc.nextInt();
        // Function Calling...
        int result = binarySearch(arr , 0 , arr.length-1 , target);
        if(result == -1){
            System.out.println("The element is not found in the array");
        }else{
            System.out.println("The element is found at index : "+result);
        }
    }
}
