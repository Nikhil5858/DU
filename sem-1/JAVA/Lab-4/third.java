public class ReverseArray {
    public static void main(String[] args) {
        // Given array
        int[] array = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Print array in reverse order
        System.out.println("\nReverse array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
