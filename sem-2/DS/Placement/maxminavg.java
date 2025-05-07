import java.util.Scanner;

public class maxminavg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of array : ");
        int num = sc.nextInt();
        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int avg = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
             sum += array[i];
             avg = sum / array.length;
        }

        System.out.println("Minimun Number is : "+min);
        System.out.println("Maximum Number is : "+max);
        System.out.println("Average is : "+avg);
    }
}
