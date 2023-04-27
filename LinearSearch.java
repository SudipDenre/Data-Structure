import java.util.Scanner;
// Time Complexity = O(n)
// Space Complexity = O(1)
public class LinearSearch {
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
        int idx = -1;
        for(int i=0;i<n;i++){
            if(x==arr[i]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            System.out.println("The Number is Not present in the array...");
        }else{
            System.out.println("The number is present at the index : "+idx);
        }
        
    }
}
