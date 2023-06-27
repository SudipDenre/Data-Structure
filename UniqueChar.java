import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] charCount = new int[26];
        
        // Count the frequency of each character in the string
        for(int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        int temp=0;
        // Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                System.out.println(i);
                temp++;
                break;
            }
        }

        if(temp==0){
            System.out.println(-1);
        }
        
    }
}
