import java.util.Scanner;

public class prime{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no to check prime or not : ");
        int num = sc.nextInt();
        boolean flag = true;

        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(num +" Number is Prime");
        }
        else{
            System.out.println(num + " Number is not Prime");
        }

    }
}