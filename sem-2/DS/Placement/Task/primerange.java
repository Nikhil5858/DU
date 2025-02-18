import java.util.*;

public class primerange{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean flag = true ;

        System.out.println("Enter Number 1 : ");
        System.out.println("Enter Number 2 : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();


        for (int i = num1; i <= num2; i++) {
            flag=false;
            for (int j = 2; j < i; j++) {
                if ( i % j == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("["+i+"]");
            }
        }
    }
}