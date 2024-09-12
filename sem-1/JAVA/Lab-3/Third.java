import java.util.Scanner;

public class Third {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3");
        int num3 = sc.nextInt();

        int total = (num1>num2 && num1>num3)?num1:(num2>num1&&num2>num3)?num2:num3;
        System.out.println(total +" Number is Big");
        sc.close();
    }
}