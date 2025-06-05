import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;

        System.out.println("Enter Numbe to check whether is inside Fibonacci series or not : ");
        int x = sc.nextInt();
        int fact = 0;

        while (fact <= x) {
            fact = num1 + num2;
            num1 = num2;
            num2 = fact;

            if (fact == x) {
                System.out.println(x + " Found in Fibonacci series");
                return;

            }
        }
        System.out.println(x + " Not in Fibonacci series");
    }
}
