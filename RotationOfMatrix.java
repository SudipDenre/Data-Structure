import java.util.Arrays;

public class RotationOfMatrix {

    //Method to rotate the 2D Array by 90 degree in c/w direction
    public static void rotatedMatrix(int[][] arr){

        //base case
        if(arr==null || arr.length==0){
            return;
        }

        int m = arr.length;
        int n = arr[0].length;
        
        // Transpose of the 2D Array
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //swap the elements between left and right columns
        for(int i=0;i<m;i++){
            int li = 0;
            int ri = n-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;

                li++;
                ri--;
            }
        }

    }
    
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        // Function calling...
        rotatedMatrix(arr);

        for(var v : arr){
            System.out.println(Arrays.toString(v));
        }
        
    }
}
