public class findtriplets {
    public static void main(String[] args) {
        int sum = 9;
        int array[] = { 1, 2, 3, 4, 5, 6, };

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == sum) {
                        System.out.println("Number of " + sum + " sum is " + array[i] + array[j] + array[k]);
                    }
                }
            }
        }
    }
}