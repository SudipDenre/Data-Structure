import java.util.*;

public class PrefixSum1 {
    // Method to find out the prefix sum matrix
    public static void prefixSumMatrix(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        //row-wise prefix sum matrix calculate
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        //column-wise prefix sum matrix calculate
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
    }

    //Method to calculate the sum of the region
    public static int sumRegion(int[][] arr,int r1,int c1,int r2,int c2){
        int sum=0,up=0,left=0;
        int repeatedRegion=0,result=0;
        sum = arr[r2][c2];
        up = arr[r1-1][c2];
        left = arr[r2][c1-1];
        repeatedRegion = arr[r1-1][c1-1];
        result = sum-up-left+repeatedRegion;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int m = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the matrix elements : ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the value of r1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the value of c1 : ");
        int c1 = sc.nextInt();
        System.out.print("Enter the value of r2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter the value of c2 : ");
        int c2 = sc.nextInt();
        // function calling .....
        prefixSumMatrix(arr);
        int result = sumRegion(arr,r1,c1,r2,c2);
        System.out.println("The sum of the rectangle elements is : "+result);
    }
}
