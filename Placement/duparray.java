import java.util.Scanner;

public class duparray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Element : ");
        int num = sc.nextInt();

        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter Number : ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp; 
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
