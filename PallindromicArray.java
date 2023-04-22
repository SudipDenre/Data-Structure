import java.util.Arrays;
// time complexity = O(n)
// space complexity = O(n)
public class PallindromicArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1};
        int[] newArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[arr.length-i-1];
        }
        boolean equal = Arrays.equals(arr, newArr);
        if(equal==true){
            System.out.println("It is a Palindromic Array");
        }else{
            System.out.println("It is not a Palindromic Array");
        }
    }
}