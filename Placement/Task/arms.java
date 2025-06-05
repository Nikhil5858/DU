import java.util.Scanner;

public class arms {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        int num = 153;
        int temp = num;
        int count = 0;

        while (temp!=0) {
            temp = temp / 10;
            count++;    
        }

        int arms = 0;
        int rem = 0;
        int temp2 = num;
        int base = count;

        while (temp2 != 0) {
            rem = temp2 % 10;
            int mul = 1;
            for (int i = 1; i <= base; i++) {
                mul = mul * rem;
            }
            arms = arms + mul;
            temp2 = temp2 / 10; 
        }

        if (arms == num) {
            System.out.println("Number is Armstromg");
        }
        else{
            System.out.println("Number is Not Armstromg");
        }

    }
}
