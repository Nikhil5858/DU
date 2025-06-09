import java.util.Scanner;

public class revfibo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int[] revfibo = new int[num];

        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            revfibo[i] = a;
            int fibo = a + b;
            a = b;
            b = fibo;
        }

        for (int i = num - 1; i >= 0; i--) {
            System.out.print(revfibo[i] + " ");
        }
    }
}