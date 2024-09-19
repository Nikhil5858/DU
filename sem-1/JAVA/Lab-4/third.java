import java.util.*;
public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array : ");
        int num = sc.nextInt();
        int[] array = new int[num];
        System.out.println("Array "+num);
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("\nReverse array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
    }
    sc.close();
}
}
