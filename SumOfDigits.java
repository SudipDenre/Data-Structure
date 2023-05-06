import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int num){
        if(num == 0){
            return 0;
        }else{
            int rem = num%10;
            return rem + sumOfDigits(num/10);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int result = sumOfDigits(num);
        System.out.println("The sum of digits of the number is = "+result);
    }
}
