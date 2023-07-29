public class FindGCD {
    public static void main(String[] args) {
        int a=10, b=5;
        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            System.out.println("GCD = "+b);
        }else{
            System.out.println("GCD = "+a);
        }
    }
}
