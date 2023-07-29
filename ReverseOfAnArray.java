import java.util.Arrays;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class ReverseOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2,7,9,8,10};
        int n = arr.length;
        int temp = 0;
        for(int i=0;i<n/2;i++){
            // Swap the elements between arr[i] and arr[n-i-1]
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("The reverse of the array : "+Arrays.toString(arr));
    }
}
