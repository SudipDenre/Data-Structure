import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkArmstrong(num));
    }

    public static boolean checkArmstrong(int num){
        int digits = (int)(Math.log10(num)+1);

        int temp =num;
        int res = 0;
        while(temp>0){
            int lastDigit = temp%10;
            res += (int)(Math.pow(lastDigit,digits));
            temp = temp/10;
        }

        if(res==num){
            return true;
        }else{
            return false;
        }

    }
}
