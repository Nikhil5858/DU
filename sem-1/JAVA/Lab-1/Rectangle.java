import java.util.Scanner;

/**
 * Rectangle
 */
public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int l = sc.nextInt();
        System.out.println("Enter number");
        int w = sc.nextInt();
        System.out.println("Enter Operation");
        int ans = l*w;
        System.out.println("ans is :"+ans);
    }
}