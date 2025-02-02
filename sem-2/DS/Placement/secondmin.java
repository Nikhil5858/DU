import java.util.Scanner;

public class secondmin {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Number of Element : ");
        // int num = sc.nextInt();
        // int[] array = new int[num];

        // for (int i = 0; i < num; i++) {
        // System.out.println("Enter Number: ");
        // array[i] = sc.nextInt();
        // }

        int[] array = { 122, 52, 3, 44, 57, 6 };

        int min = array[0];
        int minsecond = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                minsecond = min;
                min = array[i];
            }
            if (array[i] > min && array[i] != min) {
                minsecond = array[i];
            }
        }

        System.out.println("Second Minimum Number is : " + minsecond);

    }
}