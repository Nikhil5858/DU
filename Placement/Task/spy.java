// Spy Number → A number where the sum of digits equals the product of digits
// Input: 1124 → Output: (1+1+2+4) == (1×1×2×4) → Spy
// Input: 22 → Output: (2+2) == (2×2) → Spy

import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        int num = 21;
        int temp = num;
        int sum = 0;
        int mul = 1;

        while (temp != 0) {
            int a = temp % 10;
            sum = sum + a;
            mul = mul * a;
            temp = temp / 10;
        }

        if (sum == mul) {
            System.out.println(num + " Number is Spy");
        } else {
            System.out.println(num + " Number is Not Spy");
        }

    }
}
