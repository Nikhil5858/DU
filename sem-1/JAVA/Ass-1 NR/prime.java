import java.util.*;

public class prime {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        
        if (num <= 1) {
            System.out.println("Number is not prime");
        }

        for(int i=2; i < num; i++){

            if (num % i == 0) {
                flag = false;
                break;
            }
            else{
                flag = true;
            }
        }
        
        if (flag) {
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Numner is not prime");
        }
        sc.close();
    }
}