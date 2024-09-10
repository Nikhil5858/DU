import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        boolean flag = true;

        for (int i=2;i<num;i++) {
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
        else
        {
            System.out.println("Number is Not Prime");
        }
    }
}