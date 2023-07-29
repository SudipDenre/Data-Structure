// Brute Force Method
// Time Complexity = O(n^2)
// Space Complexity = O(1)
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,3,6,5,6,7};
        System.out.print("Duplicate elements are : ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
