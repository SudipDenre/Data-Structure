import java.util.Scanner;
//Java program to print the Fibonacci series up to a given number using a for loop.
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("enter the value of n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first=0 , second=1;
        System.out.print(first+" "+second+" ");
        for(int i=0;i<n-2;i++){
            int nextNum = first + second;
            System.out.print(nextNum+" ");
            first = second;
            second = nextNum;
        }
    }
}
