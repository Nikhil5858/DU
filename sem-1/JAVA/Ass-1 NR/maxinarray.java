import java.util.Scanner;

public class maxinarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length : ");
        int num = sc.nextInt();

        int[] array = new int[num];
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            
            System.out.println("Enter "+(i+1)+" Number : ");
            array[i] = sc. nextInt();

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Array Element : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Max value : "+max);
        sc.close();
    }
}
