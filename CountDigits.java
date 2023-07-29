public class CountDigits{
    public static void main(String[] args) {
        int n = 7789;
        int count=0;
        while(n>0){
            //int lastDigit = n%10;
            count++;
            n = n/10;
        }
        
        //count = (int)Math.log10(n)+1 ;

        System.out.println(count);
    }
}