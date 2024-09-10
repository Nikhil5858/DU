import java.util.*;

public class Min {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();

        System.out.println("Enter Number 3 : ");
        int num3 = sc.nextInt();

        if (num1 > num2) {

            if (num1 > num3) {
                System.out.println("Number 1 : "+ num1 +" is Big");
            }
            else
            {
                System.out.println("Number 2 : "+ num2 +" is Big");
            }

        }
        else{
            System.out.println("Number 3 : "+ num3 +" is Big");
        }
        sc.close();
    }
}
