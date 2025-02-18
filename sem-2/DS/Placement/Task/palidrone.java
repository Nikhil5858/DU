import java.util.Scanner;

public class palidrone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt(); // 121
        int temp = num; // 121
        int rev = 0;

        while (temp != 0) { // 12 , 1
            int a = temp % 10; // 121 % 10 = 1 , 12 % 10 = 2, 1 % 10 = 1
            rev = rev * 10 + a; // 0 * 10 + 1 = 1 , 1 * 10 + 2 = 12 , 12 * 10 + 1 = 121
            temp = temp / 10; // 121 / 10 = 12 , 12 / 10 = 1 , 0
        }
        if (num == rev) {
            System.out.println("Number is palidrone ");
        } else {
            System.out.println("Number is Not palidrone ");
        }
    }
}