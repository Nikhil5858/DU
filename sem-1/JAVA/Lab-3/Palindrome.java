import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        int originalnum = num;
        int reversednum = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversednum = reversednum * 10 + digit;
            num /= 10;
        }
        
        if (originalnum == reversednum) {
            System.out.println(originalnum + " is a palindrome");
        } else {
            System.out.println(originalnum + " is not a palindrome");
        }
        sc.close();
    }
}
