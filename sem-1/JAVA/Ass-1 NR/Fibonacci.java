import java.util.*;

public class Fibonacci {
    public static void fibonaciseris(int n) {
        int num1 = 0;
        int num2 = 1;
        
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 3; i <= n; i++) {
            int sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Terms in the Series: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        fibonaciseris(n);
        sc.close();
    }
}
