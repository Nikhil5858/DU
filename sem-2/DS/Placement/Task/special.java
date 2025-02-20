// Special Number → A number where the sum of the factorial of its digits equals the number.
// Input: 145 → Output: 1! + 4! + 5! = 145 (Special)
// Input: 2 → Output: 2! = 2 (Special)

import java.util.Scanner;

public class special {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("Enter Number to find Special factorial");

        int num = 145;
        
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int fact = 1;
            int a = temp % 10;
            for (int i = 2; i <= a; i++) {
                fact *= i;
            }
            sum = sum + fact;
            temp = temp / 10;
            
        }
        
        System.out.println(sum);

        if (sum == num) {
            System.out.println("Number is Special ");
        }
        else{
            System.out.println("Number is Not Special ");
        }

    }
}
