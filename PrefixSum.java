import java.util.*;

public class PrefixSum {
    //method to find out the sum of the rectangle elements
    public static int prefixSum(int[][] arr , int r1 , int c1 , int r2 , int c2){
        int sum =0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
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
        int result = prefixSum(arr,r1,c1,r2,c2);
        System.out.println("The sum of the rectangle elements is : "+result);
    }
}
