//Java program to check whether a given number is positive, negative, or zero using an if-else statement.

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive number");
        }else if(num<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Zero");
        }
    }
}
