import java.util.Scanner;
//Java program to calculate the average of a list of numbers using a do-while loop.
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of numbers: ");
        int n = sc.nextInt();

        double sum = 0;
        int count = 0;
        System.out.print("Enter the numbers: ");
        do {
            int number = sc.nextInt();
            sum += number;
            count++;
        } while (count < n);

        double average = sum / n;
        System.out.println("The average is: " + average);
    }
}
