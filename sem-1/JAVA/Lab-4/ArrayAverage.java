public class ArrayAverage {
    public static void main(String[] args) {
        // Create and initialize a four-integer element array
        int[] numbers = {10, 20, 30, 40};

        // Calculate the sum of the array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Display the average
        System.out.println("Average: " + average);
    }
}
