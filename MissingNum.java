// Time Complexity = O(n)
// Space Complexity = O(1)

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5,6};
        int n = arr.length;
        //sum of natural numbers in an array
        long sumOfNaturalNum = (long)((n+1)*(n+2))/2;
        long sum=0;
        //sum of current elements in the array
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        System.out.println("The Missing Number is : "+(int)(sumOfNaturalNum-sum));
    }
}
