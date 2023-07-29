import java.util.Scanner;
// Time Complexity = O(logn)
// Space Complexity = O(1)
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements present in the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the searching number : ");
        int x = sc.nextInt();
        int low = 0;
        int high = n-1;
        int idx = -1;
        while(low<=high){
            int mid = low + (high - low)/2 ;
            if(arr[mid] == x){
                idx = mid;
                break;
            }else if(arr[mid]<x){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        if(idx == -1){
            System.out.println("The number is not present in the array");
        }else{
            System.out.println("The number is present at index : "+idx);
        }
    }
}
