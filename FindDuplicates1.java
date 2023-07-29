import java.util.*;
// Time Complexity = O(n)
// Space Complexity = O(n)
public class FindDuplicates1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,5,7,5,3,6};
        Set<Integer> s = new HashSet<Integer>();
        System.out.println("Duplicate elements are : ");
        for(int num : arr){
            if(s.add(num)==false){
                System.out.print(num+" ");
            }
        }
    }
}
