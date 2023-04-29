import java.util.Scanner;
import java.util.*;
// Time Complexity = O(n^2)
// Space Complexity = O(1)
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // Implementation
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                //swapping
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                // Decrement
                j--;
            }
        }

        System.out.print("The sorted array is :"+ Arrays.toString(arr));
    }
}
