import java.util.Arrays;
// Brute Force Approach
// Time Complexity = O(n^2)
// Space Complexity = O(n^2)

public class RotationOfMatrix1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = arr.length;
        int[][] a = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    a[j][n-1-i] = arr[i][j];
                }
        }
        for(var v : a){
            System.out.println(Arrays.toString(v));
        }
    }
}
