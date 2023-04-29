import java.util.Scanner;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,5,7,7,9,9,9};
        System.out.print("Enter the target number : ");
        int x = sc.nextInt();
        int low=0;
        int high=arr.length-1;
        int idx = -1 ;
        while(low<=high){
            // to avoid overflow
            int mid = low + (high-low)/2 ;
            if(arr[mid]==x){
                idx = mid ;
                // traverse to the left side of the array
                high = mid -1 ;
            }else if(arr[mid]<x){
                low = mid + 1 ;
            }else{
                high = mid - 1 ;
            }
        }
        if(idx==-1){
            System.out.println("The target number is not present in the array");
        }else{
            System.out.println("The first occurrence of the target number is at index : "+idx);
        }
    }
}
