//Java program to find the largest of three numbers using nested if-else statements.

import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        System.out.print("Enter three numbers : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //considering all numbers are distinct
        if(num1 > num2 && num1 > num3){
            System.out.println("Largest = "+num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("Largest = "+num2);
        }else{
            System.out.println("Largest = "+num3);
        }
    }
}
