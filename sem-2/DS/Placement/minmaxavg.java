import java.util.*;
public class minmaxavg{

    public static void main(String args[]){
        int array[] = {15,50,69,47,46,36,50,8,70};

        int sum=0;
        float avg=0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            avg = sum / array.length;
        }
        System.out.println("Avg is : "+avg);

        // =========================================================

        // int max = 0;
        // int min = array[0];
        // int sum = 0;

        // for (int i = 0; i < array.length; i++) {
        //     if(array[i]>max){
        //         max=array[i];
        //     }
        //     if (array[i]<min) {
        //         min=array[i];
        //     }
        //     int temp = max + min;
        //     sum = temp / 2;
        // }
        
        // System.out.println("Max is : "+max);
        // System.out.println("Min is : "+min);
        // System.out.println("Sum is : "+sum);

        // =========================================================


        // ArrayList<Integer> numbers = new ArrayList<>();
        // Collections.addAll(numbers, 15, 50, 69, 47, 46, 36, 50, 8, 70);

        // while (numbers.size() > 1) {
        //     int min = Collections.min(numbers);
        //     int max = Collections.max(numbers);
        //     int sum = (min + max) / 2;

        //     System.out.println("Sum is: " + sum);

        //     numbers.remove(numbers.indexOf(min));
        //     numbers.remove(numbers.indexOf(max));

        //     numbers.add(sum);

        //     System.out.println("Updated: " + numbers);
        // }
        // System.out.println("Final Value: " + numbers.get(0));
    }
}