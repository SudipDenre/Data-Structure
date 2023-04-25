import java.util.Arrays;
// Brute Force Approach

public class RotationOfMatrix1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] a = new int[m][n];
        int x = n-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(x>=0){
                    a[j][x] = arr[i][j];
                }
            }
            x--;
        }
        for(var v : a){
            System.out.println(Arrays.toString(v));
        }
    }
}
