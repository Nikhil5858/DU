import java.util.Arrays;

public class consucative {
    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 4, 5, 78, 35, 98, 37, 36, 38, 45, 63 };

        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        int count = 2;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] == array[i] + 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
