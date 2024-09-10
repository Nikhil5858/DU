import java.util.*;

public class array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Array Length : ");
        int num = sc.nextInt();

        int[] array = new int[num];
        int sum = 0;
        
        for(int i=0;i<num;i++){
            System.out.print("Enter array["+i+"]:");
            array[i] = sc.nextInt();
            sum = sum +array[i];
        }
        // for(int i=0;i<num;i++)
        // {
        //     System.out.println(array[i]);
        // }
        System.out.println("Sum of Array : " + sum);
        sc.close();
    }
}