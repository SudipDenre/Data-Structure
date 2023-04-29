import java.util.*;
// Time Complexity = O(n^2)
// Space Complexity = O(1)
public class SelectionSort {
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
        for(int i=0;i<n;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            if(min_idx!=i){
                //swap
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }

        System.out.print("The sorted array is :"+ Arrays.toString(arr));
    }
}
