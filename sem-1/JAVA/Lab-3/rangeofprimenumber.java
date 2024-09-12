import java.util.*;

public class rangeofprimenumber {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Enter the Range Number : [Number1  Number2] ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 < 2)
        num1 = 2;

        if (num2 < 2)
        {
            System.out.println("No prime numbers in range.");
        }

        for(int i = num1; i<=num2; i++){
            flag = false;

            for(int j = 2; j< i;j++){
                if (i%j == 0) {
                    flag = true;
                }
            }

            if (!flag) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
