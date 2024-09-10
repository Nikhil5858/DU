import java.util.*;

public class Multiplicationtable {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number for Multiplication Table: ");
        int num = sc.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + (num * i));
            i++;
        }
        sc.close();
    }
}
