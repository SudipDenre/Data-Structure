public class CheckPalindrome {
    public static void main(String[] args) {
        int num = 34743;
        int temp =num;
        int reverse = 0;
        while(temp>0){
            int lastDigit = temp%10;
            reverse = reverse*10 + lastDigit;
            temp =temp/10;
        }
        System.out.println(reverse==num);
    }
}
