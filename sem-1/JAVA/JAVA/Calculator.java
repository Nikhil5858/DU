import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class Calculator {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int b = sc.nextInt();
        System.out.println("Enter Operation");

        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                int add = a + b;
                System.out.println("Addition is " + add);
                break;
            case '-':
                int sub = a - b;
                System.out.println("Subtraction is " + sub);
                break;
            case '*':
                int mul = a * b;
                System.out.println("Subtraction is " + mul);
                break;
            case '/':
                int div = a / b;
                System.out.println("Subtraction is " + div);
                break;

            default:
                break;
        }

    }
}
