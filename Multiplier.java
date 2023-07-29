import java.util.Scanner;

public class Multiplier {
    public static void printMultiplier(int n , int k){
        if(k==1){
            System.out.print(n+" ");
            return;
        }else{
            printMultiplier(n, k-1);
            System.out.print(n*k+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and k :");
        int n = sc.nextInt();
        int k = sc.nextInt();
       /*  for(int i=1;i<=k;i++){
            System.out.print(n*i + " ");
        }*/
        printMultiplier(n ,k);
    }
}
